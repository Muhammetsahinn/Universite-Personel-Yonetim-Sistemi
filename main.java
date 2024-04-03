public class main {
	public static void main(String[] args) {
		//Calisan c1 = new Calisan("ferdi apranic","05514524841","e@gmail.com");

		//Akademisyen a1 = new Akademisyen("mert ortega","05555555555","m@gmail.com","ceng","prof");

		//Memur m1 = new Memur("hayat hayatvar","05548757898","m@gmail.com","ogrenci isleri","sabah");

		OgretimGorevlisi o1 = new OgretimGorevlisi("yasar neyasar","3225445464","gmail.com","ziraat","docent","1");

		BilgiIslem b1 = new BilgiIslem("zubuk karabuk","02584854882","z@gmail.com","bilgi islem","8:00-16:00","teknik destek");

		GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("ferdi fermedi","05111111111","f@gmail.com","Güvenlik görevlisi","8:00-16:00","yeterli");

		Asistan as1 = new Asistan("assas asiz","05121212122","s@gmail.com","biyoloji","Asistan","10:00");

		LabAsistani l1 = new LabAsistani("asli gelgit","05123123112","q@gmail.com","matematik","lab asistani","13:00");

		//Calisan[] loginUser = {o1,c1,g1};
		o1.dersegir("15:15");
		g1.giris();
		b1.cikis();
		as1.dersegir("11:10");

		//Calisan.girisYapanlar(loginUser);
		//l1.dersegir();

		/*a1.giris();
		o1.giris();
		m1.giris();
		c1.giris();*/

	}
}
