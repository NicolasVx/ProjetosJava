package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaFuncionarios {

	private JFrame frame;
	private JTextField jTFId;
	private JTextField jTFNome;
	private JTextField jTFEmail;
	private JTextField jTFCargo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField jTFNum;
	private JTextField jTFSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionarios window = new TelaFuncionarios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaFuncionarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 836, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel jLId = new JLabel("Id");
		jLId.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLId.setBounds(33, -6, 130, 40);
		frame.getContentPane().add(jLId);
		
		jTFId = new JTextField();
		jTFId.setBounds(33, 30, 55, 30);
		frame.getContentPane().add(jTFId);
		jTFId.setColumns(10);
		
		jTFNome = new JTextField();
		jTFNome.setColumns(10);
		jTFNome.setBounds(33, 90, 230, 30);
		frame.getContentPane().add(jTFNome);
		
		JLabel jLNome = new JLabel("Nome:");
		jLNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLNome.setBounds(33, 54, 130, 40);
		frame.getContentPane().add(jLNome);
		
		JLabel jLBSexo = new JLabel("Sexo");
		jLBSexo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLBSexo.setBounds(33, 116, 130, 40);
		frame.getContentPane().add(jLBSexo);
		
		jTFEmail = new JTextField();
		jTFEmail.setColumns(10);
		jTFEmail.setBounds(33, 214, 230, 30);
		frame.getContentPane().add(jTFEmail);
		
		JLabel jLEmail = new JLabel("Email:");
		jLEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLEmail.setBounds(33, 178, 130, 40);
		frame.getContentPane().add(jLEmail);
		
		jTFCargo = new JTextField();
		jTFCargo.setColumns(10);
		jTFCargo.setBounds(33, 273, 230, 30);
		frame.getContentPane().add(jTFCargo);
		
		JLabel jLCargo = new JLabel("Cargo:");
		jLCargo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLCargo.setBounds(33, 237, 130, 40);
		frame.getContentPane().add(jLCargo);
		
		JRadioButton jRBMasc = new JRadioButton("Masculino");
		buttonGroup.add(jRBMasc);
		jRBMasc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jRBMasc.setBounds(33, 149, 93, 21);
		frame.getContentPane().add(jRBMasc);
		
		JRadioButton jRBFem = new JRadioButton("Feminino");
		buttonGroup.add(jRBFem);
		jRBFem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jRBFem.setBounds(130, 151, 93, 21);
		frame.getContentPane().add(jRBFem);
		
		JRadioButton jRBOutros = new JRadioButton("Outros");
		buttonGroup.add(jRBOutros);
		jRBOutros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jRBOutros.setBounds(224, 151, 93, 21);
		frame.getContentPane().add(jRBOutros);
		
		JButton jBTN1 = new JButton("|<");
		jBTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jBTN1.setBounds(33, 403, 45, 30);
		frame.getContentPane().add(jBTN1);
		
		JButton jBTNVoltar = new JButton("<");
		jBTNVoltar.setBounds(81, 403, 45, 30);
		frame.getContentPane().add(jBTNVoltar);
		
		JButton jBTNSeguir = new JButton(">");
		jBTNSeguir.setBounds(218, 403, 45, 30);
		frame.getContentPane().add(jBTNSeguir);
		
		JButton jBTNFim = new JButton(">|");
		jBTNFim.setBounds(272, 403, 45, 30);
		frame.getContentPane().add(jBTNFim);
		
		jTFNum = new JTextField();
		jTFNum.setHorizontalAlignment(SwingConstants.CENTER);
		jTFNum.setText("1");
		jTFNum.setEditable(false);
		jTFNum.setBounds(140, 404, 62, 30);
		frame.getContentPane().add(jTFNum);
		jTFNum.setColumns(10);
		
		JButton jBTNCadastrar = new JButton("Cadastrar");
		jBTNCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jBTNCadastrar.setBounds(33, 451, 99, 30);
		frame.getContentPane().add(jBTNCadastrar);
		
		JButton jBTNLimpar = new JButton("Limpar");
		jBTNLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jBTNLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		jBTNLimpar.setBounds(218, 451, 99, 30);
		frame.getContentPane().add(jBTNLimpar);
		
		jTFSalario = new JTextField();
		jTFSalario.setColumns(10);
		jTFSalario.setBounds(33, 339, 130, 30);
		frame.getContentPane().add(jTFSalario);
		
		JLabel jLSalario = new JLabel("Salario:");
		jLSalario.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLSalario.setBounds(33, 303, 130, 40);
		frame.getContentPane().add(jLSalario);
	}
	
	private void limpar() {
		jTFId.setText("");
		jTFNome.setText("");
		jTFEmail.setText("");
		jTFCargo.setText("");
		buttonGroup.clearSelection();
		jTFId.requestFocus();
	}
}
