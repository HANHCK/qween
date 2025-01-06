
import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("===> We want calculat surface and perimter for rectangle :");
        Scanner sc = new Scanner(System.in);
        System.out.println("--> ENTER LENGTH :");
        double lgr=sc.nextDouble();
        System.out.println("--> ENTER WIDTH  :");
        double lrr=sc.nextDouble();
        Rectangle recto = new Rectangle(lgr,lrr);
        recto.affiche();
        sc.close();
    }
    
}
