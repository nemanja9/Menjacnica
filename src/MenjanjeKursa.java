import java.util.GregorianCalendar;
import java.util.LinkedList;

import Valuta.Valuta;
import interfejs.MenjacnicaInterfejs;

public class MenjanjeKursa implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override

	public void dodajKursValute(GregorianCalendar dan, double kursP, double kursK, double kursS) {

		try {
			for (int i = 0; i < valute.size(); i++) {
				if (valute.get(i).getDatum().equals(dan)) {
					valute.get(i).setKupovniKurs(kursK);
					valute.get(i).setProdajniKurs(kursP);
					valute.get(i).setSrednjiKurs(kursS);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void obrisiKursValute(GregorianCalendar dan) {

		try {
			for (int i = 0; i < valute.size(); i++) {
				if (valute.get(i).getDatum().equals(dan)) {
					valute.get(i).setKupovniKurs(0);
					valute.get(i).setProdajniKurs(0);
					valute.get(i).setSrednjiKurs(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public double[] vratiKursZaNekiDan(GregorianCalendar dan) {
		double[] niz = new double[3];
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().equals(dan)) {
				niz[0] = valute.get(i).getKupovniKurs();
				niz[1] = valute.get(i).getProdajniKurs();
				niz[2] = valute.get(i).getSrednjiKurs();

			}
		}
		return niz;
	}

}
