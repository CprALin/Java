import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow extends JFrame{
    private EventMW e;
    private JButton[] b;
    
    public mainWindow(){

        super("PhoneBook");
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,2,5,5));
        p.setBackground(Color.gray);

        String[] s = new String[]{"Add Phone","Search Phone","Delete Phone","Show Phone"};

        e = new EventMW();

        b = new JButton[4];

        for(int i=0; i<b.length;i++){
            b[i] = new JButton(s[i]);
            b[i].addActionListener(e);
            p.add(b[i]);
        }

        add(p);

        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private class EventMW implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == b[0]){
                new addPhoneWindow();
            }else if(e.getSource() == b[1]){
                new searchPhoneWindow();
            }else if(e.getSource() == b[2]){
                new deletePhoneWindow();
            }else if(e.getSource() == b[3]){
                new showPhoneWindow();
            }else{
                
            } 
        }
    }
}
