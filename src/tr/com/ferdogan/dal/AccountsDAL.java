package tr.com.ferdogan.dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tr.com.ferdogan.core.ObjectHelper;
import tr.com.ferdogan.interfaces.DALinterfaces;
import tr.com.ferdogan.types.AccountsContract;

public class AccountsDAL extends ObjectHelper implements DALinterfaces<AccountsContract> {

	@Override
	public void Insert(AccountsContract entity) {
		Connection connection = getConnection();

		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Accounts (PersonelId, YetkiId, Sifre) " + "VALUES("
					+ entity.getPersonelId() + ","
					+ entity.getYetkiId() + ", '" 
					+ entity.getSifre() + "')");

			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<AccountsContract> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsContract Delete(AccountsContract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(AccountsContract entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<AccountsContract> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
