public class LabAsistani extends Asistan {
	public LabAsistani(String adSoyad,String telefon,String eposta,String bolum,String unvan,String ofisSaati){
		super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
	}
	public void lablaraGir(){
		System.out.println(this.getAdSoyad() + " labaratuarda görevli");
	}
	@Override
	public void dersegir(String saat){
		System.out.println(this.getAdSoyad() + saat + " Derse giris yapti!!");
	}
	@Override
	public void giris(){
		System.out.println(this.getAdSoyad() + this.getBolum() + " D kapisindan giris yapti!!");
	}
	@Override
	public void yemekhane(){
		System.out.println(this.getAdSoyad() + " yemekhane de");
	}
	@Override
	public void cikis(){
		System.out.println(this.getAdSoyad() + " LabAsistan çikti!!");
	}

}
