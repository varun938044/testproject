package demo;

public class ThreadNameExample {

    public static void main(String[] args) {
        
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }, "Scooby");

        
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }, "Shaggy");

        
        thread1.start();
        thread2.start();
    }
}