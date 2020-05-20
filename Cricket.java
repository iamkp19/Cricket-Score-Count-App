import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.*;
import java.awt.event.*;

public class Cricket {

	private JFrame frmCricketScoreApp;
	private JTextField tfT1, tfT2;
	private JCheckBox cbT1, cbT2;
	private JButton btnEnter, btn1, btn2, btn3, btn4, btn5, btn6, btnWic, btnIo, btnReset, btnLb, btnNb, btnWd;;
	private JLabel TIB, lblTIB, lblColon, lblRun, lblDash, lblWic, lblFs, lblTr;
	private int R, W, Tr;
	private String t1, a;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cricket window = new Cricket();

					window.frmCricketScoreApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cricket() {
		initialize();
	}

	public void Enable() {
		lblColon.setVisible(true);
		lblRun.setVisible(true);
		lblDash.setVisible(true);
		lblWic.setVisible(true);
		btn1.setVisible(true);
		btn2.setVisible(true);
		btn3.setVisible(true);
		btn4.setVisible(true);
		btn5.setVisible(true);
		btn6.setVisible(true);
		btnWic.setVisible(true);
		btnNb.setVisible(true);
		btnLb.setVisible(true);
		btnWd.setVisible(true);
		lblTIB.setVisible(true);
		lblFs.setVisible(true);
		btnReset.setVisible(true);
		btnIo.setVisible(true);
	}

	public void Disable() {
		lblColon.setVisible(false);
		lblRun.setVisible(false);
		lblDash.setVisible(false);
		lblWic.setVisible(false);
		btn1.setVisible(false);
		btn2.setVisible(false);
		btn3.setVisible(false);
		btn4.setVisible(false);
		btn5.setVisible(false);
		btn6.setVisible(false);
		btnWic.setVisible(false);
		btnReset.setVisible(false);
		TIB.setVisible(false);
		lblTIB.setVisible(false);
		lblFs.setVisible(false);
		lblTr.setVisible(false);
		btnNb.setVisible(false);
		btnLb.setVisible(false);
		btnWd.setVisible(false);
		btnIo.setVisible(false);
		cbT1.setVisible(false);
		cbT2.setVisible(false);
	}

	public void Target() {
		lblTr.setVisible(true);
		a = lblTIB.getText();
		t1 = a + " : " + lblRun.getText() + " / " + lblWic.getText();
		lblFs.setText(t1);
		Tr = R + 1;
		lblTr.setText("Target = " + Tr);
	}

