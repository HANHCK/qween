public class Rectangle {
    public double lng,lrg;
    public Rectangle(double lngo,double lrgo){
        lng = lngo;
        lrg = lrgo;
    }
    public double surface(double tol,double ard){
        return tol*ard;
    }
    public double perimetre(double lot,double dra){
        return lot*2+dra*2;
    }
    public void affiche(){
        System.out.println("for a rectangle of lengh " + lng + " and width " 
        + lrg + "\n  --- SURFACE : " + surface(lng, lrg) + "\n   --- PERIMETR : " 
        + perimetre(lng, lrg));
    }
}
