package kahveMakinesi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kahveMakinesi.Sql;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class kahveler extends JFrame {
	static int a;
	static int b;
	static int c;
	private JPanel contentPane;
	private JTextField kahve_txt;
	private JTextField boyut_txt;
	private JTextField ekle_txt;
	private JTextField fiyat_txt;
	private JTextField ismi_al_txt;
	private JTextField gelen_para;
	private JTextField para_ustu;
	private final JLabel lblNewLabel_7 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kahveler frame = new kahveler();
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
	public kahveler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_latte = new JButton("Latte");
		btn_latte.setBackground(new Color(192, 192, 192));
		btn_latte.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_latte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kahve_txt.setText("LATTE");
				a=30;
			}
		});
		btn_latte.setBounds(51, 74, 111, 21);
		contentPane.add(btn_latte);
		
		JButton btn_filtre = new JButton("Filtre");
		btn_filtre.setBackground(new Color(192, 192, 192));
		btn_filtre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_filtre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kahve_txt.setText("FILTRE");
				a=20;
			}
		});
		btn_filtre.setBounds(51, 108, 111, 21);
		contentPane.add(btn_filtre);
		
		JButton btn_mocha = new JButton("Mocha");
		btn_mocha.setBackground(new Color(192, 192, 192));
		btn_mocha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_mocha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kahve_txt.setText("MOCHA");
				a=40;
			}
		});
		btn_mocha.setBounds(51, 139, 111, 21);
		contentPane.add(btn_mocha);
		
		JButton btn_americano = new JButton("Americano");
		btn_americano.setBackground(new Color(192, 192, 192));
		btn_americano.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_americano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kahve_txt.setText("AMERICANO");
				a=35;
			}
		});
		btn_americano.setBounds(51, 170, 111, 21);
		contentPane.add(btn_americano);
		
		JLabel lblNewLabel = new JLabel("Boyut Seçiniz");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(239, 22, 111, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Tall");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boyut_txt.setText("TALL");
				b=0;
				
				
			}
		});
		btnNewButton.setBounds(233, 73, 111, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grande");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boyut_txt.setText("GRANDE");
				b=5;
			}
		});
		btnNewButton_1.setBounds(236, 121, 111, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Venti");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boyut_txt.setText("VENTI");
				b=10;
			}
		});
		btnNewButton_2.setBounds(233, 170, 111, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Eklenecek Aroma");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(419, 32, 150, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Süt");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekle_txt.setText("SUT");
				c=5;
			}
		});
		btnNewButton_3.setBounds(419, 73, 111, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Karamel");
		btnNewButton_1_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekle_txt.setText("KARAMEL");
				c=10;
			}
		});
		btnNewButton_1_1.setBounds(419, 121, 111, 21);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Hiçbir Şey");
		btnNewButton_2_1.setBackground(new Color(192, 192, 192));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekle_txt.setText("SADE");
				c=0;
			}
		});
		btnNewButton_2_1.setBounds(419, 170, 111, 21);
		contentPane.add(btnNewButton_2_1);
		
		kahve_txt = new JTextField();
		kahve_txt.setBounds(51, 212, 111, 21);
		contentPane.add(kahve_txt);
		kahve_txt.setColumns(10);
		
		boyut_txt = new JTextField();
		boyut_txt.setBounds(233, 212, 111, 21);
		contentPane.add(boyut_txt);
		boyut_txt.setColumns(10);
		
		ekle_txt = new JTextField();
		ekle_txt.setBounds(419, 213, 111, 21);
		contentPane.add(ekle_txt);
		ekle_txt.setColumns(10);
		
		
		ismi_al_txt = new JTextField();
		ismi_al_txt.setBounds(27, 282, 96, 19);
		contentPane.add(ismi_al_txt);
		ismi_al_txt.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("KAYDET");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String kahve,boyut,eklenecek,sql,isim;
				isim= ismi_al_txt.getText();
			    kahve=kahve_txt.getText();
				boyut=boyut_txt.getText();
				eklenecek=ekle_txt.getText();
				
				int fiyat=a+b+c;
				String s=Integer.toString(fiyat);
				fiyat_txt.setText(s);
				
				sql="INSERT INTO secimler(kahve,boyut,ekle,fiyat,isimler) VALUES ("+"'"+kahve+"','"+boyut+"',"+"'"+eklenecek+"','"+s+"','"+isim+"')";
				//System.out.println(sql);
				 
				 
				Sql.ekle(sql);
	
			}
		});
		btnNewButton_4.setBounds(464, 355, 96, 21);
		contentPane.add(btnNewButton_4);
		
		fiyat_txt = new JTextField();
		fiyat_txt.setEditable(false);
		fiyat_txt.setBounds(434, 282, 96, 19);
		contentPane.add(fiyat_txt);
		fiyat_txt.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Kahve Fiyatı");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(444, 259, 92, 13);
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("İsim");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(61, 259, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_5 = new JButton("ANA MENÜ");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_5.setBounds(341, 355, 96, 21);
		contentPane.add(btnNewButton_5);
		
		gelen_para = new JTextField();
		gelen_para.setBounds(148, 282, 96, 19);
		contentPane.add(gelen_para);
		gelen_para.setColumns(10);
		
		
		JLabel lblNewLabel_4 = new JLabel("Para gir");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(167, 254, 84, 21);
		contentPane.add(lblNewLabel_4);
		
		para_ustu = new JTextField();
		para_ustu.setEditable(false);
		para_ustu.setBounds(297, 282, 96, 19);
		contentPane.add(para_ustu);
		para_ustu.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Para Üstü");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(308, 259, 85, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_6 = new JButton("Onayla");
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ab = Integer.parseInt(gelen_para.getText());
				int sonuc =ab-a-b-c;
				//System.out.println(sonuc);
				String sa=Integer.toString(sonuc);
				para_ustu.setText(sa);
				
				
				if(sonuc<0) {
					hata ac = new hata();
					ac.setVisible(true);
					
				}
				
				
			}
		});
		btnNewButton_6.setBounds(148, 314, 96, 21);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_6 = new JLabel("Tür Seçiniz");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(73, 26, 100, 24);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ACER\\Desktop\\coffeeee.jpg"));
		lblNewLabel_7.setBounds(0, 0, 604, 397);
		contentPane.add(lblNewLabel_7);
	}
}
