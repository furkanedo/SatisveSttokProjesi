package tr.com.ferdogan.types;

public class AccountsContract {

	private int id;
	private String yetkiId;
	private int personelId;
	private String sifre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYetkiId() {
		return yetkiId;
	}

	public void setYetkiId(int i) {
		this.yetkiId = yetkiId;
	}

	public int getPersonelId() {
		return personelId;
	}

	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + yetkiId + " " + personelId + " " + sifre;
	}

}
