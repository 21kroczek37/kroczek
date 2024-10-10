package main.java.pl.krok.szymon.obiekty.pojazdy;

class Statek extends Pojazd {
	private String nazwa;
	private int iloscLudzi;

	public Statek(String typ, int iloscSilnikow, String nazwa, int iloscLudzi) {
		super(typ, typ);
		this.nazwa = nazwa;
		this.iloscLudzi = iloscLudzi;
	}

	public void uruchom() {
		System.out.println("Uruchamiam " + getTyp() + " - nazwa: " + nazwa + " z " + getIloscSilnikow()
				+ " silnikami i dla " + iloscLudzi + " ludzi.");
	}
}