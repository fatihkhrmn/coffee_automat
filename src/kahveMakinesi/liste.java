package kahveMakinesi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;




import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class liste extends JFrame {

DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"kahve","boyut","ekstra","fiyat","isim"};
	Object[] satirlar = new Object[5];
	
	
	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btn_sil;
	private JTextField isim_txt;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					liste frame = new liste();
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
	public liste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		table.setBounds(34, 24, 200, 120);
		//contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 405, 206);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				isim_txt.setText( modelim.getValueAt(table.getSelectedRow(), 4).toString());
				//ogr_ad_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 1));
				//ogr_soyad_txt.setText((String) modelim.getValueAt(table.getSelectedRow(), 2));
			}
		});
		
		btnNewButton = new JButton("Listele");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
modelim.setRowCount(0);
				
				ResultSet myRs= Sql.yap2();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("kahve");
						satirlar[1] = myRs.getString("boyut");
						satirlar[2] = myRs.getString("ekle");
						satirlar[3] = myRs.getString("fiyat");
						satirlar[4] = myRs.getString("isimler");
						modelim.addRow(satirlar);
		
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);
				
				
			}
		});
		btnNewButton.setBounds(58, 242, 123, 25);
		contentPane.add(btnNewButton);
		
		btn_sil = new JButton("Siparişi Sil");
		btn_sil.setBackground(new Color(192, 192, 192));
		btn_sil.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String isim,sql;
				
				isim= isim_txt.getText();
				
				
				sql= "DELETE FROM secimler WHERE isimler='"+isim+"'";
				//System.out.println(sql);
				
				Sql.sil(sql);
				
			}
		});
		btn_sil.setBounds(237, 242, 123, 25);
		contentPane.add(btn_sil);
		
		isim_txt = new JTextField();
		isim_txt.setBounds(437, 69, 123, 25);
		contentPane.add(isim_txt);
		isim_txt.setColumns(10);
		
		lblNewLabel = new JLabel("Müşteri Adı");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(460, 38, 111, 21);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("ANA MENÜ");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(437, 311, 123, 25);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ACER\\Desktop\\coffeeee.jpg"));
		lblNewLabel_1.setBounds(-6, 1, 593, 359);
		contentPane.add(lblNewLabel_1);
	}
}
