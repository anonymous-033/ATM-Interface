import com.opencsv.exceptions.CsvException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class With{
    private JFrame pinframe;
    private JPanel panel1;
    private JButton WITHDRAWMONEYButton;
    private JButton PINCHANGEButton;
    private JButton FUNDTRANSFERButton;
    private JButton CHECKBALANCEButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button14;
    private JButton a0Button;
    private JButton button16;
    private JButton ENTERButton;
    private JButton CANCELButton;
    private JButton ABORTButton;



    public With() {

//        JLabel background;
        //setSize(1000,850);

//        ImageIcon img = new ImageIcon("Background.jpg");
//
//        background = new JLabel("",img,JLabel.CENTER);
//        background.setBounds(0,0,1000,850);
//        add(background);

        WITHDRAWMONEYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.callWithdraw();
//                JFrame frame2 = new JFrame();
//                frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                //frame.setSize(500,500);
//                frame2.setBounds(400, 100, 1100, 900);
//                //frame2.add(new testtt().gettestpanel());
//                frame2.add(new withDraw().getWithdrawpanel());
//                frame2.setVisible(true);
//                frame2.setResizable(false);

            }
        });
        FUNDTRANSFERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Drive.callTransfer();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (CsvException csvException) {
                    csvException.printStackTrace();
                }
//                JFrame frame3= new JFrame();
//                frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                //frame.setSize(500,500);
//                frame3.setBounds(400,100,1100,900);
//                try {
//                    frame3.add(new fundTransfer().getFundpanel());
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                } catch (CsvException csvException) {
//                    csvException.printStackTrace();
//                }
//                frame3.setVisible(true);
//                frame3.setResizable(false);
            }
        });


        PINCHANGEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.callPin();
//                pinframe = new JFrame();
//                pinframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                //frame.setSize(500,500);
//                pinframe.setBounds(400,100,1100,900);
//                //frame2.add(new dashboard().getPanel1());
//                pinframe.add(new pinChange().getPanel1());
//                pinframe.setVisible(true);
//                pinframe.setResizable(false);
            }
        });

        CHECKBALANCEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.callBalance();
//                JFrame pinframe = new JFrame();
//                pinframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                //frame.setSize(500,500);
//                pinframe.setBounds(400,100,1100,900);
//                //frame2.add(new dashboard().getPanel1());
//                pinframe.add(new checkBalance().getBalancepanel());
//                pinframe.setVisible(true);
//                pinframe.setResizable(false);

            }
        });
        ABORTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Drive.withframe.dispose();
            }
        });
    }

    JPanel getPanel1(){
        return panel1;
    }
//    public void gotoPrevFrame() {
//        frame2.setVisible(false);
//    }

}
