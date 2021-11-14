import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReciptShow extends signin{

    private JLabel ulajsnajld;
    private JLabel accosds;
    private JLabel lab3;
    private JLabel lappliedvat;
    private JLabel la;
    private JLabel labe2;
    private JPanel recipt;
    private JLabel date;
    private JLabel timr;
    private JLabel user;
    private JLabel accountno;
    private JLabel withmoney;
    private JLabel vat;
    private JLabel currentamount;
    private JLabel lab9;
    private JLabel thank;
    private JPanel reciptpanal;
    private JLabel tranamount;
    private JLabel tranto;

    public ReciptShow()
    {


        date.setText("Date :"+String.valueOf(java.time.LocalDate.now()));
         timr.setText("Time :"+String.valueOf(java.time.LocalTime.now()));
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
                    user.setText(a[0]);
                    accountno.setText(a[4]);
                    withmoney.setText(a[3]);
                    currentamount.setText(a[2]);
                    tranamount.setText(a[5]);
                    tranto.setText(a[6]);
                    break;
                }
            }
        }
        catch(Exception e1){

        }

    }

    public JPanel getReciptpanal(){
        return reciptpanal;
    }

}
