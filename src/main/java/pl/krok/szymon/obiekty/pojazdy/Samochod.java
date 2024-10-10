package main.java.pl.krok.szymon.obiekty.pojazdy;

import main.java.pl.krok.szymon.obiekty.pojazdy.enumy.Marka;

class Samochod extends Pojazd {
	private String marka;
	private String model;
	private String iloscKoni;
	private String iloscSilnikow;
	 //model to sportowy gettyp to fiat marka to 126p

	

	public Samochod(String model, String marka, String silniki, String konie, String typ) {
		super(typ, silniki);
		this.marka = marka;
		this.model = model;
		this.iloscKoni = konie;
		this.iloscSilnikow = silniki;
	}
	public String getTyp() {
		return typ;
	}

	public String getModel() {
		return model;
	}

	public String getIloscKoni() {
		return iloscKoni;
	}

	public void uruchom() {               //model to sportowy gettyp to fiat marka to 126p
		System.out.println("Znalesziono " + model + " - " + marka + " " + iloscKoni + " z " + getIloscSilnikow()
				+ " silnikami i moc¹ " + getTyp() + " koni.");
	}

	public Object getMarka() {
		// TODO Auto-generated method stub
		return marka;
	}

	
	@Override
	public String toString() {
		
		return marka + " " + iloscKoni + " " + model;
	}

}
