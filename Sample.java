import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        while(true){
        System.out.println("Enter the first number to sum:");
        int i = new Scanner(System.in).nextInt();
        System.out.println("Enter the second number to sum:");
        int j=new Scanner(System.in).nextInt();
        System.out.println( i+j );
            }
    }
}
