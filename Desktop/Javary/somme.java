import java.util.Scanner;
public class somme {
    public static void main(String[] args) {
        System.out.println("We want calculate the sum of ' N ' term");
        int trm = 0 ;
        Scanner key = new Scanner(System.in);
        int numr=3;
        do{
        System.out.println("enter N : ");
        numr = key.nextInt();
        }while(numr < 0);
        for(int i=0;i<=numr;i++){
            trm+=i;
        }
        System.out.println("--> sum of "+ numr + "terms is "+ trm);
        System.out.println("Au revoir !");
        
    }

    
}