	public void Win() {
		if (Tr <= R && lblTr.isVisible() && a != lblTIB.getText()) {
			JOptionPane.showMessageDialog(null, lblTIB.getText() + " Is Winner");
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmCricketScoreApp = new JFrame();
		frmCricketScoreApp.setBackground(Color.WHITE);
		frmCricketScoreApp.getContentPane().setBackground(Color.WHITE);
		frmCricketScoreApp.setTitle("Cricket Score App");
		frmCricketScoreApp.setResizable(false);
		frmCricketScoreApp.setBounds(100, 100, 500, 300);
		frmCricketScoreApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCricketScoreApp.getContentPane().setLayout(null);

		JLabel lblTeam = new JLabel("Team 1 : ");
		lblTeam.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTeam.setBounds(10, 19, 50, 14);
		frmCricketScoreApp.getContentPane().add(lblTeam);

		JLabel lblTeam_1 = new JLabel("Team 2 : ");
		lblTeam_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTeam_1.setBounds(10, 50, 50, 14);
		frmCricketScoreApp.getContentPane().add(lblTeam_1);

		tfT1 = new JTextField();
		tfT1.setText(" ");
		tfT1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfT1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tfT1.setBounds(60, 16, 119, 20);
		frmCricketScoreApp.getContentPane().add(tfT1);
		tfT1.setColumns(10);

		tfT2 = new JTextField();
		tfT2.setText(" ");
		tfT2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tfT2.setColumns(10);
		tfT2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tfT2.setBounds(60, 46, 119, 20);
		frmCricketScoreApp.getContentPane().add(tfT2);

		cbT1 = new JCheckBox(" ");
		cbT1.setBackground(Color.WHITE);
		cbT1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				lblRun.setText("0");
				lblWic.setText("0");
				btnWic.setEnabled(true);
			}
		});
		cbT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblTIB.setText(cbT1.getText());
				Enable();
			}
		});
		cbT1.setVisible(false);
		buttonGroup.add(cbT1);
		cbT1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cbT1.setBounds(8, 152, 105, 23);
		frmCricketScoreApp.getContentPane().add(cbT1);

		cbT2 = new JCheckBox(" ");
		cbT2.setBackground(Color.WHITE);
		cbT2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				lblRun.setText("0");
				lblWic.setText("0");
				btnWic.setEnabled(true);
			}
		});
		cbT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblTIB.setText(cbT2.getText());
				Enable();
			}
		});
		cbT2.setVisible(false);
		buttonGroup.add(cbT2);
		cbT2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cbT2.setBounds(8, 182, 105, 23);
		frmCricketScoreApp.getContentPane().add(cbT2);

		TIB = new JLabel("Batting Team");
		TIB.setVisible(false);
		TIB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		TIB.setBounds(10, 127, 80, 15);
		frmCricketScoreApp.getContentPane().add(TIB);

		btnEnter = new JButton("ENTER");
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(0, 255, 0), new Color(0, 255, 0), null));
		btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cbT1.setVisible(true);
				cbT2.setVisible(true);
				TIB.setVisible(true);
				cbT1.setText(tfT1.getText());
				cbT2.setText(tfT2.getText());

			}
		});
		btnEnter.setBounds(116, 81, 63, 25);
		frmCricketScoreApp.getContentPane().add(btnEnter);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(200, 10, 8, 250);
		frmCricketScoreApp.getContentPane().add(separator);

		lblTIB = new JLabel("");
		lblTIB.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTIB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTIB.setBounds(215, 25, 115, 25);
		frmCricketScoreApp.getContentPane().add(lblTIB);

		lblColon = new JLabel(" : ");
		lblColon.setVisible(false);
		lblColon.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblColon.setBounds(331, 22, 15, 30);
		frmCricketScoreApp.getContentPane().add(lblColon);

		lblRun = new JLabel("0");
		lblRun.setVisible(false);
		lblRun.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRun.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRun.setBounds(345, 25, 27, 25);
		frmCricketScoreApp.getContentPane().add(lblRun);

		lblDash = new JLabel("-");
		lblDash.setVisible(false);
		lblDash.setHorizontalAlignment(SwingConstants.CENTER);
		lblDash.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDash.setBounds(373, 24, 15, 25);
		frmCricketScoreApp.getContentPane().add(lblDash);

		lblWic = new JLabel("0");
		lblWic.setVisible(false);
		lblWic.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblWic.setBounds(388, 25, 20, 25);
		frmCricketScoreApp.getContentPane().add(lblWic);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R++;
				lblRun.setText(R + "");
				Win();

			}
		});
		btn1.setVisible(false);
		btn1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn1.setBounds(225, 92, 60, 30);
		frmCricketScoreApp.getContentPane().add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R += 2;
				lblRun.setText(R + "");
				Win();
			}
		});
		btn2.setVisible(false);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn2.setBounds(315, 92, 60, 30);
		frmCricketScoreApp.getContentPane().add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R += 3;
				lblRun.setText(R + "");
				Win();
			}
		});
		btn3.setVisible(false);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn3.setBounds(405, 92, 60, 30);
		frmCricketScoreApp.getContentPane().add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R += 4;
				lblRun.setText(R + "");
				Win();
			}
		});
		btn4.setVisible(false);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn4.setBounds(225, 141, 60, 30);
		frmCricketScoreApp.getContentPane().add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R += 5;
				lblRun.setText(R + "");
				Win();
			}
		});
		btn5.setVisible(false);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn5.setBounds(315, 141, 60, 30);
		frmCricketScoreApp.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R += 6;
				lblRun.setText(R + "");
				Win();
			}
		});
		btn6.setVisible(false);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn6.setBounds(405, 141, 60, 30);
		frmCricketScoreApp.getContentPane().add(btn6);

		btnWic = new JButton("WICKET");
		btnWic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				W = Integer.parseInt(lblWic.getText());
				W++;
				lblWic.setText(W + "");
				if (W == 10) {
					btnWic.setEnabled(false);
					Target();
				}
			}
		});
		btnWic.setVisible(false);
		btnWic.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnWic.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnWic.setBounds(225, 232, 80, 30);
		frmCricketScoreApp.getContentPane().add(btnWic);

		btnReset = new JButton("RESET");
		btnReset.setVisible(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblFs.setText("");
				tfT1.setText(" ");
				tfT2.setText(" ");
				lblRun.setText("0");
				lblWic.setText("0");
				buttonGroup.clearSelection();
				Disable();
				lblTr.setText(lblRun.getText());
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, Color.RED, Color.RED, null));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(20, 81, 63, 25);
		frmCricketScoreApp.getContentPane().add(btnReset);

		btnNb = new JButton("NB");
		btnNb.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNb.setVisible(false);
		btnNb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				R = Integer.parseInt(lblRun.getText());
				R++;
				lblRun.setText(R + "");
				Win();
			}
		});
		btnNb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNb.setBounds(225, 188, 60, 30);
		frmCricketScoreApp.getContentPane().add(btnNb);

		btnLb = new JButton("LB");
		btnLb.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnLb.setVisible(false);
		btnLb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				R = Integer.parseInt(lblRun.getText());
				R++;
				lblRun.setText(R + "");
				Win();
			}
		});
		btnLb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLb.setBounds(315, 188, 60, 30);
		frmCricketScoreApp.getContentPane().add(btnLb);

		btnWd = new JButton("WD");
		btnWd.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnWd.setVisible(false);
		btnWd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				R = Integer.parseInt(lblRun.getText());
				R++;
				lblRun.setText(R + "");
				Win();
			}
		});
		btnWd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnWd.setBounds(405, 188, 60, 30);
		frmCricketScoreApp.getContentPane().add(btnWd);

		btnIo = new JButton("Inning Over");
		btnIo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Target();
			}
		});
		btnIo.setVisible(false);
		btnIo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnIo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnIo.setBounds(376, 232, 89, 30);
		frmCricketScoreApp.getContentPane().add(btnIo);

		lblFs = new JLabel("");
		lblFs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFs.setBounds(10, 221, 120, 15);
		frmCricketScoreApp.getContentPane().add(lblFs);

		lblTr = new JLabel("");
		lblTr.setVisible(false);
		lblTr.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTr.setBounds(10, 247, 100, 15);
		frmCricketScoreApp.getContentPane().add(lblTr);

	}
}
