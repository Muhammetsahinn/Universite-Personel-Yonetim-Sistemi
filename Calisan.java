public abstract class Calisan {
	private String adSoyad;
	private String telefon;
	private String eposta;

	public Calisan(String adSoyad,String telefon,String eposta){
		this.adSoyad = adSoyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}
	public String getAdSoyad(){
		return this.adSoyad;
	}
	public void setAdSoyad(String adSoyad){
		this.adSoyad = adSoyad;
	}
	public String getTelefon(){
		return this.telefon;
	}
	public void setTelefon(String telefon){
		this.telefon =telefon;
	}
	public String getEposta(){
		return this.eposta;
	}
	public void setEposta(String eposta){
		this.eposta = eposta;
	}

	public abstract void giris();
	public abstract void cikis();
	public abstract void yemekhane();

	public static void girisYapanlar(Calisan[] loginUser){
		for(Calisan c : loginUser){
			c.giris();
		}
	}
}
