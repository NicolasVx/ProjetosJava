package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entities.Cliente;

public class TelaCliente {

	private JFrame frame;
	private JTextField jTFId;
	private JTextField jTFNome;
	private JTextField jTFEmail;
	private JTextField jTFLimite;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton jRBMasc;
	JRadioButton jRBFem;
	JRadioButton jRBOutros;
	JButton jBTNDisplay;
	private Cliente[] cliente = new Cliente[1000];
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente window = new TelaCliente();
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
	public TelaCliente() {
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
		jLId.setBounds(33, 8, 130, 40);
		frame.getContentPane().add(jLId);
		
		jTFId = new JTextField();
		jTFId.setBounds(33, 44, 55, 30);
		frame.getContentPane().add(jTFId);
		jTFId.setColumns(10);
		
		jTFNome = new JTextField();
		jTFNome.setColumns(10);
		jTFNome.setBounds(33, 104, 230, 30);
		frame.getContentPane().add(jTFNome);
		
		JLabel jLNome = new JLabel("Nome:");
		jLNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLNome.setBounds(33, 68, 130, 40);
		frame.getContentPane().add(jLNome);
		
		JLabel jLBSexo = new JLabel("Sexo");
		jLBSexo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLBSexo.setBounds(33, 130, 130, 40);
		frame.getContentPane().add(jLBSexo);
		
		jTFEmail = new JTextField();
		jTFEmail.setColumns(10);
		jTFEmail.setBounds(33, 228, 230, 30);
		frame.getContentPane().add(jTFEmail);
		
		JLabel jLEmail = new JLabel("Email:");
		jLEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLEmail.setBounds(33, 192, 130, 40);
		frame.getContentPane().add(jLEmail);
		
		jTFLimite = new JTextField();
		jTFLimite.setColumns(10);
		jTFLimite.setBounds(33, 288, 130, 30);
		frame.getContentPane().add(jTFLimite);
		
		JLabel jLLimite = new JLabel("Limite:");
		jLLimite.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		jLLimite.setBounds(33, 252, 130, 40);
		frame.getContentPane().add(jLLimite);
		
		jRBMasc = new JRadioButton("Masculino");
		buttonGroup.add(jRBMasc);
		jRBMasc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jRBMasc.setBounds(33, 163, 93, 21);
		frame.getContentPane().add(jRBMasc);
		
		jRBFem = new JRadioButton("Feminino");
		buttonGroup.add(jRBFem);
		jRBFem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jRBFem.setBounds(130, 165, 93, 21);
		frame.getContentPane().add(jRBFem);
		
		jRBOutros = new JRadioButton("Outros");
		buttonGroup.add(jRBOutros);
		jRBOutros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jRBOutros.setBounds(224, 165, 93, 21);
		frame.getContentPane().add(jRBOutros);
		
		JButton jBTN1 = new JButton("|<");
		jBTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jBTN1.setBounds(33, 344, 45, 30);
		frame.getContentPane().add(jBTN1);
		
		JButton jBTNVoltar = new JButton("<");
		jBTNVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jBTNVoltar.setBounds(81, 344, 45, 30);
		frame.getContentPane().add(jBTNVoltar);
		
		JButton jBTNSeguir = new JButton(">");
		jBTNSeguir.setBounds(218, 344, 45, 30);
		frame.getContentPane().add(jBTNSeguir);
		
		JButton jBTNFim = new JButton(">|");
		jBTNFim.setBounds(272, 344, 45, 30);
		frame.getContentPane().add(jBTNFim);
		
		JButton jBTNCadastrar = new JButton("Cadastrar");
		jBTNCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		jBTNCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jBTNCadastrar.setBounds(33, 392, 99, 30);
		frame.getContentPane().add(jBTNCadastrar);
		
		JButton jBTNLimpar = new JButton("Limpar");
		jBTNLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jBTNLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		jBTNLimpar.setBounds(218, 392, 99, 30);
		frame.getContentPane().add(jBTNLimpar);
		
		jBTNDisplay = new JButton("1");
		jBTNDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar();
			}
		});
		jBTNDisplay.setBounds(134, 344, 76, 30);
		frame.getContentPane().add(jBTNDisplay);
	}
	
	private void limpar() {
		jTFId.setText("");
		jTFNome.setText("");
		jTFEmail.setText("");
		jTFLimite.setText("");
		buttonGroup.clearSelection();
		jTFId.requestFocus();
	}
	private void cadastrar() {
		Cliente p = new Cliente();
		p.setId(Integer.parseInt(jTFId.getText()));
		p.setNome(jTFNome.getText());
		String sexo;
		if (jRBMasc.isSelected()) {
			sexo = "Masc";
		} else if(jRBFem.isSelected()) {
			sexo = "Fem";
		}else {
			sexo = "Outros";
		}
		p.setEmail(jTFEmail.getText());
		p.setLimite(Double.parseDouble(jTFLimite.getText()));
		cliente[i] = p;
		i++;
		limpar();
	}
	private void mostrar() {
		int i = Integer.parseInt(jBTNDisplay.getText());
		i = i - 1;
		Cliente p = cliente[i];
		jTFId.setText(String.valueOf(p.getId()));
		jTFNome.setText(p.getNome());
		if(p.getSexo().equals("Masc")) {
			jRBMasc.setSelected(true);
		}else if(p.getSexo().equals("Fem")) {
			jRBFem.setSelected(true);
		}else {
			jRBOutros.setSelected(true);
		}
		jTFEmail.setText(p.getEmail());
		jTFLimite.setText(String.valueOf(p.getLimite()));
	}
}
