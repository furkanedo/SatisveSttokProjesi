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
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import tr.com.ferdogan.dal.AccountsDAL;
import tr.com.ferdogan.dal.AccountsDAL;
import tr.com.ferdogan.dal.PersonelDAL;
import tr.com.ferdogan.dal.YetkilerDAL;
import tr.com.ferdogan.interfaces.Felnterfaces;
import tr.com.ferdogan.types.AccountsContract;
import tr.com.ferdogan.types.KategoriContract;
import tr.com.ferdogan.types.PersonelContract;
import tr.com.ferdogan.types.YetkilerContract;

public class SifreIslemleriFE extends JDialog implements Felnterfaces {

	public SifreIslemleriFE() {
		initPencere();
		
	}

	@Override
	public void initPencere() {
		
        JPanel panel=initPanel();
		
		panel.setBorder(BorderFactory.createTitledBorder("Þifre Belirleme Ýþlemleri"));
		add(panel);
		
		setTitle("Þifre Belirleme Ýþlemleri");
		pack();
		setLocationRelativeTo(null);
		setModalityType(DEFAULT_MODALITY_TYPE);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
	}

	@Override
	public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
		
		
		JLabel personelLabel= new JLabel("Personel Seç:",JLabel.RIGHT);
		panel.add(personelLabel);
		JComboBox personelBox=new JComboBox(new PersonelDAL().GetAll().toArray());
		panel.add(personelBox);
		JLabel yetkiLabel= new JLabel("Yetki Seç:",JLabel.RIGHT );
		panel.add(yetkiLabel);
		JComboBox yetkiBox=new JComboBox(new YetkilerDAL().GetAll().toArray());
		panel.add(yetkiBox);
		JLabel passwordLabel=new JLabel("Þifre Belirle:", JLabel.RIGHT);
		panel.add(passwordLabel);
		JPasswordField passwordField= new JPasswordField(10);
		panel.add(passwordField); 
		JLabel passTekrarLabel= new JLabel("Tekrar Þifre:",JLabel.RIGHT );
		panel.add(passTekrarLabel);
		JPasswordField passTekrarField=new JPasswordField(10);
		panel.add(passTekrarField);
		
		JButton kaydetButton = new JButton("Kaydet");
		panel.add(kaydetButton);
		
		JButton iptalButton = new JButton("Ýptal");
		panel.add(iptalButton);
		
		kaydetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AccountsContract contract= new AccountsContract();
				PersonelContract pContract= (PersonelContract) personelBox.getSelectedItem();
				YetkilerContract yContract= (YetkilerContract) yetkiBox.getSelectedItem();
				
				
				if(passwordField.getText().equals(passTekrarField.getText())) {
					
					contract.setPersonelId(pContract.getId());
					contract.setYetkiId(yContract.getId());
					contract.setSifre(passwordField.getText());
					
					
					
					new AccountsDAL().Insert(contract);
					JOptionPane.showMessageDialog(null, pContract.getAdiSoyadi()
							+ " adlý kiþiye"+ 
							" þifre eklenmiþtir");
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Þifreler Uyuþmuyor!");
				}
				
				
				
				new AccountsDAL().Insert(contract);
				
				
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
