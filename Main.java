import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator !!");
        System.out.println("Note : Enter Valid Numbers!");
        Scanner scan = new Scanner(System.in);
        int notUsed = 0; // Only used to run while loop with true condition.

/*we created loop for calculating numbers unlimited times!
( IF YOU could not understand than run this code you will understand)*/
        while(true){
            System.out.println("Please Enter A 1st Number : ");
            int num1 = scan.nextInt();
            System.out.println("Please Enter A Operator like +,-,*,/");
            String operator = scan.next();
            System.out.println("Please Enter A 2nd Number : ");
            int num2 = scan.nextInt();
//            we also use if else statement instead of switch statement
            switch (operator){
                case "+":
                    System.out.println("Your Result " +"\""+ (num1 + num2)+"\"");  break;
                case "-":
                    System.out.println("Your Result " +"\""+ (num1 - num2)+"\""); break;
                case "*":
                    System.out.println("Your Result " +"\""+ (num1 * num2) +"\""); break;
                case "/":
                    System.out.println("Your Result " +"\""+ (num1 / num2)+"\""); break;
                default:
                    System.out.println("Your Result Invalid Number!"); break;
            }
            System.out.println("Lets Calculate Again!");
        }
    }
}