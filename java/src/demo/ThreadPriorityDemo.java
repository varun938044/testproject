package demo;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("High Priority Thread - " + i);
            }
            System.out.println("High Priority Thread Completed");
        });

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Low Priority Thread - " + i);
            }
            System.out.println("Low Priority Thread Completed");
        });

        Thread normalPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Normal Priority Thread - " + i);
            }
            System.out.println("Normal Priority Thread Completed");
        });

        
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);   
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);    
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY); 

       
        highPriorityThread.start();
        lowPriorityThread.start();
        normalPriorityThread.start();
    }
}