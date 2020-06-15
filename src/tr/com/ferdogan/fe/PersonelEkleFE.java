package tr.com.ferdogan.fe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import tr.com.ferdogan.dal.PersonelDAL;
import tr.com.ferdogan.interfaces.Felnterfaces;
import tr.com.ferdogan.types.PersonelContract;

public class PersonelEkleFE extends JDialog implements Felnterfaces {

	public PersonelEkleFE() {
		
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel=initPanel();
		
		panel.setBorder(BorderFactory.createTitledBorder("Personel Ekle"));
		add(panel);
		
		setTitle("Personel Ekle");
		pack();
		setLocationRelativeTo(null);
		setModalityType(DEFAULT_MODALITY_TYPE);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(3, 2));
		
		
		JLabel adiSoyadiLabel= new JLabel("Adý Soyadý:",JLabel.RIGHT);
		panel.add(adiSoyadiLabel);
		JTextField adiSoyadiField= new JTextField(15);
		panel.add(adiSoyadiField);
		
		JLabel eMailLabel= new JLabel("Email:",JLabel.RIGHT);
		panel.add(eMailLabel);
		JTextField eMailField= new JTextField(15);
		panel.add(eMailField);
		
		JButton kaydetButton = new JButton("Kaydet");
		panel.add(kaydetButton);
		
		JButton iptalButton = new JButton("Ýptal");
		panel.add(iptalButton);
		
		kaydetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PersonelContract contract= new PersonelContract();
				contract.setAdiSoyadi(adiSoyadiField.getText());
				contract.setEmail(eMailField.getText());
				
				new PersonelDAL().Insert(contract);
				JOptionPane.showMessageDialog(null, contract.getAdiSoyadi()+" adlý personel eklenmiþtir.");
				
			}
		});
		
		
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
