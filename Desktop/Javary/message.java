
import java.util.Scanner;
public class message {
    public static void main(String[] args) {
        String messag;
        System.out.println("Please enter your name : ");
        Scanner keyboard = new Scanner(System.in);
        messag = keyboard.nextLine();
        System.out.println("Hello " + messag + " in JAVA learning");
        keyboard.close();
    }
}
