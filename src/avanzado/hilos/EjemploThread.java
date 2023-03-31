package avanzado.hilos;

 class EjemploA extends Thread {
    public static void main(String[] args) {
        Thread thread = new EjemploA();
        thread.start();
    }
}

 class EjemploB implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new EjemploB());
        thread.start();
    }

    @Override
    public void run() {
        Thread t = new Thread(new EjemploB());
        t.start();

    }
}
