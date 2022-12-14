import java.util.Scanner;

public class diff {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
    
        double a = in.nextDouble();
    
        double b = in.nextDouble();
    
        double value = a - b;
    
        System.out.println("Enter a: ");
    
        a = in.nextDouble();
    
        System.out.println("Enter b: ");
    
        b = in.nextDouble();
    
        //If value is negative...make it a positive number.
    
        value = (value < 0) ? -value : value;
    
        System.out.println(a + "-" + b + "=" + (a - b));
    
        System.out.println(b + "-" + a + "=" + (b - a));
    
    }
    
    }

