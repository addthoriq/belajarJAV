import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class tugas01
{
    public static void main( String[] args ){
        
        ImageIcon miku = new ImageIcon("miku.png");
        ImageIcon miku02 = new ImageIcon("miku02.png");
        ImageIcon miku03 = new ImageIcon("miku03.png");
        ImageIcon miku04 = new ImageIcon("miku04.png");
        ImageIcon miku05 = new ImageIcon("miku05.png");
        
        ImageIcon ichika = new ImageIcon("ichika.png");
        ImageIcon nino = new ImageIcon("nino.png");
        ImageIcon yotsuba = new ImageIcon("yotsuba.png");
        ImageIcon itsuki = new ImageIcon("itsuki.png");
        
        String judul = "Tugas PBO 01";
        
        JOptionPane.showMessageDialog(null, "Kenalan yuk", judul, JOptionPane.PLAIN_MESSAGE, miku);
        JOptionPane.showMessageDialog(null, "Namaku Nakano Miku", judul, JOptionPane.PLAIN_MESSAGE, miku);

        String nama = (String) JOptionPane.showInputDialog(null, "Nama kamu siapa?", judul, JOptionPane.PLAIN_MESSAGE, miku, null, null);

        if (!nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hai " + nama + " senang berkenalan denganmu", judul, JOptionPane.PLAIN_MESSAGE, miku02);
            
            int opsi = JOptionPane.showConfirmDialog(null, "Aku punya 4 saudari kembar, apakah kamu ingin mengenal mereka?", judul, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, miku);
            
            switch(opsi){
                case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(null, "Baik, mari kuperkenalkan " + nama + " dengan saudari kembarku", judul, JOptionPane.PLAIN_MESSAGE, miku03);
                    
                    // int keluar = 0;
                    String kenalan;
                    
                    do {
                        String[] listSaudari = {"Ichika", "Nino", "Yotsuba", "Itsuki"};
                        
                        kenalan = (String) JOptionPane.showInputDialog(null, "Mau berkenalan dengan siapa?", judul, JOptionPane.OK_CANCEL_OPTION, miku04, listSaudari, listSaudari[0]);
                         
                        String dialog = "";
                         
                        if (kenalan != null) {
                            switch(kenalan) {
                                case "Ichika":
                                    dialog =  "Hai..Hai..! namaku " + kenalan + ". Aku ini anak pertama loh! \nJadi, panggil aku kakak yaa "+nama+"..!";
                                    
                                    JOptionPane.showMessageDialog(null, dialog , judul,  JOptionPane.YES_OPTION, ichika);
                                     
                                    break;
                                case "Nino":
                                    dialog = "Hai namaku " + kenalan + ". Aku adiknya Ichika dan kakaknya Miku \nsenang berkenalan denganmu!";
                                    
                                    JOptionPane.showMessageDialog(null, dialog, judul,  JOptionPane.YES_OPTION, nino);
                                    
                                    break;
                                case "Yotsuba":
                                    dialog = "Halooo..!! Perkenalkan, namaku " + kenalan + "! \nMeskipun aku anak keempat, tapi staminaku nomor satu diantara saudari-saudariku! \nNamamu " + nama + " kan? Senang berkenalan denganmu, " + nama + "!";
                                    
                                    JOptionPane.showMessageDialog(null, dialog, judul, JOptionPane.YES_OPTION, yotsuba);
                                    
                                    break;
                                case "Itsuki":
                                    dialog = "Halo, namaku " + kenalan + ". Aku anak terakhir, tapi walaupun aku anak terakhir. \nAku berjanji akan menjadi seperti ibuku di masa depan!";
                                    
                                    JOptionPane.showMessageDialog(null, dialog, judul, JOptionPane.YES_OPTION, itsuki);
                                    
                                    break;
                             };
                        }
                    } while (kenalan != null);
                    
                    JOptionPane.showMessageDialog(null, "Baiklah, itu tadi saudari-saudariku. Aku harap kamu dapat membedakan mereka ya \nTerima kasih banyak " + nama + "! Sampai berjumpa lagi!", judul, JOptionPane.PLAIN_MESSAGE, miku04);
                    
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null, "Baiklah, terima kasih banyak", judul, JOptionPane.PLAIN_MESSAGE, miku05);
                    
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Terima kasih banyak", judul, JOptionPane.PLAIN_MESSAGE, miku05);
            System.exit(0);
        }
    }
}