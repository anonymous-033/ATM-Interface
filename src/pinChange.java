import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

public class pinChange extends signin{
    private JPanel panel1;
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
    private JTextField textField1;
    private JPasswordField textField2;
    private JPasswordField textField3;

    public pinChange(){



        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tt=0;
                String curpin=new String(textField1.getText());
                String newpin=new String(textField2.getPassword());
                try{
                    if(newpin.length()!=4){
                        throw new InvalidIdPinException();
                    }
                }catch(InvalidIdPinException er){
                    System.out.println(er.getMessage());
                    tt=1;
                    JOptionPane.showMessageDialog(null,"Invalid Pin");
                }

                String newpin2=new String(textField3.getPassword());
                int flag=0;

                try {
                    File inputFile = new File("Data.csv");
                    CSVReader reader = new CSVReader(new FileReader(inputFile));
                    List<String[]> csvBody = reader.readAll();
                    // get CSV row column and replace with by using row and column
                    for (int i = 0; i < csvBody.size(); i++) {
                        String[] strArray = csvBody.get(i);
                        //for (int j = 0; j < strArray.length; j++) {
                            if (strArray[1].equalsIgnoreCase(pin) && curpin.equals(pin) && newpin.equals(newpin2)) { //String to be replaced


                                if(tt==0){
                                    //String p = String.valueOf(finalVat);
                                    csvBody.get(i)[1] = newpin; //Target replacement
                                    flag=1;

                                    JOptionPane.showMessageDialog(null,"Success");
                                    break;
                                }


                                }

                            //}
                        }

                        reader.close();

                        // Write to CSV file which is open
                        CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
                        writer.writeAll(csvBody);
                        writer.flush();
                        writer.close();

                        if(flag==0)
                        {
                            JOptionPane.showMessageDialog(null,"Retry");
                        }
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
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        ABORTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.pinframe.dispose();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a1Button.getText());
                textField2.setText(textField2.getPassword() + a1Button.getText());
                textField3.setText(textField3.getPassword()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a2Button.getText());
                textField2.setText(textField2.getPassword() + a2Button.getText());
                textField3.setText(textField3.getPassword()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a3Button.getText());
                textField2.setText(textField2.getPassword() + a3Button.getText());
                textField3.setText(textField3.getPassword()+a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a4Button.getText());
                textField2.setText(textField2.getPassword() + a4Button.getText());
                textField3.setText(textField3.getPassword()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a5Button.getText());
                textField2.setText(textField2.getPassword() + a5Button.getText());
                textField3.setText(textField3.getPassword()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a6Button.getText());
                textField2.setText(textField2.getPassword() + a6Button.getText());
                textField3.setText(textField3.getPassword()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a7Button.getText());
                textField2.setText(textField2.getPassword() + a7Button.getText());
                textField3.setText(textField3.getPassword()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a8Button.getText());
                textField2.setText(textField2.getPassword() + a8Button.getText());
                textField3.setText(textField3.getPassword()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a9Button.getText());
                textField2.setText(textField2.getPassword() + a9Button.getText());
                textField3.setText(textField3.getPassword()+a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + a0Button.getText());
                textField2.setText(textField2.getPassword() + a0Button.getText());
                textField3.setText(textField3.getPassword()+a0Button.getText());
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
