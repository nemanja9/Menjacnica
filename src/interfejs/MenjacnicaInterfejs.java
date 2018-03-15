package interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	void dodajKursValute (GregorianCalendar dan, double kurs);
	void obrisiKursValute (GregorianCalendar dan);
	double vratiKursZaNekiDan (GregorianCalendar dan);
	
}
