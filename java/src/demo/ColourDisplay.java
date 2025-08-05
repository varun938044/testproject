package demo;

import java.util.Random;

public class ColourDisplay implements Runnable {

  
    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
    
    
    public void run() {
        Random random = new Random();
        while (true) {
            int index = random.nextInt(colours.length); 
            String colour = colours[index];
            System.out.println("Colour: " + colour);

            if (colour.equals("red")) {
                System.out.println("Red found! Stopping the display.");
                break;
            }

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

   
    public static void main(String[] args) {
        ColourDisplay displayTask = new ColourDisplay();
        Thread thread = new Thread(displayTask);
        thread.start();
    }
}