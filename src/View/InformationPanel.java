package View;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationPanel extends JPanel{
   
   public InformationPanel(JFrame frame) {
      super();
      panelInit(frame);
   }
   
   private void panelInit(JFrame frame) {
         this.setBackground(new Color(255, 255, 255));
         this.setBounds(0, 0, 636, 440);
         frame.getContentPane().add(this);
         this.setLayout(null);
         
         
         JLabel information_Content1 = new JLabel("1. ȯ�� ��ȣ ��ȸ: ȯ�� ��ȣ�� �Է��ϸ� �ش� ȯ�ڿ� ���� ������ �����ݴϴ�");
         information_Content1.setFont(new Font("�������", Font.BOLD, 15));
         information_Content1.setForeground(new Color(0, 0, 0));
         information_Content1.setHorizontalAlignment(JLabel.CENTER);
         information_Content1.setBounds(30, 10, 600, 200);
         
         this.add(information_Content1);
         
         JLabel information_Content2 = new JLabel("2. �Ⱓ: ���� ��¥�� �� ��¥�� �����ϸ� �ش��ϴ� �Ⱓ�� �׷����� ");
         information_Content2.setFont(new Font("�������", Font.BOLD, 15));
         information_Content2.setForeground(new Color(0, 0, 0));
         information_Content2.setHorizontalAlignment(JLabel.CENTER);
         information_Content2.setBounds(30, 40, 600, 200);
         
         this.add(information_Content2);
         

         JLabel information_Content2_2 = new JLabel("�ְ�/���� Ȯ���� ���� �����ݴϴ�.");
         information_Content2_2.setFont(new Font("�������", Font.BOLD, 15));
         information_Content2_2.setForeground(new Color(0, 0, 0));
         information_Content2_2.setHorizontalAlignment(JLabel.CENTER);
         information_Content2_2.setBounds(30, 70, 600, 200);
         
         this.add(information_Content2_2);
         
         JLabel information_Content3 = new JLabel("3. ���� ��¥: Ư�� ��¥�� �����ϸ� �ش��ϴ� ��¥�� Ȯ���� �׷����� �����ݴϴ�.");
         information_Content3.setFont(new Font("�������", Font.BOLD, 15));
         information_Content3.setForeground(new Color(0, 0, 0));
         information_Content3.setHorizontalAlignment(JLabel.CENTER);
         information_Content3.setBounds(30, 100, 600, 200);
         
         this.add(information_Content3);
         
         
         JLabel information_Content4 = new JLabel("4. ������ �ְ�/����: ������ �����ϸ� �ش� ������ �ְ� ���� Ȯ���ڸ� �����ݴϴ�.");
         information_Content4.setFont(new Font("�������", Font.BOLD, 15));
         information_Content4.setForeground(new Color(0, 0, 0));
         information_Content4.setHorizontalAlignment(JLabel.CENTER);
         information_Content4.setBounds(30, 130, 600, 200);
         
         this.add(information_Content4);
         
         JLabel information_Content5 = new JLabel("5. ���� ��¥: ��¥�� �����ϸ� �ش� ��¥�� ���� Ȯ���� ������ �����ݴϴ�");
         information_Content5.setFont(new Font("�������", Font.BOLD, 15));
         information_Content5.setForeground(new Color(0, 0, 0));
         information_Content5.setHorizontalAlignment(JLabel.CENTER);
         information_Content5.setBounds(30, 160, 600, 200);
         
         this.add(information_Content5);
         
         JLabel information_Content6 = new JLabel("6. �������Է�: ���ϴ� �����͸� �Է��� �� �ֽ��ϴ�.");
         information_Content6.setFont(new Font("�������", Font.BOLD, 15));
         information_Content6.setForeground(new Color(0, 0, 0));
         information_Content6.setHorizontalAlignment(JLabel.CENTER);
         information_Content6.setBounds(30, 190, 600, 200);
         
         this.add(information_Content6);

   }
}