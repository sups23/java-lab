class Main {
    public static void main(String[] args) {
        ChildThread obj1 = new ChildThread("Thread 1");
        ChildThread obj2 = new ChildThread("Thread 2");
        ChildThread obj3 = new ChildThread("Thread 3");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class ChildThread implements Runnable {
    String name;

    ChildThread(String name) {
        this.name = name;
    }
    
    public void run() {
        System.out.println("Thread Name: " + name + ", Priority: " + Thread.currentThread().getPriority());
    }
}
