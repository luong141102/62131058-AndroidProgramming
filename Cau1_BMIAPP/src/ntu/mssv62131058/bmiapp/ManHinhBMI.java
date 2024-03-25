package ntu.mssv62131058.bmiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel BMI;
	private JTextField txtCN;
	private JTextField txtCC;
	private JTextField txtKQ;

	public static void main(String[] args) {
		
	}
	public ManHinhBMI() {
		setTitle("BMI APP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 473);
		BMI = new JPanel();
		BMI.setBackground(new Color(128, 255, 128));
		BMI.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(BMI);
		BMI.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NÂN NẶNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(27, 34, 94, 35);
		BMI.add(lblNewLabel);
		
		JLabel lblChiuCao = new JLabel("CHIỀU CAO");
		lblChiuCao.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChiuCao.setBounds(27, 109, 108, 35);
		BMI.add(lblChiuCao);
		
		txtCN = new JTextField();
		txtCN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCN.setBounds(146, 34, 167, 35);
		BMI.add(txtCN);
		txtCN.setColumns(10);
		
		txtCC = new JTextField();
		txtCC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCC.setColumns(10);
		txtCC.setBounds(145, 109, 167, 35);
		BMI.add(txtCC);
		
		JButton btnKQ = new JButton("RESULT");
		btnKQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result();
			}
		});
		btnKQ.setForeground(new Color(0, 0, 0));
		btnKQ.setBackground(new Color(0, 128, 255));
		btnKQ.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnKQ.setBounds(124, 181, 94, 42);
		BMI.add(btnKQ);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setBounds(48, 259, 245, 42);
		BMI.add(txtKQ);
		txtKQ.setColumns(10);
		
		JButton btnRS = new JButton("RESET");
		btnRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset();
			}
		});
		btnRS.setForeground(Color.BLACK);
		btnRS.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnRS.setBackground(new Color(255, 255, 0));
		btnRS.setBounds(124, 355, 94, 42);
		BMI.add(btnRS);
	}
	void Result() {
		String strA = txtCN.getText();
		String strB = txtCC.getText();
		double soA = Double.parseDouble(strA);
		double soB = Double.parseDouble(strB);
		double kq = soA / (soB*soB);
		String KQ;
		if(kq < 18.5) {
			KQ = "Gầy";
		}else if(kq >=18.5 && kq <=24.9) {
			KQ = "Bình thường";
		}else if(kq>=25 && kq<=29.9) {
			KQ = "Tiền Béo Phì";
		}else if (kq >= 30 && kq <=34.9) {
            KQ = "Béo Phì Độ 1";
        } else if (kq >= 35 && kq <=39.9) {
            KQ = "Béo Phì Độ 2";
        } else {
            KQ = "Béo Phì Độ 3";
        }
		txtKQ.setText(KQ);
	}
	void Reset() {
		txtCN.setText("");
		txtCC.setText("");
		txtKQ.setText("");
	}
}
