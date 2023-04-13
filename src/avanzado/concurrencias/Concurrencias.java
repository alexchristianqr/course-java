package avanzado.concurrencias;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class EjemploExecutor {
    public static void main(String[] args) {

        // Creamos un executor con un pool de 4 threads
        Executor executor = Executors.newFixedThreadPool(4);

        // Creamos una tarea que se ejecutará en segundo plano
        Runnable tarea = new Runnable() {
            public void run() {
                // Hacemos que la tarea espere 5 segundos
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tarea finalizada en 5 segundos...");
            }
        };

        // Ejecutamos la tarea con el executor
        executor.execute(tarea);

        // Continuamos con la ejecución del programa
        System.out.println("Programa continuando...");

    }
}

class EjemploAtomicInteger {
    public static void main(String[] args) {

        // Creamos un AtomicInteger con valor inicial de 0
        AtomicInteger contador = new AtomicInteger(0);

        // Creamos 4 threads que incrementan el contador
        for (int i = 0; i < 4; i++) {
            System.out.println("-- start thread -- " + LocalTime.now());
            new Thread(() -> {
                for (int j = 0; j < 1000000000; j++) {
                    contador.incrementAndGet();
                }
                System.out.println("-- final thread -- " + LocalTime.now());
            }).start();
        }

        // Esperamos a que los threads terminen
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimimos el valor final del contador
        System.out.println("Contador: " + contador.get());

    }
}

class EjemploCompletableFuture {
    public static void main(String[] args) {

        // Creamos un CompletableFuture que ejecuta una tarea en segundo plano
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulamos una tarea de larga duración
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Tarea finalizada";
        });

        // Continuamos con la ejecución del programa mientras esperamos a que la tarea se complete
        System.out.println("Programa continuando...");

        // Esperamos a que la tarea se complete y obtenemos el resultado
        String resultado = future.join();

        // Imprimimos el resultado de la tarea
        System.out.println(resultado);

    }
}