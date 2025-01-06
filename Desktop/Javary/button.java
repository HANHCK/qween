import javax.swing.JButton;
import javax.swing.JFrame;
public class button {
    JFrame frame ;
button(){
    frame = new JFrame(); 
    JButton bttn = new JButton("KLICK");
    bttn.setBounds(120,220,80,40);
    frame.add(bttn);
    frame.setSize(400,400);
    frame.setVisible(true);
    frame.setLayout(null);


}



    public static void main(String[] args) {
         new button();
    
    }
}
