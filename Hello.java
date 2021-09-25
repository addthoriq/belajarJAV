import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Hello
{
    /*
    public static void main ( String[] args ){
        System.out.println("Hello");
        System.out.println("Wold");
    }
    public static void main ( String[] args ) {
        ImageIcon gambarIcon = new ImageIcon("miku.png");
        JOptionPane.showMessageDialog(null, "Miku: Thoriq-kun", "Dapat pesan dari bebeb", JOptionPane.PLAIN_MESSAGE, gambarIcon);
    }
    */
    
    public static void main ( String[] args ) {
        ImageIcon gambarIcon = new ImageIcon("miku.png");
        
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama anda : ", "Perkenalan", JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Hello "+nama, "Dapat pesan dari bebeb", JOptionPane.PLAIN_MESSAGE, gambarIcon);
    }
}
