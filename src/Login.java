import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Login{
    private JPanel MainPanel;
    private JPanel Welcome;
    private JPanel Login;
    public JTextField WelcomeText;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JLabel userLabel;
    private JLabel pinLabel;
    private JLayeredPane jLayeredPane;
    public static String username ;
    public static String pin;


    public Login(){

//        setSize(1000,850);
//        setLayout(null);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//        try {
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//        } catch(Exception e){
//
//        }

        textField1.setSize(100,100);
        WelcomeText = new JTextField(2000);
        WelcomeText.setSize(5000,100);
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
                        //if(a[0].equals(username) && a[1].equals(pin))
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

    }


//    public void find(String user) throws InvalidIdPinException{
//        int k;
//        if(user.equals(username)){
//            k = 0;
//        }
//        else
//        {
//            throw new InvalidIdPinException("Could not Find user");
//        }
//
//    }


    JPanel getMainPanel(){
        return MainPanel;
    }
//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }
}
