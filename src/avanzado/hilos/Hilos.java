package avanzado.hilos;

 class EjemploThread extends Thread {
    public static void main(String[] args) {
        Thread thread = new EjemploThread();
        thread.start();
    }
}

 class EjemploThreadRunnable implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new EjemploThreadRunnable());
        thread.start();
    }

    @Override
    public void run() {
        Thread t = new Thread(new EjemploThreadRunnable());
        t.start();

    }
}
