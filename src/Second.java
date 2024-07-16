import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
  int user_age;
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        user_age = sc.nextInt();

        if (user_age>=18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}
