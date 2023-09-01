
import java.util.Scanner;

public class Receipt{
    public static void main(String[] args)
    {
        System.out.println("Hello, dear customer! Welcome to my store!");
        System.out.println("We have apples, bananas, pears, strawberries and watermelons here. High quality guaranteed.");
        Scanner scan = new Scanner(System.in);
        int apple;
        int banana;
        int pear;
        int strawberry;
        int watermelon;
        System.out.println("How many apples do you want?");
        apple = scan.nextInt();
        System.out.println("How many banana do you want?");
        banana = scan.nextInt();
        System.out.println("How many pears do you want?");
        pear = scan.nextInt();
        System.out.println("How many strawberries do you want?");
        strawberry = scan.nextInt();
        System.out.println("How many watermelons do you want?");
        watermelon = scan.nextInt();
        System.out.println("****************************************");
        System.out.println(" I'm too lazy to actually put words     ");
        System.out.println("*here. So I will just type some random *"); 
        System.out.println(" words here. Just ignore what I just    ");
        System.out.println("*wrote, I'm just making this look like *");
        System.out.println(" an actual receipt.                     ");
    }
}
