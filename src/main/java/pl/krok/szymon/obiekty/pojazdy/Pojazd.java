package main.java.pl.krok.szymon.obiekty.pojazdy;

abstract class Pojazd {
	protected String typ;
	private String iloscSilnikow;

	protected Pojazd(String typ, String parametrySamochodu) {
		this.typ = typ;
		this.iloscSilnikow = parametrySamochodu;
	}

	
	public String getIloscSilnikow() {
		return iloscSilnikow;
	}

	public abstract void uruchom();
}


