import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame{
    private JPanel panel1;
    private JButton WITHDRAWMONEYButton;
    private JButton FUNDTRANSFERButton;
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
    private JButton PINCHANGEButton;
    private JButton CHECKBALANCEButton;
    private JLabel Label1;

    public dashboard(){

        //        JLabel background;
        //setSize(1000,850);
        //setLayout(null);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        ImageIcon img = new ImageIcon("Background.jpg");
//
//        background = new JLabel("",img,JLabel.CENTER);
//        background.setBounds(0,0,1000,850);
//        add(background);

        WITHDRAWMONEYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2= new JFrame();
                frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                //frame.setSize(500,500);
                frame2.setBounds(450,150,1008,852);
                //frame2.add(new testtt().gettestpanel());
                frame2.setVisible(true);
                frame2.add(new withDraw().getWithdrawpanel());
            }
        });
//        FUNDTRANSFERButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFrame frame3= new JFrame();
//                frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                //frame.setSize(500,500);
//                frame3.setBounds(450,150,1008,852);
//                frame3.add(new fundTransfer().getFundpanel());
//                frame3.setVisible(true);
//                frame3.setResizable(false);
//            }
//        });
    }

    JPanel getPanel1(){
        return panel1;
    }


}



