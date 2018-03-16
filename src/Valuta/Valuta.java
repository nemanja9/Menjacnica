package Valuta;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skraceni;
	private GregorianCalendar datum;
	private double kupovniKurs;
	private double prodajniKurs;
	private double srednjiKurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) throws Exception {
		if(naziv != null && naziv.length()>0)
		this.naziv = naziv;
		else throw new Exception("Naziv ne moze biti prazan");
	}

	public String getSkraceni() {
		return skraceni;
	}

	public void setSkraceni(String skraceni) throws Exception {
		if(skraceni != null && skraceni.length()>0)
		this.skraceni = skraceni;
		else throw new Exception("Skraceni naziv ne moze biti prazan");
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) throws Exception {
		if (datum.after(new GregorianCalendar()))
		this.datum = datum;
		else throw new Exception("Datum mora biti u buducnosti");
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) throws Exception {
		if (kupovniKurs >=0)
		this.kupovniKurs = kupovniKurs;
		else throw new Exception("Kurs ne moze biti negativan broj");
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) throws Exception {
		if (prodajniKurs >=0)
		this.prodajniKurs = prodajniKurs;
		else throw new Exception("Kurs ne moze biti negativan broj");
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) throws Exception {
		if (srednjiKurs >=0)
		this.srednjiKurs = srednjiKurs;
		else throw new Exception("Kurs ne moze biti negativan broj");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceni == null) ? 0 : skraceni.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skraceni == null) {
			if (other.skraceni != null)
				return false;
		} else if (!skraceni.equals(other.skraceni))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceni=" + skraceni + ", datum=" + datum + ", kupovniKurs=" + kupovniKurs
				+ ", prodajniKurs=" + prodajniKurs + ", srednjiKurs=" + srednjiKurs + "]";
	}
	

}
