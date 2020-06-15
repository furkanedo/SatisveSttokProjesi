package tr.com.ferdogan.utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import tr.com.ferdogan.fe.KategoriEkleFE;
import tr.com.ferdogan.fe.MusteriEkleFE;
import tr.com.ferdogan.fe.PersonelEkleFE;
import tr.com.ferdogan.fe.SifreIslemleriFE;
import tr.com.ferdogan.fe.SifreIslemleriFE;
import tr.com.ferdogan.fe.UrunEkleFE;
import tr.com.ferdogan.fe.YetkiEkleFE;

public class MenulerFE {
	
	public static JMenuBar initBar() {
		JMenuBar bar= new JMenuBar();
		
		JMenu dosyaMenu= new JMenu("Dosya");
		bar.add(dosyaMenu);
		JMenuItem cýkýsItem= new JMenuItem("Çýkýþ");
		dosyaMenu.add(cýkýsItem);
		
		// Urunler Menusu
		
		JMenu urunlerMenu= new JMenu("Ürünler");
		bar.add(urunlerMenu);
		JMenuItem urunEkleItem= new JMenuItem("Ürün Ekle");
		urunlerMenu.add(urunEkleItem);
		
		JMenuItem kategoriEkleItem= new JMenuItem("Kategori Ekle");
		urunlerMenu.add(kategoriEkleItem);
		
		
		urunlerMenu.addSeparator();
		JMenuItem urunDuzenleItem= new JMenuItem("Ürün Düzenle");
		urunlerMenu.add(urunDuzenleItem);
		JMenuItem kategoriDuzenleItem= new JMenuItem("Kategori Düzenle");
		urunlerMenu.add(kategoriDuzenleItem);
		
		//Personel Menusu
		JMenu personellerMenu= new JMenu("Personel Ýþlemleri");
		bar.add(personellerMenu);
		JMenuItem personelEkleItem=new JMenuItem(" Personel Ekle");
		personellerMenu.add(personelEkleItem);
		JMenuItem yetkiEkleItem= new JMenuItem("Yetki Ekle");
		personellerMenu.add(yetkiEkleItem);
		JMenuItem sifreBelirleItem= new JMenuItem("Þifre Belirle");
		personellerMenu.add(sifreBelirleItem);
		personellerMenu.addSeparator();
		
		JMenuItem personelDuzenleItem= new JMenuItem("Personel Düzenle");
		personellerMenu.add(personelDuzenleItem);
		JMenuItem yetkiDuzenleItem= new JMenuItem("Yetki Düzenle");
		personellerMenu.add(yetkiDuzenleItem);
		JMenuItem sifreDuzenleItem= new JMenuItem("Þifre Düzenleme");
		personellerMenu.add(sifreDuzenleItem);
		
		//Musteri menusu
		
		JMenu musterilerMenu=new JMenu("Müþteriler");
		bar.add(musterilerMenu);
		JMenuItem musteriEkleItem= new JMenuItem("Müþteri Ekle");
		musterilerMenu.add(musteriEkleItem);
		JMenuItem sehirEkleItem= new JMenuItem("Þehir Ekle");
		musterilerMenu.add(sehirEkleItem);
		musterilerMenu.addSeparator();
		
		
		JMenuItem musteriDuzenleItem=new JMenuItem("Müþteri Düzenle");
		musterilerMenu.add(musteriDuzenleItem);
		JMenuItem sehirduzenleItem= new JMenuItem("Þehir Düzenle");
		musterilerMenu.add(sehirduzenleItem);
		
		
		
		
		
		
		urunEkleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						
							new UrunEkleFE();
						
						
					}
				});
				
				
			}
		});
		
		kategoriEkleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new KategoriEkleFE();
				
			}
		});
		
		
		personelEkleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new PersonelEkleFE();
						
					}
				});
				
			}
		});
		
		yetkiEkleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new YetkiEkleFE();
						
					}
				});
				
			}
		});
		
		sifreBelirleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SifreIslemleriFE();
				
			}
		});
		
		musteriEkleItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						
						new MusteriEkleFE();
						
					}
				});
				
			}
		});
		
		
		return bar;
	}

}
