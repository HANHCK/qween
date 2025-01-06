
import java.util.Scanner;

public class TestVoiture {
    public static void main(String[] args) {
        Voiture vtr = new Voiture();
        System.out.println("  HELLO DEARLING :");
        System.out.println("==> Default informaton :");
        vtr.affch();
        System.out.println("--> Inserted new car's information :");
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME OF MARK : ");
        String kmr = sc.nextLine();
        System.out.println("PRIX         : ");
        double xrp = sc.nextDouble();
        vtr.setMark(kmr);
        vtr.setPrix(xrp);
        vtr.affch();
        sc.close();
        
    }
    
}
