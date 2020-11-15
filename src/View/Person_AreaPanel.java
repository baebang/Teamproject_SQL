package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Person_AreaPanel extends JPanel {

   private Person_AreaGraph person_AreaGraph;
   private JComboBox AreaBox;

   public Person_AreaPanel(JFrame frame) {
      super();
      panelInit(frame);
      graphInit();
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
      String Arealist[] = { "������", "�������", "������", "�����Ϸ�", "���ϱ�", "������", "���״��", "���Ǳ�", "������", "���α�", "��õ��", "�����",
            "������", "������", "���빮��", "���۱�", "���۴��", "������", "���빮��", "���ʱ�", "������", "���ϱ�", "���ı�", "���̷�", "��õ��", "��������",
            "��������", "��걸", "����", "������", "����", "���α�", "�߱�", "�߶���", "õȣ���", "û��õ��", "�Ѱ����", "ȫ����", "ȭ����" };

      AreaBox = new JComboBox(Arealist);
      AreaBox.setBounds(136, 68, 116, 19);
      this.add(AreaBox);

      JButton btnApply = new JButton("Ȯ��");
      btnApply.setBounds(454, 65, 120, 23);
      this.add(btnApply);

      this.add(Person_Area_NewLabel);
   }

   private void graphInit() {
      person_AreaGraph = new Person_AreaGraph();
      person_AreaGraph.setBorder(BorderFactory.createLineBorder(new Color(0, 35, 110)));
      person_AreaGraph.setBackground(Color.white);
      person_AreaGraph.setBounds(60, 110, 510, 240);
      this.add(person_AreaGraph);
   }

}