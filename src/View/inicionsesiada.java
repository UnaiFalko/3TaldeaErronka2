package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.connect;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

/*
 * @author EkainKepaUnai
 * @version 1.0
 */

public class inicionsesiada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Aplikaziñoa abiarazten du
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicionsesiada frame = new inicionsesiada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Frame-a sortzen du
	 */
	public inicionsesiada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaioaHasi = new JLabel("SAIOA HASI");
		lblSaioaHasi.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblSaioaHasi.setBounds(171, 58, 101, 21);
		contentPane.add(lblSaioaHasi);
		
		JLabel lblErabiltzailea = new JLabel("ERABILTZAILEA");
		lblErabiltzailea.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblErabiltzailea.setBounds(39, 106, 110, 21);
		contentPane.add(lblErabiltzailea);
		
		JLabel lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblPasahitza.setBounds(39, 137, 110, 21);
		contentPane.add(lblPasahitza);
		
		textField = new JTextField();
		textField.setBounds(171, 108, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 139, 96, 19);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("SAIOA HASI");
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        String izena = textField.getText();

				        try {
				            Connection conexion = connect.conexion();

				            String sql = "SELECT rol FROM persona WHERE nombre = ? ";
				            PreparedStatement stmt = conexion.prepareStatement(sql);
				            stmt.setString(1, izena);

				            ResultSet rs = stmt.executeQuery();

				            if (rs.next()) {
				                String rol = rs.getString("rol");

				                if (rol.equalsIgnoreCase("VIP")) {
				                    new gestionusuarios().setVisible(true);
				                } else {
				                    new reservaentradas().setVisible(true);
				                }

				                dispose();

				            } else {
				                JOptionPane.showMessageDialog(null, "Erabiltzailea okerra");
				            }

				            rs.close();
				            stmt.close();
				            conexion.close();

				        } catch (Exception ex) {
				            ex.printStackTrace();
				            JOptionPane.showMessageDialog(null, "Errorea konexioan");
				        }
				    }
				});

		btnNewButton.setBounds(156, 201, 127, 25);
		contentPane.add(btnNewButton);
	}
}
