import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class signin {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel userLabel;
    private JLabel pinLabel;
    public static String username ;
    public static String pin;

    public signin(){

        textField1.setSize(100,100);
//        WelcomeText = new JTextField(2000);
//        WelcomeText.setSize(5000,100);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                username = textField1.getText();
                pin = new String(passwordField1.getPassword());

                CSVReader reader = null;
                try{
                    reader = new CSVReaderBuilder(new FileReader("Data.csv")).withSkipLines(1).build();
                }
                catch (FileNotFoundException fileNotFoundException){
                    fileNotFoundException.printStackTrace();
                }

                String[] a;
                int flag = 0;

                try{
                    while ((a=reader.readNext())!=null){
                        if(a[0].equals(username) && a[1].equals(pin))
                        {

                            JOptionPane.showMessageDialog(null,"Success");
                            Drive.callDashboard();

                            JButton b = new JButton();
//                            JFrame frame2= new JFrame();
//                            frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                            //frame.setSize(500,500);
//                            frame2.setBounds(400,100,1100,900);
//                            //frame2.add(new dashboard().getPanel1());
//                            frame2.add(new With().getPanel1());
//                            frame2.setVisible(true);
//                            frame2.setResizable(false);
                            flag = 1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        JOptionPane.showMessageDialog(null,"Try Again!!");
                    }

                }

                catch(Exception e1){

                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    JPanel getMainPanel(){
        return panel1;
    }


}
