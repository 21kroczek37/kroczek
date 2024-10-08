package pl.krok.szymon.obiekty.pojazdy;

abstract class Pojazd {
	private String typ;
	private int iloscSilnikow;

	protected Pojazd(String typ, int iloscSilnikow) {
		this.typ = typ;
		this.iloscSilnikow = iloscSilnikow;
	}

	public String getTyp() {
		return typ;
	}

	public int getIloscSilnikow() {
		return iloscSilnikow;
	}

	public abstract void uruchom();
}


