public class Voiture {
    private  String mark = new String();
    private  double prix;
    public Voiture(){
         mark="TOYOTA";
         prix=849000.00;
    }
    public double getPrix(){
        return prix;
    }
    public String getMark(){
        return mark;
    }
    public void setMark(String mrk){
        mark=mrk;
    }
    public void setPrix(double prx){
        prix=prx;
    }
    public void affch(){
        System.out.println("-- THIS ARE CAR'S FORMATIONS : ---");
        System.out.println("=> MARK : " + getMark());
        System.out.println("=> PRIX : " + getPrix() + "$");
    }

    
}
