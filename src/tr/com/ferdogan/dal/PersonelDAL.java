package tr.com.ferdogan.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.com.ferdogan.core.ObjectHelper;
import tr.com.ferdogan.interfaces.DALinterfaces;
import tr.com.ferdogan.types.KategoriContract;
import tr.com.ferdogan.types.PersonelContract;

public class PersonelDAL extends ObjectHelper implements DALinterfaces<PersonelContract> {

	@Override
	public void Insert(PersonelContract entity) {
    
		
		Connection connection = getConnection();

		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Personel (AdiSoyadi,Email) "
					+ "VALUES('" + entity.getAdiSoyadi() + "','"
					+ entity.getEmail() + "')");

			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<PersonelContract> GetAll() {
		List<PersonelContract> datacontract = new ArrayList<PersonelContract>();

		Connection connection = getConnection();
		PersonelContract contract;
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Personel");

			while (resultSet.next()) {
				contract = new PersonelContract();
				contract.setId(resultSet.getInt("Id"));
				contract.setAdiSoyadi(resultSet.getString("AdiSoyadi"));
				contract.setEmail(resultSet.getString("Email"));
				
				

				datacontract.add(contract);
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return datacontract;
	}

	@Override
	public PersonelContract Delete(PersonelContract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(PersonelContract entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonelContract> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
