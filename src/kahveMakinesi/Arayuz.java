package kahveMakinesi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kahveMakinesi.Sql;
import kahveMakinesi.Arayuz;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Arayuz extends JFrame {

	private JPanel contentPane;
	private JTextField Kullanici_adi_txt;
	private JTextField sifre_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arayuz frame = new Arayuz();
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
	public Arayuz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KAHVE OTOMATI");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(197, 222, 339, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanıcı Adı :");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 66, 154, 41);
		contentPane.add(lblNewLabel_1);
		
		Kullanici_adi_txt = new JTextField();
		Kullanici_adi_txt.setBounds(197, 80, 113, 19);
		contentPane.add(Kullanici_adi_txt);
		Kullanici_adi_txt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Şifre :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 124, 64, 29);
		contentPane.add(lblNewLabel_2);
		
		sifre_txt = new JTextField();
		sifre_txt.setBounds(197, 132, 113, 19);
		contentPane.add(sifre_txt);
		sifre_txt.setColumns(10);
		
		JButton btn_giris_yap = new JButton("Giriş Yap");
		btn_giris_yap.setBackground(new Color(192, 192, 192));
		btn_giris_yap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanici_adi,sifre;
				
				kullanici_adi=Kullanici_adi_txt.getText();
				sifre=sifre_txt.getText();
				
				String sql = "Select count(userName) as Arayuz from kayitolma where userName='"+kullanici_adi+"'and password= '"+sifre+"'";
				ResultSet myRs =Sql.yap();
				myRs=Sql.sorgula(sql);

				try {
					while(myRs.next()) {
						if(myRs.getInt("Arayuz")==1) {
							
							kahveler ac = new kahveler();
							ac.setVisible(true);
							
							
							//setVisible(false);
						}else {btn_giris_yap.setText("Hatalı giris");
							
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btn_giris_yap.setBounds(95, 185, 107, 19);
		contentPane.add(btn_giris_yap);
		
		JButton btn_kayit = new JButton("Kayıt ol");
		btn_kayit.setBackground(new Color(192, 192, 192));
		btn_kayit.setForeground(new Color(0, 0, 0));
		btn_kayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanici_adi,sifre,sql;
				kullanici_adi=Kullanici_adi_txt.getText();
				sifre=sifre_txt.getText();
				
				
				sql="INSERT INTO kayitolma(userName ,password ) VALUES ("+"'"+kullanici_adi+"','"+sifre+"')";
				
				System.out.println(sql);
				 
				 
				Sql.ekle(sql);
				
				
				
				
			}
		});
		btn_kayit.setBounds(212, 185, 107, 19);
		contentPane.add(btn_kayit);
		
		JButton btnNewButton = new JButton("Güncel Liste");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				liste ac = new liste();
				ac.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(329, 185, 107, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ACER\\Desktop\\oo.jpg"));
		lblNewLabel_4.setBounds(0, 0, 571, 338);
		contentPane.add(lblNewLabel_4);
	}
}
