import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class withDraw extends signin{
    private JFrame frame;
    private JPanel withdrawpanel;
    private JButton a1000Button;
    private JButton a500Button;
    private JButton a2000Button;
    private JButton a5000Button;
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
    private JTextField amountField;

    public withDraw() {
        super();
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(amountField.getText() + a0Button.getText());
            }
        });
        a500Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(a500Button.getText());
            }
        });
        a1000Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(a1000Button.getText());
            }
        });
        a2000Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(a2000Button.getText());
            }
        });
        a5000Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText(a5000Button.getText());
            }
        });
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double requiredBalance = Double.parseDouble(amountField.getText());
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
                                double vat = 2/100;
                                double finalVat = requiredBalance*vat;
                                double balance = requiredBalance + finalVat;
                                if (balance <= curBalance) {
                                    curBalance = curBalance - balance;
                                    String s = String.valueOf(curBalance);
                                    String t = String.valueOf(requiredBalance);
                                    //String p = String.valueOf(finalVat);
                                    csvBody.get(i)[2] = s; //Target replacement
                                    csvBody.get(i)[3] = t;
                                    //csvBody.get(i)[4] = p;
                                    JOptionPane.showMessageDialog(null,"Success");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Not enough balance");
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
                    }catch(IOException ioException){
                        ioException.printStackTrace();
                    } catch(CsvException csvException){
                        csvException.printStackTrace();
                    }

            }
            });
        CANCELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amountField.setText("");
            }
        });
        ABORTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.withdrawframe.dispose();
                //Drive.gotoPrevFrame();

//                With jhamela = new With();
//                jhamela.setVisible(true);
//                JFrame frame = new JFrame();
//                frame.add(new With().getPanel1());
//                frame.setVisible(true);
//                frame.dispose();
//                frame.add(new withDraw().getWithdrawpanel());
//                frame.setVisible(false);
            }
        });
    }

    JPanel getWithdrawpanel(){
        return withdrawpanel;
    }
}
