 package tr.com.ferdogan.fe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import tr.com.ferdogan.dal.KategoriDAL;
import tr.com.ferdogan.interfaces.Felnterfaces;
import tr.com.ferdogan.types.KategoriContract;

public class KategoriEkleFE extends JDialog implements Felnterfaces {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KategoriEkleFE() {
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Kategori Ekle"));

		add(panel);
		setTitle("Kategori Ekle");
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	@SuppressWarnings("unchecked")
	public JPanel initPanel() {

		JPanel panel = new JPanel(new GridLayout(3, 2));
		
		
		JLabel adiLabel = new JLabel("Kategori Adý:", JLabel.RIGHT);
		panel.add(adiLabel);
		JTextField adiField = new JTextField(15);
		panel.add(adiField);
		JLabel kategoriLabel = new JLabel("Kategori seç:", JLabel.RIGHT);
		panel.add(kategoriLabel);
		@SuppressWarnings("rawtypes")
		JComboBox kategoriBox = new JComboBox(new KategoriDAL().GetAllParentId().toArray());
		panel.add(kategoriBox);
		kategoriBox.insertItemAt("-Kategori seçiniz--", 0);
		kategoriBox.setSelectedIndex(0);
		
		JButton kaydetButton = new JButton("Kaydet");
		panel.add(kaydetButton);
		kaydetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				KategoriContract contract= new KategoriContract();
				
				
				
				if(kategoriBox.getSelectedIndex()!=0) {
					KategoriContract casContract=(KategoriContract) kategoriBox.getSelectedItem();
					
					contract.setAdi(adiField.getText());  
					contract.setParentId(casContract.getId());
					
					new KategoriDAL().Insert(contract);
					JOptionPane.showMessageDialog(null, contract.getAdi()+ " adlý Kategori baþarýlý bir þekilde eklenmiþtir.");
					
					
				}else {
					
					contract.setAdi(adiField.getText());  
					contract.setParentId(kategoriBox.getSelectedIndex());
					
					new KategoriDAL().Insert(contract);
					JOptionPane.showMessageDialog(null, contract.getAdi()+ " adlý Kategori baþarýlý bir þekilde eklenmiþtir.");
				}
				
				
				
			}
		});
		JButton iptalButton = new JButton("Ýptal");
		panel.add(iptalButton);
		iptalButton.addActionListener(new ActionListener() {

			   public void actionPerformed(ActionEvent e) {
			    dispose();

			   
			   }
			  });
		return panel;
	}

	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
