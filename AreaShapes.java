 mport java.util.Scanner;

class AreaShapes {

    // Area of Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Area of Triangle
    double area(float base, float height) {
        return 0.5 * base * height;
    }

    // Area of Square
    int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaShapes obj = new AreaShapes();
AreaShapes.java
AreaShapes.java: command not found
mca@mca-OptiPlex-390:~$ 

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + obj.area(r));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.println("Area of Rectangle = " + obj.area(l, w));
                break;

            case 3:
                System.out.print("Enter base: ");
                float b = sc.nextFloat();
                System.out.print("Enter height: ");
                float h = sc.nextFloat();
                System.out.println("Area of Triangle = " + obj.area(b, h));
                break;

            case 4:
                System.out.print("Enter side: ");
                int s = sc.nextInt();
                System.out.println("Area of Square = " + obj.area(s));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
