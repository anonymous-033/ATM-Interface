import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

public class fundTransfer extends signin {
    private JPanel fundpanel;
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
    private JTextField accounttField;
    private JTextField amountfield;



    public fundTransfer() throws IOException, CsvException {
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("enter clicked");
                String accno = accounttField.getText();
                String amount = amountfield.getText();

                double balance = Double.parseDouble(amount);
                int flag = 0;
                int flag2 = 0;

                try {

                    File inputFile = new File("Data.csv");
                    CSVReader reader = new CSVReader(new FileReader(inputFile));
                    List<String[]> csvBody = reader.readAll();
                    // get CSV row column and replace with by using row and column
                    for (int i = 0; i < csvBody.size(); i++) {
                        String[] strArray = csvBody.get(i);
                        for (int j = 0; j < strArray.length; j++) {
                            if (strArray[j].equalsIgnoreCase(username) && strArray[1].equalsIgnoreCase(pin)) { //String to be replaced
                                double curBalance = Double.parseDouble(strArray[2]);

                                if (balance <= curBalance) {
                                    curBalance = curBalance - balance;
                                    String s = String.valueOf(curBalance);
                                    //String t = String.valueOf(requiredBalance);
                                    String p = accno;
                                    csvBody.get(i)[2] = s; //Target replacement
                                    //csvBody.get(i)[5] = p;
                                    //csvBody.get(i)[4] = p;
                                    // JOptionPane.showMessageDialog(null,"Success");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Not enough balance");

                                    flag = 1;
                                }
                            }
                        }
                        reader.close();

                        // Write to CSV file which is open
                        CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
                        writer.writeAll(csvBody);
                        writer.flush();
                        writer.close();
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (CsvException csvException) {
                    csvException.printStackTrace();
                }

                try {

                    File inputFile = new File("Data.csv");
                    CSVReader reader = new CSVReader(new FileReader(inputFile));
                    List<String[]> csvBody = reader.readAll();
                    // get CSV row column and replace with by using row and column
                    for (int i = 0; i < csvBody.size(); i++) {
                        String[] strArray = csvBody.get(i);
                        // for (int j = 0; j < strArray.length; j++) {
                        if (strArray[4].equalsIgnoreCase(accno)) { //String to be replaced
                            double curBalance = Double.parseDouble(strArray[2]);

                            if (flag == 0) {
                                curBalance = curBalance + balance;
                                String s = String.valueOf(curBalance);

                                // String p = accno;
                                csvBody.get(i)[2] = s; //Target replacement
                               // csvBody.get(i)[5] = t;
                                // csvBody.get(i)[6] = p;
                                JOptionPane.showMessageDialog(null, "Successfully Transferrd");
                            }

                            flag2 = 1;


                        }
                        reader.close();

                        // Write to CSV file which is open
                        CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
                        writer.writeAll(csvBody);
                        writer.flush();
                        writer.close();
                    }
                    if (flag2 == 0) {
                        JOptionPane.showMessageDialog(null, "Invalid Account Number");
                    }

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (CsvException csvException) {
                    csvException.printStackTrace();
                }


                try {
                    
                    File inputFile = new File("Data.csv");
                    CSVReader reader = new CSVReader(new FileReader(inputFile));
                    List<String[]> csvBody = reader.readAll();
                    // get CSV row column and replace with by using row and column
                    for (int i = 0; i < csvBody.size(); i++) {
                        String[] strArray = csvBody.get(i);
                        // for (int j = 0; j < strArray.length; j++) {


                        if (flag == 0 && flag2 == 1 && strArray[0].equalsIgnoreCase(username) && strArray[1].equalsIgnoreCase(pin)) {


                            String p = accno;
                            //  csvBody.get(i)[2] = s; //Target replacement
                            String t = String.valueOf(balance);
                            csvBody.get(i)[6] = p;
                            csvBody.get(i)[5] = t;
                            //JOptionPane.showMessageDialog(null,"Successfully Transferrd");
                        }

                        // flag2=1;


                    }
                    reader.close();

                    // Write to CSV file which is open
                    CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
                    writer.writeAll(csvBody);
                    writer.flush();
                    writer.close();
                } catch (CsvException exception) {
                    exception.printStackTrace();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }

            }









        });
        CANCELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accounttField.setText("");
                amountfield.setText("");
            }
        });
        ABORTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.fundtransferframe.dispose();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a1Button.getText());
                }
                else if(amountfield.isCursorSet()){
                    amountfield.setText(amountfield.getText() + a1Button.getText());
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a2Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a2Button.getText());
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a3Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a3Button.getText());
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a4Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a4Button.getText());
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a5Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a5Button.getText());
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a6Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a6Button.getText());
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a7Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a7Button.getText());
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a8Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a8Button.getText());
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a9Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a9Button.getText());
                }
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accounttField.isCursorSet()){
                    accounttField.setText(accounttField.getText() + a0Button.getText());
                }
                else{
                    amountfield.setText(amountfield.getText() + a0Button.getText());
                }
            }
        });
    }

    JPanel getFundpanel(){
        return fundpanel;
    }
}
