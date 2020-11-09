package View;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationPanel extends JPanel{
   private Information_image Imagepanel;
   
   public InformationPanel(JFrame frame) {
      super();
      panelInit(frame);
      imageInit();
   }
   
   private void panelInit(JFrame frame) {
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 636, 440);
      frame.getContentPane().add(this);
      this.setLayout(null);

      // �ȳ� ȭ��
      JLabel Information_NewLabel = new JLabel("Information");
      Information_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
      Information_NewLabel.setForeground(new Color(0, 35, 110));
      Information_NewLabel.setHorizontalAlignment(JLabel.CENTER);
      Information_NewLabel.setBounds(1700, 5, 500, 40);
      
      this.add(Information_NewLabel);
   }
   
   private void imageInit() {
      Imagepanel = new Information_image();
      Imagepanel.setBounds(7, 40, 620, 280);
      Imagepanel.setBorder(BorderFactory.createLineBorder(Color.black));

      this.add(Imagepanel);
      Imagepanel.setVisible(true);
   }
}