package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import Control.Control;

public class Main {
   private static final long serialVersionUID = 1L;
   private JComboBox<String> combo;
   private Control control;
   
   //�޴���
   static JMenuBar mb;
   static JMenu x;
   static JMenuItem m1, m2, m3, m4, m5, m6, m7;
   
   //����
   private JToolBar t;
   static JButton tool1, tool2, tool3, tool4, tool5, tool6, tool7;
   
   private JFrame frame;

   private MainPanel Mainpanel;
   
   // 1�� ȭ��
   private Patient_NumberPanel Patient_NumberPanel;
   
   // 2�� ȭ��
   private DurationPanel DurationPanel;
   
   // 3�� ȭ��
   private Selected_datePanel Selected_datePanel; 
   
   // 4�� ȭ��
   private Person_AreaPanel Person_AreaPanel;
   
   // 5��ȭ�� 
   private DML_Panel DML_panel;
   
   // 6��ȭ�� 
   private InformationPanel InformationPanel;
   
   private void toolbarInit() { // ����
	      t = new JToolBar();
	      t.setBackground(new Color(225, 240, 255));
	      
	      t.add(tool1 = new JButton("Loading ȭ��"));
	      tool1.setBackground(new Color(0, 35, 110));
	      tool1.setFont(new Font("����", Font.BOLD, 12));
	      tool1.setForeground(Color.WHITE);
	      
	      t.add(tool2 = new JButton("ȯ�� ��ȣ ��ȸ"));
	      tool2.setBackground(new Color(0, 35, 110));
	      tool2.setFont(new Font("����", Font.BOLD, 12));
	      tool2.setForeground(Color.WHITE);
	      
	      t.add(tool3 = new JButton("�Ⱓ"));
	      tool3.setBackground(new Color(0, 35, 110));
	      tool3.setFont(new Font("����", Font.BOLD, 12));
	      tool3.setForeground(Color.WHITE);
	      
	      t.add(tool4 = new JButton("���� ��¥"));
	      tool4.setBackground(new Color(0, 35, 110));
	      tool4.setFont(new Font("����", Font.BOLD, 12));
	      tool4.setForeground(Color.WHITE);

	      t.add(tool5 = new JButton("������ �ְ�/����"));
	      tool5.setBackground(new Color(0, 35, 110));
	      tool5.setFont(new Font("����", Font.BOLD, 12));
	      tool5.setForeground(Color.WHITE);

	      t.add(tool6 = new JButton("�������Է�"));
	      tool6.setBackground(new Color(0, 35, 110));
	      tool6.setFont(new Font("����", Font.BOLD, 12));
	      tool6.setForeground(Color.WHITE);
	      
	      t.add(tool7 = new JButton("�ȳ�"));
	      tool7.setBackground(new Color(0, 35, 110));
	      tool7.setFont(new Font("����", Font.BOLD, 12));
	      tool7.setForeground(Color.WHITE);
	      
	      t.addSeparator();

	      frame.add(t, BorderLayout.PAGE_START);
	      
	      tool1.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent arg0) {
	        	 Mainpanel.setVisible(true);
	             Patient_NumberPanel.setVisible(false);
	             DurationPanel.setVisible(false);
	             Selected_datePanel.setVisible(false);
	             Person_AreaPanel.setVisible(false);
	             DML_panel.setVisible(false);
	             InformationPanel.setVisible(false);
	         }
	      });

	      tool2.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent arg0) {
	        	 Mainpanel.setVisible(false);
	             Patient_NumberPanel.setVisible(true);
	             DurationPanel.setVisible(false);
	             Selected_datePanel.setVisible(false);
	             Person_AreaPanel.setVisible(false);
	             DML_panel.setVisible(false);
	             InformationPanel.setVisible(false);
	         }
	      });

	      tool3.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent arg0) {
	        	 Mainpanel.setVisible(false);
	             Patient_NumberPanel.setVisible(false);
	             DurationPanel.setVisible(true);
	             Selected_datePanel.setVisible(false);
	             Person_AreaPanel.setVisible(false);
	             DML_panel.setVisible(false);
	             InformationPanel.setVisible(false);
	         }
	      });
	      
	      tool4.addActionListener(new ActionListener() {
		         @Override
		         public void actionPerformed(ActionEvent arg0) {
		        	 Mainpanel.setVisible(false);
		             Patient_NumberPanel.setVisible(false);
		             DurationPanel.setVisible(false);
		             Selected_datePanel.setVisible(true);
		             Person_AreaPanel.setVisible(false);
		             DML_panel.setVisible(false);
		             InformationPanel.setVisible(false);
		         }
		      });
	      
	      tool5.addActionListener(new ActionListener() {
		         @Override
		         public void actionPerformed(ActionEvent arg0) {
		        	 Mainpanel.setVisible(false);
		             Patient_NumberPanel.setVisible(false);
		             DurationPanel.setVisible(false);
		             Selected_datePanel.setVisible(false);
		             Person_AreaPanel.setVisible(true);
		             DML_panel.setVisible(false);
		             InformationPanel.setVisible(false);
		         }
		      });
	      
	      tool6.addActionListener(new ActionListener() {
		         @Override
		         public void actionPerformed(ActionEvent arg0) {
		        	 Mainpanel.setVisible(false);
		             Patient_NumberPanel.setVisible(false);
		             DurationPanel.setVisible(false);
		             Selected_datePanel.setVisible(false);
		             Person_AreaPanel.setVisible(false);
		             DML_panel.setVisible(true);
		             InformationPanel.setVisible(false);
		         }
		      });
	      
	      tool7.addActionListener(new ActionListener() {
		         @Override
		         public void actionPerformed(ActionEvent arg0) {
		        	 Mainpanel.setVisible(false);
		             Patient_NumberPanel.setVisible(false);
		             DurationPanel.setVisible(false);
		             Selected_datePanel.setVisible(false);
		             Person_AreaPanel.setVisible(false);
		             DML_panel.setVisible(false);
		             InformationPanel.setVisible(true);
		         }
		      });
	      
	   }

   
   private void menuInit() { // �޴��� ����
      
      mb = new JMenuBar();
      mb.setBackground(new Color(255, 204, 204));
      x = new JMenu("Menu");
      x.setForeground(Color.BLACK);
      x.setFont(new Font("����", Font.BOLD, 15));

      m1 = new JMenuItem("Loding ȭ��");
      m2 = new JMenuItem("ȯ�� ��ȣ ��ȸ");
      m3 = new JMenuItem("�Ⱓ");
      m4 = new JMenuItem("������¥");
      m5 = new JMenuItem("������ �ְ�/����");
      m6 = new JMenuItem("�������Է�");
      m7 = new JMenuItem("�ȳ�");
      

      x.add(m1);
      x.add(m2);
      x.add(m3);
      x.add(m4);
      x.add(m5);
      x.add(m6);
      x.add(m7);

      mb.add(x);
      frame.setJMenuBar(mb);
      frame.setSize(650, 500);//650 420
      frame.setVisible(true);

      m1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
            Mainpanel.setVisible(true);
            Patient_NumberPanel.setVisible(false);
            DurationPanel.setVisible(false);
            Selected_datePanel.setVisible(false);
            Person_AreaPanel.setVisible(false);
            DML_panel.setVisible(false);
            InformationPanel.setVisible(false);
         }
      });

      m2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(false);
             Patient_NumberPanel.setVisible(true);
             DurationPanel.setVisible(false);
             Selected_datePanel.setVisible(false);
             Person_AreaPanel.setVisible(false);
             DML_panel.setVisible(false);
             InformationPanel.setVisible(false);
         }
      });

      m3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(false);
             Patient_NumberPanel.setVisible(false);
             DurationPanel.setVisible(true);
             Selected_datePanel.setVisible(false);
             Person_AreaPanel.setVisible(false);
             DML_panel.setVisible(false);
             InformationPanel.setVisible(false);
         }
      });
      
      m4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(false);
             Patient_NumberPanel.setVisible(false);
             DurationPanel.setVisible(false);
             Selected_datePanel.setVisible(true);
             Person_AreaPanel.setVisible(false);
             DML_panel.setVisible(false);
             InformationPanel.setVisible(false);
         }
      });
      
      m5.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(false);
             Patient_NumberPanel.setVisible(false);
             DurationPanel.setVisible(false);
             Selected_datePanel.setVisible(false);
             Person_AreaPanel.setVisible(true);
             DML_panel.setVisible(false);
             InformationPanel.setVisible(false);
         }
      });
      
      m6.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Mainpanel.setVisible(false);
             Patient_NumberPanel.setVisible(false);
             DurationPanel.setVisible(false);
             Selected_datePanel.setVisible(false);
             Person_AreaPanel.setVisible(false);
             DML_panel.setVisible(true);
             InformationPanel.setVisible(false);
         }
      });
      
      m7.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent arg0) {
              Mainpanel.setVisible(false);
              Patient_NumberPanel.setVisible(false);
              DurationPanel.setVisible(false);
              Selected_datePanel.setVisible(false);
              Person_AreaPanel.setVisible(false);
              DML_panel.setVisible(false);
              InformationPanel.setVisible(true);
          }
       });

   }

   private void frameInit() {
      frame.setTitle("MJ : COVID-19");
      frame.setBounds(100, 100, 650, 430);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
   }

   private void Initialize() {
      frameInit();
      menuInit();
      toolbarInit();

      
      Mainpanel = new MainPanel(frame);
      Patient_NumberPanel = new Patient_NumberPanel(frame, control);
      DurationPanel = new DurationPanel(frame, control);
      Selected_datePanel = new Selected_datePanel(frame, control);
      Person_AreaPanel = new Person_AreaPanel(frame, control);
      DML_panel = new DML_Panel(frame, control);
      InformationPanel = new InformationPanel(frame);
      

      
      Patient_NumberPanel.setVisible(false);
      DurationPanel.setVisible(false);
      Selected_datePanel.setVisible(false);
      Person_AreaPanel.setVisible(false);
      DML_panel.setVisible(false);
      InformationPanel.setVisible(false);
   }

   public Main() {
      frame = new JFrame();
      control = new Control();
      Initialize();
   }

   public static void main(String[] args) {
      Main window = new Main();
      window.frame.setVisible(true);
   }

}
