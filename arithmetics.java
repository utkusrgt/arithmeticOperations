import java.util.Scanner;
public class arithmetics {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.println("Let's calculate a+b*c-b, please enter the numbers! ");
        System.out.print("Please enter the number a : " );
        a = inp.nextInt();

        System.out.print("Please enter the number b : " );
        b = inp.nextInt();

        System.out.print("Please enter the number c : " );
        c = inp.nextInt();

        int sum = (a+b*c-b);
        System.out.println("Your answer is " + sum + "!");

    }
}
