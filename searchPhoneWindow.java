import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class searchPhoneWindow extends JFrame{
    
    /* here you can see all phone numbers */
    
    private JButton search;
     private JTextField name;
     private EventPW e;
     private TextArea ta;

     public searchPhoneWindow(){

         super("SearchPhone");

         JPanel p = new JPanel();

         p.setLayout(new GridLayout(4,1,10,10));
         p.setBackground(Color.GRAY);

         JLabel nameL = new JLabel("Name: ");
         name = new JTextField(10);

         p.add(nameL);
         p.add(name);

         ta = new TextArea();
         p.add(ta);
         
         search = new JButton("Search");
         p.add(search);

         add(p);

         e = new EventPW();

         search.addActionListener(e);

         setSize(400,400);
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }

     private class EventPW implements ActionListener {
          private dataEvent de;

          EventPW(){
              de = dataEvent.getInstance();
          }

          public void actionPerformed(ActionEvent e){
              
            if(e.getSource() == search){
                ta.setText("");
               
                ta.append(de.searchPhone(name.getText())); 

                 name.setText("");
            }

          }
     }

    
}
