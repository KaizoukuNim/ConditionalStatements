import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num1,num2,num3;
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        System.out.println("Enter third number");
        num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Number 1 is greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Number 2 is greatest");
        }
        else if(num3>num1 && num3>num2){
            System.out.println("Number 3 is greatest");

        }
        else {
            System.out.println("Value error");
        }
     }
}