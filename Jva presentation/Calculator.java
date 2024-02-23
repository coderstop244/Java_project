import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int a =sc.nextInt();
        System.out.println("Enter the second number:-");
        int b =sc.nextInt();
        System.out.println("Enter the case number:-");
        int n =sc.nextInt();
        switch(n){
            case 1:
            System.out.println(" Sum is:"+ (a+b));
            break;
            case 2:
            System.out.println("Subtraction is:"+ (a-b));
            break;
            case 3:
            System.out.println("Multiplication is:"+(a*b));
            break;
            case 4:
            System.out.println("Division is:"+(a/b));
            break;
            case 5:
            System.out.println("Remainder is:"+ (a%b));
            break;
            default:
            System.out.println("Invalid");
        }
        

    }

}