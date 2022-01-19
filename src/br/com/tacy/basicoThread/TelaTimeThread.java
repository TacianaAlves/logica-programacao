package br.com.tacy.basicoThread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHora = new JLabel("Time thead 1");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time thead 2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	private Runnable thead1 = new Runnable() {

		public void run() {
			while (true) {
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private Runnable thead2 = new Runnable() {

		public void run() {
			while (true) {
				mostraTempo2
						.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;

	public TelaTimeThread() {
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBangConstraints = new GridBagConstraints();
		gridBangConstraints.gridx = 0;
		gridBangConstraints.gridy = 0;
		gridBangConstraints.gridwidth = 2;
		gridBangConstraints.insets = new Insets(5, 10, 5, 5);
		gridBangConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		gridBangConstraints.gridy++;
		jPanel.add(descricaoHora, gridBangConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBangConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBangConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBangConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBangConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBangConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBangConstraints);

		gridBangConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBangConstraints.gridy++;
		jPanel.add(jButton, gridBangConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBangConstraints.gridx++;
		jPanel.add(jButton2, gridBangConstraints);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thead1);
				thread1Time.start();

				thread2Time = new Thread(thead2);
				thread2Time.start();

				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});
		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();

				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});

		jButton2.setEnabled(false);

		add(jPanel, BorderLayout.WEST);

		setVisible(true);
		
	}
}
