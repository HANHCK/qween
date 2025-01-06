import java.util.Scanner;
public class compt {
    public double solde = 0.0;
        public compt(double sld){
            solde += sld;
        }
        public void deposer(){
            System.out.println("  HELLO CUSTMER ");
            System.out.println("Here money payment :");
            System.out.println("Enter the money value want to pay : ");
            Scanner key = new Scanner(System.in);
            double versement = key.nextDouble();
            this.solde += versement;

        }
        public void retirer(){
            System.out.println("Here money withdraw:");
            System.out.println("Enter the money value want to remove :");
            Scanner key = new Scanner(System.in);
            double retir = key.nextDouble();
            double nsold = solde-retir;
            if(nsold < 0){
                System.out.println("--> Oops! you cannt remove this value of money .");
            }
            if (nsold==0) {
                System.out.println("--> Oops! yoer compt is empty.");
                solde = 0;
                
            } else {
                System.out.println("---> OPERATION SUCCESS !");
                solde = nsold;
            }
            System.out.println("--- AFTER OPERATION ---");
            System.out.println(" REST OF MONEY IS : " + solde);
        }
            public void afficher(){
                 System.out.println("rest of money is " + solde);
            }



        
        public static  void main(String[] args) {

            System.out.println("  HELLO CUSTMER ");
            System.out.println("enter value of many want to pay : ");
            Scanner sc = new Scanner(System.in);
            double payment = sc.nextDouble();
            compt compte = new compt(payment);
            compte.afficher();
            compte.retirer();
            compte.afficher();
            compte.deposer();
            compte.afficher();
            compte.retirer();
            compte.afficher();
            sc.close();
        }
        
}
