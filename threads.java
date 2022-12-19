class Main {
    public static void main(String[] args) {
        A thread = new A();
        thread.start();

        B t = new B();
        Thread obj = new Thread(t);
        obj.start();
    }
}

class A extends Thread {
    public void run() {
        System.out.println("Running inside thread via Thread class extension/inheritance.");
    }
}

class B implements Runnable {
    public void run() {
        System.out.println("Running inside thread via Runnable Interface.");
    }
}
