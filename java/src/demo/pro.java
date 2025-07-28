package demo;

class Box {
    double width, height, depth;

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }
}

public class pro {
    public static void main(String[] args) {
        // Create object of Box
        Box myBox = new Box(5.0, 3.0, 2.0);

        // Print the volume
        System.out.println("Volume of the box is: " + myBox.getVolume());
    }
}
