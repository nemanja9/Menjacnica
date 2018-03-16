package interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKursValute(GregorianCalendar dan, double kursP, double kursK, double kursS) ;
	void obrisiKursValute (GregorianCalendar dan);
	double[] vratiKursZaNekiDan (GregorianCalendar dan);
	
}
