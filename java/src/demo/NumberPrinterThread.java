package demo;

public class NumberPrinterThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    try {
                        Thread.sleep(5000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start(); 
    }
}