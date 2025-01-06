import java.util.Scanner;

public class max {
    public static void main(String[] args){
        System.out.print("Slm,we want to determin maximum :");
        System.out.println("enter first number :");
        Scanner key = new Scanner(System.in);
        int num1 = key.nextInt();
        System.out.println("enter second number :");
        int num2 = key.nextInt();
        int max = ((num1 <= num2) ? num2 : num1);
        System.out.println("the maximum between this number is : " + max);
        System.out.println("au revoir");
        key.close();


    }
    
}
