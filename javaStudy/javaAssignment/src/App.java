import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter number you want : "  );
        // int number = input.nextInt();

        // Cau9 cau9 = new Cau9(number);
        // System.out.println("Your ouput when using stack : " +  cau9.usingStack() );
        // System.out.println("Your ouput when using queue : " +  cau9.usingQueue() );

        Cau3 cau3 = new Cau3("((a+b)+((x)) + ((y)))");
        for( String x : cau3.checkduplicate()) {
            System.out.println("duplicated : (" + x + ")");
        }
    }
}
