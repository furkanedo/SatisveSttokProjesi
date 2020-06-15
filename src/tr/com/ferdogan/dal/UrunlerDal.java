package tr.com.ferdogan.dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tr.com.ferdogan.core.ObjectHelper;
import tr.com.ferdogan.interfaces.DALinterfaces;

public class UrunlerDal<UrunlerContract> extends ObjectHelper
		implements DALinterfaces<tr.com.ferdogan.types.UrunlerContract> {

	@Override
	public void Insert(tr.com.ferdogan.types.UrunlerContract entity) {

		Connection connection = getConnection();

		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Urunler(Adi, KategoriId, Tarih, Fiyat)" + "VALUES('" 
			+ entity.getAdi()
			+ "', " 
			+ entity.getKategoriId() + ", '" 
			+ entity.getTarih() + "'," 
			+ entity.getFiyat() + ")");
			
			
			statement.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<tr.com.ferdogan.types.UrunlerContract> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tr.com.ferdogan.types.UrunlerContract Delete(tr.com.ferdogan.types.UrunlerContract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(tr.com.ferdogan.types.UrunlerContract entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<tr.com.ferdogan.types.UrunlerContract> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
