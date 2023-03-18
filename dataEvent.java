import java.io.*;

import javax.swing.JOptionPane;

/* here are data events */

public class dataEvent {
    private dataPhone dp;

     private static dataEvent instance;

     public void addPhone(String name,String number){
        dp = new dataPhone(name, number);

        try(FileWriter fw = new FileWriter("data.txt", true)){
             BufferedWriter bw = new BufferedWriter(fw);
             
             bw.write(dp.toString());

             bw.newLine();

             bw.close();
             fw.close();
        }catch(IOException io){
            io.printStackTrace();
        }
     }

     public String searchPhone(String name){
         try(FileReader fr = new FileReader("data.txt")){
              BufferedReader br = new BufferedReader(fr);
              String line;
              while(( line =br.readLine()) != null){
                 if(line.contains(name)){
                      return line;   
                 }
              }  
  
         }catch(IOException io){
            io.printStackTrace();
         }
        return "Phone number was not find!";
     }

     public void deletePhone(String name){
         try(FileReader fr = new FileReader("data.txt")){
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null){
                if(line.contains(name)){
                    line.replace(line, "");
                }
            }
            br.close();
            fr.close();

            JOptionPane.showMessageDialog(null, "Phone number was removed!", "Information", JOptionPane.INFORMATION_MESSAGE);

         }catch(IOException io){
            io.printStackTrace();
         }
     }

     public String showPhone(){
         try(FileReader fr = new FileReader("data.txt")){
              
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null){
                return line;
            }
            
            br.close();
            fr.close();
         }catch (IOException io) {
            io.printStackTrace();
         }
         return "No numbers has been added!"; 
     }

     public static dataEvent getInstance(){
         if(instance == null){
            instance = new dataEvent();
         }
         return instance;
     }
}
