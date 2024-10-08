package pl.krok.szymon.obiekty.pojazdy;

import pl.krok.szymon.obiekty.pojazdy.enumy.Marka;

class Samochod extends Pojazd {
	private Marka marka;
	private String model;
	private int iloscKoni;

	public Samochod(String typ, int iloscSilnikow, Marka marka, String model, int iloscKoni) {
		super(typ, iloscSilnikow);
		this.marka = marka;
		this.model = model;
		this.iloscKoni = iloscKoni;
	}

	public String getModel() {
		return model;
	}

	public int getIloscKoni() {
		return iloscKoni;
	}

	public void uruchom() {
		System.out.println("Znalesziono " + getTyp() + " - " + marka + " " + model + " z " + getIloscSilnikow()
				+ " silnikami i moc¹ " + iloscKoni + " koni.");
	}

	public Object getMarka() {
		// TODO Auto-generated method stub
		return marka;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iloscKoni;
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Samochod other = (Samochod) obj;
		if (iloscKoni != other.iloscKoni)
			return false;
		if (marka != other.marka)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	

}
