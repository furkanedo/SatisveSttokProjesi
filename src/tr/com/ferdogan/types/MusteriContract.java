package tr.com.ferdogan.types;

public class MusteriContract {

	private int id;
	private String adiSoyadi;
	private int telefonNumarasi;
	private String adres;
	private int sehirId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdiSoyadi() {
		return adiSoyadi;
	}

	public void setAdiSoyadi(String adiSoyadi) {
		this.adiSoyadi = adiSoyadi;
	}

	public int getTelefonNumarasi() {
		return telefonNumarasi;
	}

	public void setTelefonNumarasi(int telefonNumarasi) {
		this.telefonNumarasi = telefonNumarasi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getSehirId() {
		return sehirId;
	}

	public void setSehirId(int sehirId) {
		this.sehirId = sehirId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + adiSoyadi + " " + telefonNumarasi + " " + adres + " " + sehirId;
	}

}
