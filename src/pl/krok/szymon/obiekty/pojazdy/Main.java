package pl.krok.szymon.obiekty.pojazdy;

public class Main {
	public static void main(String[] args) {
		Samochod mazda = new Samochod("Sedan", 1, "Mazda", "MX-5", 200);
		mazda.uruchom();
		Samochod suzuk = new Samochod("suzuk", 1, "Opel", "Astra", 100);
		suzuk.uruchom();
		Samolot samolot = new Samolot("Samolot", 2, "Boeing 747", 467);
		samolot.uruchom();
		Statek statek = new Statek("Statek", 4, "Titanic", 2200);
		statek.uruchom();
	}
}