import javax.swing.*;

public class testtt {
    private JPanel panel1;
    private JLabel label1;

    public JPanel gettestpanel(){
        return panel1;
    }

    private void createUIComponents() {
        ImageIcon back = new ImageIcon("Background.jpg");
        label1 = new JLabel("",back,JLabel.CENTER);
        label1.setBounds(0,0,1200,700);
        // TODO: place custom component creation code here
    }
}
