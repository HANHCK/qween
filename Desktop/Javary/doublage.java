import java.util.Scanner;
public class doublage {
    public static void main(String[] args) {
        System.out.println("hello ");
        System.out.println("entrer un nombre s'il vous plait :  ");
        Scanner key = new Scanner(System.in);
        int number = key.nextInt();
        number *=number;
        System.out.println("le double du nombre saiser est : " + number);
        System.out.println("Au revoire");
        key.close();

    }
    
}
