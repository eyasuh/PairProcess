import java.util.Scanner;
public class PairProcess {
    public static void main(String[] args) {
        int num1, num2, sum, product;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        keyboard.nextLine();

        sum = num1 + num2;
        product = num1 * num2;

        if (sum > 200 && sum <1000) System.out.println("sum: " + sum +"*~" + "\nproduct: " + product + "\naverage: " + sum/2);
        else if( sum > 1000) System.out.println("sum: " + sum +"*" + "\nproduct: " + product + "\naverage: " + sum/2);
        else System.out.println("sum: " + sum +"\nproduct: " + product + "\naverage: " + sum/2);


    }
}
