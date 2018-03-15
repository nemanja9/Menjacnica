import java.util.GregorianCalendar;

import Valuta.Valuta;
import interfejs.MenjacnicaInterfejs;

public class MenjanjeKursa implements  MenjacnicaInterfejs{

	@Override
	public void dodajKursValute(GregorianCalendar dan, double kurs) {
		Valuta valuta = new Valuta();
		valuta.setDatum(dan);
		valuta.setProdajniKurs(kurs);
		
	}

	@Override
	public void obrisiKursValute(GregorianCalendar dan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double vratiKursZaNekiDan(GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return 0;
	}

}
