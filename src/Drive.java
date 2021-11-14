import com.opencsv.exceptions.CsvException;

import javax.swing.*;
import java.io.IOException;

public class Drive extends JFrame{
    static JFrame loginframe;
    static JFrame withframe;
    static JFrame withdrawframe;
    static JFrame balanceframe;
    static JFrame fundtransferframe;
    static JFrame pinframe;
    static JFrame receiptframe;

    public static void main(String[] args) {
        //callLogin();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(300,80,1300,900);
        //frame.add(new Login().getMainPanel());
        frame.add(new signin().getMainPanel());
        JButton b = new JButton();
        frame.setVisible(true);
        frame.setResizable(false);

    }



    public static void callLogin()
    {
        loginframe = new JFrame();
        loginframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginframe.setBounds(400,100,1100,900);
        loginframe.add(new Login().getMainPanel());
        loginframe.setVisible(true);
        loginframe.setResizable(false);
//        frame2 = new JFrame();
//        frame2.dispose();
//        frame1=new JFrame();
//        frame1.setVisible(true);
    }

    public static void callDashboard(){
        withframe = new JFrame();
        withframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        withframe.setBounds(300,80,1300,900);
        withframe.add(new With().getPanel1());
        withframe.setVisible(true);
        withframe.setResizable(false);
    }

    public static void callWithdraw(){
        withdrawframe = new JFrame();
        withdrawframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //frame.setSize(500,500);
        withdrawframe.setBounds(300,80,1300,900);
        //frame2.add(new dashboard().getPanel1());
        withdrawframe.add(new withDraw().getWithdrawpanel());
        withdrawframe.setVisible(true);
        withdrawframe.setResizable(false);
        //flag = 1;
        //break;
    }

    public static void callTransfer() throws IOException, CsvException {
        fundtransferframe = new JFrame();
        fundtransferframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        fundtransferframe.setBounds(300,80,1300,900);
        fundtransferframe.add(new fundTransfer().getFundpanel());
        fundtransferframe.setVisible(true);
        fundtransferframe.setResizable(false);

    }

    public static void callBalance(){
        balanceframe = new JFrame();
        balanceframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        balanceframe.setBounds(300,80,1300,900);
        balanceframe.add(new checkBalance().getBalancepanel());
        balanceframe.setVisible(true);
        balanceframe.setResizable(false);
    }

    public static void callPin(){
        pinframe = new JFrame();
        pinframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //frame.setSize(500,500);
        pinframe.setBounds(300,80,1300,900);
        //frame2.add(new dashboard().getPanel1());
        pinframe.add(new pinChange().getPanel1());
        pinframe.setVisible(true);
        pinframe.setResizable(false);
    }

    public static void callReceipt(){
        receiptframe = new JFrame();
        receiptframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //frame.setSize(500,500);
        receiptframe.setBounds(300,80,1300,900);
        //frame2.add(new dashboard().getPanel1());
        receiptframe.add(new ReciptShow().getReciptpanal());
        receiptframe.setVisible(true);
        receiptframe.setResizable(false);
    }
}
