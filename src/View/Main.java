package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Control.Control;

public class Main {
   private static final long serialVersionUID = 1L;
   private JComboBox<String> combo;
   private Control control;
   static JMenuBar mb;
   static JMenu x;
   static JMenuItem m1, m2, m3, m4, m5, m6;
   
   private JFrame frame;

   private MainPanel Mainpanel;
   
   // 1번 화면
   private Patient_NumberPanel Patient_NumberPanel;
   
   // 2번 화면
   private DurationPanel DurationPanel;
   
   // 3번 화면
   private Selected_datePanel Selected_datePanel; 
   
   // 4번 화면
   private Person_AreaPanel Person_AreaPanel;
   
   // 5번화면 
   private InformationPanel InformationPanel;
   
   
   private void menuInit() { // 메뉴바 구현
      
      mb = new JMenuBar();
      mb.setBackground(new Color(255, 204, 204));
      x = new JMenu("Menu");
      x.setForeground(Color.BLACK);
      x.setFont(new Font("돋움", Font.BOLD, 15));

      m1 = new JMenuItem("Loding 화면");
      m2 = new JMenuItem("환자 번호 조회");
      m3 = new JMenuItem("기간");
      m4 = new JMenuItem("지정날짜");
      m5 = new JMenuItem("인원, 구역");
      m6 = new JMenuItem("안내");

      x.add(m1);
      x.add(m2);
      x.add(m3);
      x.add(m4);
      x.add(m5);
      x.add(m6);

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

      
      Mainpanel = new MainPanel(frame);
      Patient_NumberPanel = new Patient_NumberPanel(frame, control);
      DurationPanel = new DurationPanel(frame, control);
      Selected_datePanel = new Selected_datePanel(frame);
      Person_AreaPanel = new Person_AreaPanel(frame);
      InformationPanel = new InformationPanel(frame);
      
      menuInit();
      
      Patient_NumberPanel.setVisible(false);
      DurationPanel.setVisible(false);
      Selected_datePanel.setVisible(false);
      Person_AreaPanel.setVisible(false);
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
