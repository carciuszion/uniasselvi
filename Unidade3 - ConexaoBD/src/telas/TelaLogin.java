package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pswSenha;
	
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	static TelaLogin frame = new TelaLogin();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					con = Conexao.conectar();
					System.out.println("Conexão com o banco na tela de login Ok");
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 413, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio:");
		lblNewLabel.setBounds(82, 49, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(82, 86, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(146, 46, 166, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario(txtUsuario.getText(), new String(pswSenha.getPassword()));
				String sql = "select * from `acesso`.`usuario` where `nome`=? and `senha`=? ";
				boolean logou = false;
				try {
					ps = con.prepareStatement(sql);
					ps.setString(1, usuario.getNome());
					ps.setString(2, usuario.getSenha());
					rs = ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog( rootPane , "Usuario logado");	
						logou = true;
					}else {
						JOptionPane.showMessageDialog( rootPane , "Usuário/senha inválidos");
					}
					ps.close();
					txtUsuario.setText("");
					pswSenha.setText("");
					txtUsuario.requestFocus();
					if (logou) {
						TelaLista frame1 = new TelaLista();
						frame1.main();
						frame1.setVisible(true);
						frame.setVisible(false);
						frame.dispose();
					}
					
				} catch (Exception e2) {
					System.out.println("Erro no sql: " + sql);
					System.out.println("Erro no sql: " + e2);
				}
				
			}
		});
		btnLogin.setBounds(82, 145, 107, 23);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario(txtUsuario.getText(), new String(pswSenha.getPassword()));
				String sql = "INSERT INTO `acesso`.`usuario` (`nome`, `senha`) VALUES (?, ?);";
				try {
					ps = con.prepareStatement(sql);
					ps.setString(1, usuario.getNome());
					ps.setString(2, usuario.getSenha());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso");
					txtUsuario.setText("");
					pswSenha.setText("");
					txtUsuario.requestFocus();
				} catch (SQLException e1) {
					if (e1.getErrorCode() == 1062) {
						JOptionPane.showMessageDialog(rootPane, "Usuário " + usuario.getNome().toUpperCase() +  " já cadastrado no banco de dados. Informe um nome direferente.");	
						txtUsuario.requestFocus();
					}else {
						System.out.println("Erro ao inserir: " + sql );
						System.out.println("Erro : " + e1 );
						e1.printStackTrace();						
					}

				}
				
						
			}
		});
		btnNewButton.setBounds(199, 145, 113, 23);
		contentPane.add(btnNewButton);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(146, 83, 166, 20);
		contentPane.add(pswSenha);
	}
}
