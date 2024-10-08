package pl.krok.szymon.obiekty.pojazdy;

class Samolot extends Pojazd {
	private String model;
	private int iloscPasazerow;

	public Samolot(String typ, int iloscSilnikow, String model, int iloscPasazerow) {
		super(typ, iloscSilnikow);
		this.model = model;
		this.iloscPasazerow = iloscPasazerow;
	}

	public void uruchom() {
		System.out.println("Uruchamiam " + getTyp() + " - model: " + model + " z " + getIloscSilnikow()
				+ " silnikami i dla " + iloscPasazerow + " pasa¿erów.");
	}
}