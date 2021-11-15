package telas;


import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TelaLista extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static private JTable tbusuarios;
	
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	static TelaLista frame = new TelaLista();


	public TelaLista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tbusuarios = new JTable();
		tbusuarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Senha"
			}
		));
		tbusuarios.getColumnModel().getColumn(0).setPreferredWidth(62);
		tbusuarios.getColumnModel().getColumn(1).setPreferredWidth(162);
		tbusuarios.getColumnModel().getColumn(2).setPreferredWidth(185);
		tbusuarios.setBounds(68, 11, 274, 114);
		contentPane.add(tbusuarios);
	}
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DefaultTableModel dt = (DefaultTableModel) tbusuarios.getModel();
				try {
					con = Conexao.conectar();
					System.out.println("Conexão com o banco na tela de Lista Ok");

				} catch (Exception e) {
					e.printStackTrace();
				}				
				
				String sql = "select * from `acesso`.`usuario` order by nome  ";
				try {
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					while (rs.next()) {
						dt.addRow(new Object[] {
								rs.getString(1).toString(),
								rs.getString(2).toString(),
								rs.getString(3).toString(),
						});
					}
					tbusuarios.setModel(dt);
					ps.close();
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
			}
		});
	}
	
}


