import java.util.GregorianCalendar;

import Valuta.Valuta;
import interfejs.MenjacnicaInterfejs;

public class MenjanjeKursa implements  MenjacnicaInterfejs{

	@Override
	public void dodajKursValute(GregorianCalendar dan, double kurs) {
		Valuta valuta = new Valuta();
		valuta.setDatum(dan);
<<<<<<< HEAD
		valuta.setProdajniKurs(kurs);
=======
		valuta.setKupovniKurs(kurs);
>>>>>>> refs/heads/implementacijainterfejsa
		
	}

	@Override
	public void obrisiKursValute(GregorianCalendar dan) {
		Valuta valuta = new Valuta();
		valuta.setKupovniKurs(0);
		
	}

	@Override
	public double vratiKursZaNekiDan(GregorianCalendar dan) {
		Valuta valuta = new Valuta();
		if (valuta.getDatum().equals(dan))
			return valuta.getKupovniKurs();
		return 0;
	}

}
