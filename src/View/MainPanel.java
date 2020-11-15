package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.Control;
import Model.Data;

public class MainPanel extends JPanel{
	
	public MainPanel(JFrame frame) {
		super();
		panelInit(frame);	
		
		}
	
	private void panelInit(JFrame frame) {
	      this.setBackground(new Color(255, 255, 255));
	      this.setBounds(0, 0, 636, 440);
	      frame.getContentPane().add(this);
	      this.setLayout(null);
	      
	      
	      JLabel main_Content1 = new JLabel("코로나 19 현황 및 수치 공개 프로그램입니다.");
	      main_Content1.setFont(new Font("맑은고딕", Font.BOLD, 15));
	      main_Content1.setForeground(new Color(0, 0, 0));
	      main_Content1.setHorizontalAlignment(JLabel.CENTER);
	      main_Content1.setBounds(30, 100, 600, 200);
	      
	      this.add(main_Content1);
	      
	      JLabel main_Content2 = new JLabel("왼쪽 상단의 메뉴 버튼을 클릭해 원하시는 메뉴를 클릭해주세요.");
	      main_Content2.setFont(new Font("맑은고딕", Font.BOLD, 15));
	      main_Content2.setForeground(new Color(0, 0, 0));
	      main_Content2.setHorizontalAlignment(JLabel.CENTER);
	      main_Content2.setBounds(30, 130, 600, 200);
	      
	      this.add(main_Content2);

	}
}
