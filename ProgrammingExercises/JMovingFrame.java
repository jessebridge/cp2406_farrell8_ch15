import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener {
    Container con = getContentPane();
    final int MAX = 8;
    JPanel[] panel = new JPanel[8];
    JButton button = new JButton("press");
    JLabel[] blanklabel = new JLabel[MAX];
    int x=0, y;

    public JMovingFrame(){
        con.setLayout(new GridLayout(3,3));
        setTitle("Moving Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        con.add(button);
        button.addActionListener(this);
        for (y =0; y<MAX;++y){
            blanklabel[y] = new JLabel();
            panel[y] = new JPanel();
            con.add(panel[y]);
            panel[y].add(blanklabel[y]);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        blanklabel[x].setText("     ");
        ++x;
        if(x == MAX){
            x = 0;
        }
        blanklabel[x].setText("HELLO IM HERE");
    }

    public static void main(String[] args) {
        JMovingFrame newFrame = new JMovingFrame();
        newFrame.setSize(500,500);
        newFrame.setVisible(true);
    }
}
