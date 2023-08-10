import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Aug 09 14:06:53 EDT 2023
 */



/**
 * @author isaiahshembo
 */
public class TestCandlePOS extends JFrame {
    public TestCandlePOS() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Isaiah
        label1 = new JLabel();

        //======== this ========
        setBackground(Color.white);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout());

        //---- label1 ----
        label1.setText("Test Label");
        label1.setBackground(Color.white);
        label1.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 48));
        contentPane.add(label1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Isaiah
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
