package tr.com.ferdogan.fe;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.jdi.Field;

import tr.com.ferdogan.dal.KategoriDAL;
import tr.com.ferdogan.interfaces.Felnterfaces;

public class MusteriEkleFE extends JDialog implements Felnterfaces{

	public MusteriEkleFE() {
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Müþteri Ekle"));

		add(panel);
		setTitle("Müþteri Ekle");
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	@Override
	public JPanel initPanel() {
		JPanel panel=new JPanel(new BorderLayout());
		
        JPanel FieldPanel = new JPanel(new GridLayout(5, 2));
        
        JPanel buttonPanel= new JPanel(new GridLayout(1,2));
        
		
		
		JLabel adiSoyadiLabel = new JLabel("Adý Soyadý:", JLabel.RIGHT);
		FieldPanel.add(adiSoyadiLabel);
		JTextField adiSoyadiField = new JTextField(15);
		FieldPanel.add(adiSoyadiField);
		JLabel telefonLabel=new JLabel("Telefon:", JLabel.RIGHT);
		FieldPanel.add(telefonLabel);
		JTextField telefonField = new JTextField(15);
		FieldPanel.add(telefonField);
		JLabel sehirSecLabel=new JLabel("Þehir Seç", JLabel.RIGHT);
		FieldPanel.add(sehirSecLabel);
		JComboBox sehirlerBox= new JComboBox();
		FieldPanel.add(sehirlerBox);
		JLabel adresLabel=new JLabel("Adres");
		FieldPanel.add(adresLabel);
		
		JTextArea adresArea= new JTextArea(7,1);
		JScrollPane pane=new JScrollPane(adresArea);
		
		pane.setBorder(BorderFactory.createTitledBorder("Adres Bilgisi"));
		
		JButton kaydetButton = new JButton("Kaydet");
		buttonPanel.add(kaydetButton);
		JButton iptalButton = new JButton("Ýptal");
		buttonPanel.add(iptalButton); 
		
		panel.add(FieldPanel, BorderLayout.NORTH);
		panel.add(pane, BorderLayout.CENTER);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		
		 
		
		
		
		
		
		
		
		
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
