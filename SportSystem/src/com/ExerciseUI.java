package com;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class ExerciseUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtTime;
	private JComboBox<String> comboSport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciseUI frame = new ExerciseUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExerciseUI() {
		setTitle("運動熱量管理系統");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 368);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 148, 6));
		panel.setBounds(55, 10, 642, 61);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitle = new JLabel("個人運動紀錄與熱量管理系統");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("微軟正黑體", Font.BOLD, 24));
		lblTitle.setBounds(150, 10, 350, 42);
		panel.add(lblTitle);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 58, 64));
		panel_1.setBounds(54, 106, 185, 167);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblName = new JLabel("姓名:");
		lblName.setForeground(new Color(248, 148, 6));
		lblName.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		lblName.setBounds(10, 32, 73, 18);
		panel_1.add(lblName);

		JLabel lblSport = new JLabel("運動項目:");
		lblSport.setForeground(new Color(248, 148, 6));
		lblSport.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		lblSport.setBounds(10, 74, 73, 18);
		panel_1.add(lblSport);

		JLabel lblTime = new JLabel("時間(分):");
		lblTime.setForeground(new Color(248, 148, 6));
		lblTime.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		lblTime.setBounds(10, 120, 73, 18);
		panel_1.add(lblTime);

		txtName = new JTextField();
		txtName.setBounds(79, 35, 96, 21);
		panel_1.add(txtName);
		txtName.setColumns(10);

		String[] sports = { "跑步", "騎腳踏車", "游泳", "健走" };
		comboSport = new JComboBox<>(sports);
		comboSport.setBounds(79, 77, 96, 21);
		panel_1.add(comboSport);

		txtTime = new JTextField();
		txtTime.setBounds(79, 123, 96, 21);
		panel_1.add(txtTime);
		txtTime.setColumns(10);

		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(40, 167, 69));
		panel_2.setBounds(266, 82, 431, 224);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 411, 160);
		panel_2.add(scrollPane);

		JTextArea output = new JTextArea();
		output.setBackground(new Color(248, 249, 250));
		output.setFont(new Font("Monospaced", Font.PLAIN, 15));
		scrollPane.setViewportView(output);

		
		/*************** event ******************/
		
	     //列印
		JButton btnPrint = new JButton("列印");
		btnPrint.setBounds(70, 180, 87, 23);
		panel_2.add(btnPrint);
		btnPrint.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnPrint.addMouseListener(new MouseAdapter() {
		@Override
	    public void mouseClicked(MouseEvent e) {
	    try {
	    output.print();
	    } catch (PrinterException e1) {
		e1.printStackTrace();
		}
        }
         });

		//關閉
		JButton btnNewButton_3 = new JButton("關閉");
		btnNewButton_3.setBounds(237, 180, 87, 23);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		

		btnNewButton_3.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		System.exit(0);
		}
		});


		
	    //確定
	    JButton btnNewButton = new JButton("確定");
	    btnNewButton.setBounds(55, 283, 87, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		try {
	    String name = txtName.getText().trim();
		String sport = comboSport.getSelectedItem().toString();
		String timeStr = txtTime.getText().trim();

		if (name.isEmpty()) {
		JOptionPane.showMessageDialog(ExerciseUI.this, "請輸入姓名！");
		return;
		}

		int time = Integer.parseInt(timeStr);
		if (time <= 0) {
	    JOptionPane.showMessageDialog(ExerciseUI.this, "時間必須大於 0 分鐘！");
		return;
		}

		Exercise exercise = new Exercise(name, sport, time);
		exercise.calculateCalorie();
		output.setText(exercise.getReport());
	   } catch (NumberFormatException ex) {
	JOptionPane.showMessageDialog(ExerciseUI.this, "請在時間欄位輸入正確的數字！");
	  }
	}
	});
		

		//清除
		JButton btnNewButton_2 = new JButton("清除");
		btnNewButton_2.setBounds(167, 283, 87, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		txtName.setText("");
		txtTime.setText("");
		comboSport.setSelectedIndex(0);
		output.setText("");
		}
		});
		
		//time
		JLabel timeZone = new JLabel("目前時間:yyyy-MM-dd HH:mm:ss");
		timeZone.setBounds(55, 81, 186, 15);
		contentPane.add(timeZone);
		
		Timer timer = new Timer(1000, new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) 
		    {
		        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		        timeZone.setText("目前時間：" +"\n"+time);
		    }
		});
		timer.start();


	}
}