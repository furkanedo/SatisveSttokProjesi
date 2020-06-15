package tr.com.ferdogan.fe;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import sun.tools.jconsole.Tab;
import tr.com.ferdogan.interfaces.Felnterfaces;
import tr.com.ferdogan.utilities.MenulerFE;

public class AnaPencereFE extends JFrame implements Felnterfaces {

	public AnaPencereFE() {
		initPencere();
	}

	@Override
	public void initPencere() {
		
		JPanel panel= initPanel();
		
		JMenuBar bar= initBar();
		
		add(panel);
		setJMenuBar(bar);
		
		setTitle("Satýþ ve Stok Programý");
		 setSize(600, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	@Override
	public JPanel initPanel() {
		
		
		JPanel panel= new JPanel(new BorderLayout());
		
		JTabbedPane pane= initTabs();
		panel.add(pane, BorderLayout.CENTER);
		
		
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		JMenuBar bar= MenulerFE.initBar();
		
		
		
		
		return bar;
	}

	@Override
	public JTabbedPane initTabs() { 
		JTabbedPane pane=new JTabbedPane();
		
		ImageIcon icon=new ImageIcon("icons/buildings (1).png");
		ImageIcon icon2=new ImageIcon("icons/buildings (1).png");
		
		
		/* Stok Ýþlemleri*/
		JPanel stokPanel=new JPanel(new BorderLayout());
		JPanel satisPanel=new JPanel(new BorderLayout());
		JPanel stokSolPanel= new JPanel(new BorderLayout());
		JPanel stokSolUstPanel=new JPanel(new GridLayout(4,2));
		JPanel stoksolAltPanel=new JPanel();
		stokSolPanel.setBorder(BorderFactory.createTitledBorder("Stok Ýþlemleri"));
		Object [] stokKolonlar= {"ID", "PERSONEL ADI", "ÜRÜN ADI", "ADETÝ", "TARÝHÝ"};
		DefaultTableModel model= new DefaultTableModel(stokKolonlar,0);
		JTable table = new JTable(model);
		JScrollPane stokTablePane= new JScrollPane(table);
		
		JLabel stokUrunAdiLabel= new JLabel("Ürün Adý: ", JLabel.RIGHT);
		stokSolUstPanel.add(stokUrunAdiLabel);
		JComboBox stokUrunAdiBox= new JComboBox();
		stokSolUstPanel.add(stokUrunAdiBox);
		JLabel stokAdetLabel=new JLabel("Adet: ", JLabel.RIGHT);
		stokSolUstPanel.add(stokAdetLabel);
		JTextField stokAdetField= new JTextField(15);
		stokSolUstPanel.add(stokAdetField);
		JLabel stokTarihiLabel=new JLabel("Stok Tarirhi: ", JLabel.RIGHT);
		stokSolUstPanel.add(stokTarihiLabel);
		JDateChooser stokTarihiChooser = new JDateChooser();
		stokSolUstPanel.add(stokTarihiChooser);
		
		JButton stokEkleButton= new JButton("Stok Ekle");
		stokSolUstPanel.add(stokEkleButton);
		JButton stokYenileButton= new JButton("Yenile");
		stokSolUstPanel.add(stokYenileButton);
		
		/* Satýþ Ýþlemleri*/
		
		JPanel satisSagPanel= new JPanel(new BorderLayout());
		JPanel satisSagUstPanel=new JPanel(new GridLayout(4,2));
		JPanel satisSagAltPanel=new JPanel();
		satisSagPanel.setBorder(BorderFactory.createTitledBorder("Stok Ýþlemleri"));
		
		Object [] satisKolonlar= {"ID", "PERSONEL ADI","MÜÞTERÝ ADI" ,"ÜRÜN ADI", "ADETÝ", "TARÝHÝ"};
		DefaultTableModel satisModel= new DefaultTableModel(satisKolonlar,0);
		JTable satisTable = new JTable(satisModel);
		JScrollPane satisTablePane= new JScrollPane(satisTable);
		
		JLabel satisUrunAdiLabel= new JLabel("Ürün Adý: ", JLabel.RIGHT);
		satisSagUstPanel.add(satisUrunAdiLabel);
		JComboBox satisUrunAdiBox= new JComboBox();
		satisSagUstPanel.add(satisUrunAdiBox);
		JLabel satisAdetLabel=new JLabel("Adet: ", JLabel.RIGHT);
		satisSagUstPanel.add(satisAdetLabel);
		JTextField satisAdetField= new JTextField(15);
		satisSagUstPanel.add(satisAdetField);
		JLabel satisTarihiLabel=new JLabel("Satýþ Tarihi: ", JLabel.RIGHT);
		satisSagUstPanel.add(satisTarihiLabel);
		JDateChooser satisTarihiChooser = new JDateChooser();
		satisSagUstPanel.add(satisTarihiChooser);
		
		JButton satisEkleButton= new JButton("Stok Ekle");
		satisSagUstPanel.add(satisEkleButton);
		JButton satisYenileButton= new JButton("Yenile");
		satisSagUstPanel.add(satisYenileButton);
		
		
		
		stokPanel.add(stokSolPanel, BorderLayout.WEST );
		stokPanel.add(stokTablePane, BorderLayout.CENTER);
		satisPanel.add(satisSagPanel, BorderLayout.EAST);
		satisPanel.add(satisTablePane, BorderLayout.CENTER);
		
		satisSagPanel.add(satisSagUstPanel, BorderLayout.NORTH);
		satisSagPanel.add(satisSagAltPanel, BorderLayout.SOUTH);
		
		stokSolPanel.add(stokSolUstPanel, BorderLayout.NORTH);
		stokSolPanel.add(stoksolAltPanel, BorderLayout.SOUTH);
		
		pane.addTab("Stoklar", icon, stokPanel, "Bulunamadý");
		pane.addTab("Satýþlar", icon2, satisPanel, "Yazý");
		
		return pane;
	}

}
