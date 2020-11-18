package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.Control;

public class Person_AreaPanel extends JPanel {

   private Person_AreaGraph person_AreaGraph;
   private JComboBox AreaBox;
   private String Area;
   private Control control;

   public Person_AreaPanel(JFrame frame, Control control) {
      super();
      panelInit(frame);
      this.control = control;
      person_AreaGraph = new Person_AreaGraph();
      person_AreaGraph.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      person_AreaGraph.setBackground(Color.white);
      person_AreaGraph.setBounds(60, 110, 510, 240);
      this.add(person_AreaGraph);
   }

   private void panelInit(JFrame frame) {
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 636, 440);
      frame.getContentPane().add(this);
      this.setLayout(null);

      // �ο� & ���� ȭ��
      JLabel Person_Area_NewLabel = new JLabel("Person & Area");
      Person_Area_NewLabel.setFont(new Font("Arial", Font.BOLD, 35));
      Person_Area_NewLabel.setForeground(new Color(204, 051, 051));
      Person_Area_NewLabel.setHorizontalAlignment(JLabel.CENTER);
      Person_Area_NewLabel.setBounds(70, 5, 500, 40);

      JLabel lblSerch = new JLabel("���� �˻�");
      lblSerch.setBounds(70, 70, 57, 15);
      this.add(lblSerch);

      // sample list
      String Arealist[] = { "������", "������", "���ϱ�", "������", "���Ǳ�", "������", "���α�", "��õ��", "�����",
            "������", "���빮��", "���۱�", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "���̷�", "��õ��", "��������",
            "��걸", "����", "������", "����", "���α�", "�߱�", "�߶���"};

      AreaBox = new JComboBox(Arealist);
      AreaBox.setBounds(136, 68, 116, 19);
      this.add(AreaBox);

      JButton btnApply = new JButton("Ȯ��");
      btnApply.setActionCommand("Ȯ��");
      btnApply.addActionListener(new MyActionListener());
      btnApply.setBounds(454, 65, 120, 23);
      this.add(btnApply);

      this.add(Person_Area_NewLabel);
   }

   class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "Ȯ��":
				Area = (String) AreaBox.getSelectedItem();
				int[][] Month_Count = control.Person_Area_filter(Area);
				person_AreaGraph.getData(Month_Count);
				person_AreaGraph.repaint();
				break;
			}

		}
	   
   }

}