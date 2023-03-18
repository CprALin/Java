import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addPhoneWindow extends JFrame{
    /* here u add phone numbers */
    private JButton add;
    private TextField name, phone;
    private EventPW e;

    public addPhoneWindow(){
        super("AddPhone");

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6,1,5,5));
        p.setBackground(Color.gray);
        
        JLabel nameL = new JLabel("Name: ");
        name = new TextField(10);

        JLabel phoneL = new JLabel("Phone: ");
        phone = new TextField(10);

        add = new JButton("Add");

        p.add(nameL);
        p.add(name);
        p.add(phoneL);
        p.add(phone);
        p.add(add);

        e = new EventPW();

        add.addActionListener(e);

        add(p);

        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private class EventPW implements ActionListener  {
        private dataEvent de;

        EventPW(){
            de = dataEvent.getInstance();
        }

        public void actionPerformed(ActionEvent e){
            if(e.getSource() == add){
                de.addPhone(name.getText(), phone.getText());

                name.setText("");
                phone.setText("");

                JOptionPane.showMessageDialog(add, "Phone has been add!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
