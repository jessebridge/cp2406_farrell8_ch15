
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    final int SMALL =15;
    final int LARGE = 25;
    int size = SMALL;
    boolean isSmaller = true;
    JButton Button1  = new JButton("Times Roman");
    JButton Button2 = new JButton("Arial");
    JButton Button3 = new JButton("Algerian");
    JButton Button4 = new JButton("Courier");
    JButton Button5 = new JButton("Helvetica");
    JButton sizeButton = new JButton("Larger/Smaller");
    JPanel p = new JPanel();
    Font font1 = new Font("Courier",Font.PLAIN,size);
    Font font2 = new Font("Helvetica",Font.PLAIN,size);
    Font font3 = new Font("Times New Roman",Font.PLAIN,size);
    Font font4 = new Font("Arial", Font.PLAIN,size);
    Font font5 = new Font("Algerian",Font.PLAIN,size);
    Font myFont = font1;
    JLabel lable = new JLabel("Font Demo Message");

    public JFontSelector(){
        setTitle("JFontFrame.exe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(Button1);
        add(Button2);
        add(Button3);
        add(Button4);
        add(Button5);
        add(sizeButton);
        add(lable);
        lable.setFont(font1);
        add(p);
        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        Button4.addActionListener(this);
        Button5.addActionListener(this);
        sizeButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JFontSelector newFont = new JFontSelector();
        newFont.setSize(500,200);
        newFont.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button1){
            myFont = font1;
        }
        else if(e.getSource()== Button2){
            myFont = font2;
        }
        else if(e.getSource() == Button3){
            myFont = font3;
        }
        else if(e.getSource() == Button4){
            myFont = font4;
        }
        else if (e.getSource() == Button5){
            myFont = font5;
        }
        else if(e.getSource() == sizeButton){
            if(isSmaller){
                myFont = myFont.deriveFont(Font.PLAIN,LARGE);
                isSmaller = false;
            }
            else{
                myFont = myFont.deriveFont(Font.PLAIN,SMALL);
                isSmaller= true;
            }

        }
        lable.setFont(myFont);
    }
}
