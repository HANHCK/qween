import java.util.Scanner;
public class Favorite{
    public static void main(String[] args){
        int number;
        Scanner sc =new Scanner(System.in);
        System.out.println("what's your favorit number: ");
        number=sc.nextInt();
        System.out.println("your favorite number is : "+number);
        sc.close();
    }
}
