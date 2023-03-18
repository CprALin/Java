import javax.swing.*;

public class showPhoneWindow extends JFrame{
     /* here is the phones presentation window */
       private JTextArea ta;
       private dataEvent de;

       public showPhoneWindow(){
            super("ShowPhones");

            JPanel p = new JPanel();

            ta = new JTextArea();

            p.add(ta);

            add(p);
            
            de = dataEvent.getInstance();

            ta.append(de.showPhone());

            setSize(400,400);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       }
}
