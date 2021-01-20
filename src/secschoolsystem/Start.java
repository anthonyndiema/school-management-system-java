package secschoolsystem;
import java.awt.*;
import javax.swing.*;
public class Start extends JWindow {
private int duration;
public Start(int d) {
    duration = d;
}
public void showSplash() {

    JPanel content = (JPanel)getContentPane();
    content.setBackground(Color.blue);
   int width = 250;
    int height = 200;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width-width)/2;
    int y = (screen.height-height)/2;
    setBounds(x,y,width,height);
JLabel label = new JLabel(new ImageIcon("C:\\Users\\NDIEMA\\Desktop\\images.jpg"));
    JLabel copyrt = new JLabel("SCHOOL MANAGEMENT SYSTEM LOADING...", JLabel.CENTER);
    copyrt.setFont(new Font("Sans-Serif", Font.ITALIC, 10));
    content.add(label, BorderLayout.CENTER);
    content.add(copyrt, BorderLayout.SOUTH);
    label.setSize(40,40);
    content.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 5));
 setVisible(true);
try { Thread.sleep(duration); } catch (Exception e) {}

    setVisible(false);
}
public void showSplashAndExit() {
    showSplash();
    dispose();
   }
public static void main(String[] args) {
Start splash = new Start(10000);
splash.showSplashAndExit();
    
     home h=new home();
                      h.setExtendedState(JFrame.MAXIMIZED_BOTH);
                       h.setLocation(100,50);
                       h.setVisible(true);
}
}