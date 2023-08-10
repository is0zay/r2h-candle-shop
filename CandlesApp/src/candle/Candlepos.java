/*
 * Created by JFormDesigner on Tue Aug 08 10:34:13 EDT 2023
 */

package candle;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.*;


/**
 * @author isaiahshembo
 */
public class Candlepos extends JFrame implements MouseListener {
    public Candlepos() {
        initComponents();
    }

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Isaiah
        frame = new JFrame();
        tabbedPane1 = new JTabbedPane();
        panel5 = new JPanel();
        yslLabel = new JLabel();
        maisonLabel = new JLabel();
        tomLabel = new JLabel();
        label2 = new JLabel();
        textArea1 = new JTextArea();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textArea2 = new JTextArea();
        textArea3 = new JTextArea();
        label6 = new JLabel();
        label7 = new JLabel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label8 = new JLabel();
        textField1 = new JTextField();

        //======== frame ========
        {
            frame.setBackground(new Color(0x999999));
            var frameContentPane = frame.getContentPane();
            frameContentPane.setLayout(null);

            //======== tabbedPane1 ========
            {

                //======== panel5 ========
                {
                    panel5.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
                    .swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing
                    .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
                    Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.red
                    ),panel5. getBorder()));panel5. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
                    public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName(
                    )))throw new RuntimeException();}});
                    panel5.setLayout(null);

                    //---- yslLabel ----
                    yslLabel.setIcon(new ImageIcon("/Users/isaiahshembo/Downloads/yslcandle.jpeg"));
                    panel5.add(yslLabel);
                    yslLabel.setBounds(10, 10, 200, 185);

                    //---- maisonLabel ----
                    maisonLabel.setIcon(new ImageIcon("/Users/isaiahshembo/Downloads/jccandle.jpeg"));
                    panel5.add(maisonLabel);
                    maisonLabel.setBounds(270, 10, 200, 185);

                    //---- tomLabel ----
                    tomLabel.setIcon(new ImageIcon("/Users/isaiahshembo/Downloads/tfcandle.jpeg"));
                    panel5.add(tomLabel);
                    tomLabel.setBounds(530, 10, 200, 185);

                    //---- label2 ----
                    label2.setText("Yves Saint Laurent");
                    label2.setFont(new Font("Inter", Font.PLAIN, 10));
                    label2.setHorizontalAlignment(SwingConstants.LEFT);
                    panel5.add(label2);
                    label2.setBounds(10, 210, 200, 25);

                    //---- textArea1 ----
                    textArea1.setText("6 PLACE SAINT-SULPICE - LE VESTIAIRE DES PARFUMS - CANDLE");
                    textArea1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 8));
                    textArea1.setLineWrap(true);
                    panel5.add(textArea1);
                    textArea1.setBounds(10, 250, 200, 45);

                    //---- label3 ----
                    label3.setText("$80.00");
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    panel5.add(label3);
                    label3.setBounds(15, 310, 200, 15);

                    //---- label4 ----
                    label4.setText("Maison Margiela");
                    label4.setFont(new Font("Inter", Font.PLAIN, 10));
                    label4.setHorizontalAlignment(SwingConstants.LEFT);
                    panel5.add(label4);
                    label4.setBounds(270, 210, 200, 25);

                    //---- label5 ----
                    label5.setText("Tom Ford");
                    label5.setFont(new Font("Inter", Font.PLAIN, 10));
                    label5.setHorizontalAlignment(SwingConstants.LEFT);
                    panel5.add(label5);
                    label5.setBounds(530, 205, 200, 25);

                    //---- textArea2 ----
                    textArea2.setText("REPLICA JAZZ CLUB ");
                    textArea2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 8));
                    textArea2.setLineWrap(true);
                    panel5.add(textArea2);
                    textArea2.setBounds(270, 250, 200, 45);

                    //---- textArea3 ----
                    textArea3.setText("Oud Wood Candle ");
                    textArea3.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 8));
                    textArea3.setLineWrap(true);
                    panel5.add(textArea3);
                    textArea3.setBounds(530, 245, 200, 45);

                    //---- label6 ----
                    label6.setText("$70.00");
                    label6.setHorizontalAlignment(SwingConstants.CENTER);
                    panel5.add(label6);
                    label6.setBounds(270, 300, 200, 15);

                    //---- label7 ----
                    label7.setText("$135.00");
                    label7.setHorizontalAlignment(SwingConstants.CENTER);
                    panel5.add(label7);
                    label7.setBounds(530, 300, 200, 15);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel5.getComponentCount(); i++) {
                            Rectangle bounds = panel5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel5.setMinimumSize(preferredSize);
                        panel5.setPreferredSize(preferredSize);
                    }
                }
                tabbedPane1.addTab("Candles", panel5);

                //======== panel1 ========
                {
                    panel1.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel1.getComponentCount(); i++) {
                            Rectangle bounds = panel1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel1.setMinimumSize(preferredSize);
                        panel1.setPreferredSize(preferredSize);
                    }
                }
                tabbedPane1.addTab("Receipt", panel1);
            }
            frameContentPane.add(tabbedPane1);
            tabbedPane1.setBounds(220, 120, 830, tabbedPane1.getPreferredSize().height);

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0xcccccc));
                panel2.setLayout(new GridLayout());

                //---- label1 ----
                label1.setText("Zay's Candles");
                label1.setFont(new Font("ITF Devanagari", Font.BOLD | Font.ITALIC, 24));
                label1.setForeground(Color.black);
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                panel2.add(label1);
            }
            frameContentPane.add(panel2);
            panel2.setBounds(0, 0, 1210, 110);

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "Name", "Qty", "Burn Time", "$ per burn time", "Price", "sub-total"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, Integer.class, Integer.class, Double.class, Double.class, Double.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                scrollPane1.setViewportView(table1);
            }
            frameContentPane.add(scrollPane1);
            scrollPane1.setBounds(110, 540, 615, 129);

            //---- label8 ----
            label8.setText("Total: ");
            label8.setFont(new Font("Inter", Font.BOLD, 36));
            frameContentPane.add(label8);
            label8.setBounds(new Rectangle(new Point(760, 580), label8.getPreferredSize()));

            //---- textField1 ----
            textField1.setFont(new Font("Inter", Font.PLAIN, 24));
            textField1.setText("sample text");
            textField1.setForeground(Color.black);
            textField1.setBackground(Color.white);
            frameContentPane.add(textField1);
            textField1.setBounds(890, 580, 155, textField1.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frameContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frameContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frameContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frameContentPane.setMinimumSize(preferredSize);
                frameContentPane.setPreferredSize(preferredSize);
            }
            frame.setSize(1215, 840);
            frame.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Isaiah
    private JFrame frame;
    private JTabbedPane tabbedPane1;
    private JPanel panel5;
    private JLabel yslLabel;
    private JLabel maisonLabel;
    private JLabel tomLabel;
    private JLabel label2;
    private JTextArea textArea1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JLabel label6;
    private JLabel label7;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label8;
    private JTextField textField1;

    @Override
    public void mouseClicked(MouseEvent e) {

    }@Override
    public void mousePressed(MouseEvent e) {

    }@Override
    public void mouseReleased(MouseEvent e) {

    }@Override
    public void mouseEntered(MouseEvent e) {

    }@Override
    public void mouseExited(MouseEvent e) {

    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
