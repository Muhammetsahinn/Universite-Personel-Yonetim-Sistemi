public class GuvenlikGorevlisi extends Memur{
	private String belge;
	public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta,String departman,String mesai, String belge){
		super(adSoyad, telefon, eposta, departman, mesai);
		this.belge = belge;
	}
	public String getBelge(){
		return this.belge;
	}
	public void setBelge(String belge){
		this.belge = belge;
	}
	public void nobet(){
		System.out.println(this.getAdSoyad() + " nobetci");
	}
	@Override
	public void giris(){
		System.out.println(this.getAdSoyad() + " Güvenlik Görevlisi D kapisindan giris yapti!!");
	}
	@Override
	public void mesai(String mesaiSaat){
		System.out.println(this.getAdSoyad() +" güvenlik mesai saati : "+ mesaiSaat);
	}
	@Override
	public void cikis(){
		System.out.println(this.getAdSoyad() + " guvenlik çikti!!");
	}
	@Override
	public void yemekhane(){
		System.out.println(this.getAdSoyad() + " yemekhane de");
	}
}
