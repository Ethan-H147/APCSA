
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
        System.out.println("How many pounds of strawberries do you want?");
        strawberry = scan.nextInt();
        System.out.println("How many watermelons do you want?");
        watermelon = scan.nextInt();
        System.out.println("****************************************");
        System.out.println(" I'm too lazy to actually put words     ");
        System.out.println(" here. So I will just type some random  "); 
        System.out.println(" things here. Just ignore what I just   ");
        System.out.println(" wrote, I'm just making this look like  ");
        System.out.println(" an actual receipt.                     ");
        System.out.println("****************************************");
        if(apple != 0){
        System.out.println(" Apple         "+apple+"      1.49      "+1.49*apple);
        }
        if(banana != 0){
        System.out.println(" Banana        "+banana+"      1.19      "+1.19*banana);
        }
        if(pear != 0){
        System.out.println(" Pear          "+pear+"      2.29      "+2.29*pear);
        }
        if(strawberry != 0){
        System.out.println(" Strawberry    "+strawberry+"      3.59      "+3.59*strawberry);
        }
        if(watermelon != 0){
        System.out.println(" Watermelon    "+watermelon+"      4.99      "+4.99*watermelon);
        }
        double total = 1.49*apple+1.19*banana+2.29*pear+3.59*strawberry+4.99*watermelon;
        System.out.println("Tax            "+total*0.07);
    }

}
