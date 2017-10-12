import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorFrame extends JFrame implements ActionListener {
    JButton colorButton = new JButton("Change colors");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    int clickCount = 0;

    public JColorFrame(){
        super("JColorFrame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cont = this.getContentPane();
        cont.setLayout(new BorderLayout());
        panel1.add(colorButton);
        cont.add(panel1,BorderLayout.CENTER);
        cont.add(panel2,BorderLayout.NORTH);
        cont.add(panel3,BorderLayout.SOUTH);
        cont.add(panel4,BorderLayout.WEST);
        cont.add(panel5,BorderLayout.EAST);
        colorButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JColorFrame cFrame = new JColorFrame();
        cFrame.setSize(500,500);
        cFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(clickCount%5 == 0){
            panel2.setBackground(Color.blue);
        }
        else if(clickCount%5 ==1){
            panel5.setBackground(Color.green);
        }
        else if(clickCount%5 == 2){
            panel3.setBackground(Color.magenta);
        }
        else if(clickCount%5 ==3){
            panel4.setBackground(Color.pink);
        }
        else{
            panel2.setBackground(Color.white);
            panel3.setBackground(Color.white);
            panel4.setBackground(Color.white);
            panel5.setBackground(Color.white);
        }
        ++clickCount;
    }
}
