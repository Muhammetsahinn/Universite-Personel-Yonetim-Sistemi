public class BilgiIslem extends Memur{
	private String gorev;

	public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev){
		super(adSoyad, telefon, eposta, departman, mesai);
		this.gorev = gorev;
	}
	public String getGorev(){
		return this.gorev;
	}
	public void setGorev(String gorev){
		this.gorev = gorev;
	}

	public void networkKurulum(){
		System.out.println(this.getAdSoyad() + " network kurulumu icin ulasınız!!");
	}
	@Override
	public void giris(){
		System.out.println(this.getAdSoyad() + " Bilgi islem personeli C kapisindan girdi!!");
	}
	public void mesai(String mesaiSaat){
		System.out.println(this.getAdSoyad() +" bilgi islem mesai saati : "+ mesaiSaat);
	}
	@Override
	public void cikis(){
		System.out.println(this.getAdSoyad() + " bilgi islem personeli çikti!!");
	}
	@Override
	public void yemekhane(){
		System.out.println(this.getAdSoyad() + " yemekhane de");
	}
}
