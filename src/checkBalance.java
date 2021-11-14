import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkBalance extends signin {
    private JPanel balancepanel;
    private JButton checkRecentTransitionButton;
    private JButton checkCurrentAmountButton;
    private JButton recentWithdrawalAmountButton;
    private JButton printReciptButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton button14;
    private JButton a0Button;
    private JButton button16;
    private JButton ABORTButton;
    private JButton a9Button;
    private JButton ENTERButton;
    private JButton CANCELButton;
    private JLabel titlelabel;
    private JLabel valuelabel;

    public checkBalance() {
        checkCurrentAmountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlelabel.setText("Your Current Balance is:");

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
                            //Change kora lagbe

                            valuelabel.setText(a[2]);

                            break;
                        }
                    }

                }
                catch(Exception e1){

                }


            }
        });
        checkRecentTransitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlelabel.setText("Your Last Transition");


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
                            //Change kora lagbe

                            valuelabel.setText("Transferred amount "+a[5]+" to "+a[6]);

                            break;
                        }
                    }

                }
                catch(Exception e1){

                }


            }
        });
        recentWithdrawalAmountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlelabel.setText("Your Recent Withdrawal Amount :");


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
                            //Change kora lagbe

                            valuelabel.setText(a[3]);

                            break;
                        }
                    }

                }
                catch(Exception e1){

                }


            }
        });
        printReciptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.callReceipt();
            }
        });
        ABORTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.balanceframe.dispose();
            }
        });
    }

    JPanel getBalancepanel(){return balancepanel;}
}
