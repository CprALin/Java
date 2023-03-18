import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deletePhoneWindow extends JFrame{
    /* here is delete window */
      private JButton delete;
      private JTextField name;
      private EventDP e;

      public deletePhoneWindow(){
           super("DeletePhone");

           JPanel p = new JPanel();
          
           p.setLayout(new GridLayout(3,1,10,10));
           p.setBackground(Color.gray);

           JLabel nameL = new JLabel("Name:");
           name = new JTextField(10);

           p.add(nameL);
           p.add(name);

           delete = new JButton("Delete");

           p.add(delete);

           e = new EventDP();

           delete.addActionListener(e);

           add(p);

           setSize(400,400);
           setLocationRelativeTo(null);
           setVisible(true);
           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      }

      private class EventDP implements ActionListener {
          private dataEvent de;
          
          EventDP(){
             de = dataEvent.getInstance(); 
          }

          public void actionPerformed(ActionEvent e){
              if(e.getSource() == delete){
                  de.deletePhone(name.getText());

                  name.setText("");
              }
          }
      }

    
}
