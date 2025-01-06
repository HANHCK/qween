import java.util.Scanner;
public class parite {
    public static void main(String[] args){
        System.out.println("We want to study the parity of numbers : ");
        System.out.println("Enter a number :");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        if(num % 2==0){
            System.out.println(num + "  is a pair number.");
        } else{
            System.out.println(num+ "  is an odd number");
        }
        System.out.println("Au revoir !");
    }
    
}
