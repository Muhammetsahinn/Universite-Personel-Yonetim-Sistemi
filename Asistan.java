public class Asistan extends Akademisyen{
	private String ofisSaati;
	public Asistan(String adSoyad,String telefon,String eposta,String bolum,String unvan,String ofisSaati){
		super(adSoyad, telefon, eposta, bolum, unvan);
		this.ofisSaati = ofisSaati;
	}
	public String getOfisSaati(){
		return this.ofisSaati;
	}
	public void setOfisSaati(String ofisSaati){
		this.ofisSaati = ofisSaati;
	}
	public void quizYap(){
		System.out.println(this.getAdSoyad()+ " bu hafta quizi yapacak!!");
	}
	@Override
	public void giris(){
		System.out.println(this.getAdSoyad() + " Asistan A kapisindan giris yaptii!!");
	}
	@Override
	public void dersegir(String saat){
		System.out.println(this.getAdSoyad() + saat + " Derse giris yapti!!");
	}
	@Override
	public void cikis(){
		System.out.println(this.getAdSoyad() + " Asistan çikti!!");
	}
	@Override
	public void yemekhane(){
		System.out.println(this.getAdSoyad() + " yemekhane de");
	}

}
