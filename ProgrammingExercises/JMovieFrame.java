import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {
    JButton north = new JButton("Nacho libre");
    JButton south = new JButton("Sabotage");
    JButton east = new JButton("Eastern promises");
    JButton west = new JButton("Western");
    JLabel label = new JLabel();

    public JMovieFrame(){
        setTitle("Movie Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(label, BorderLayout.CENTER);
        north.addActionListener(this);
        south.addActionListener(this);
        east.addActionListener(this);
        west.addActionListener(this);



    }

    public static void main(String[] args) {
        JFrame frame = new JMovieFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String text = " ";
        if(source== north){
            text = " From somewhere in the north, Joe blow stars in it, came out 2007";

        }
        else if(source== south){
            text = "From somewhere in the south, John smith stars in it, came out 2005";
        }
        else if(source == west){
            text = "From somewhere in the west, John doe stars in it, came out 2001";
        }
        else if(source == east){
            text = "From somewhere in the east, jane doe stars in it, came out 2005";
        }
        label.setText(text);
        repaint();
    }
}
