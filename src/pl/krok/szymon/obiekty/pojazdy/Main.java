package pl.krok.szymon.obiekty.pojazdy;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import pl.krok.szymon.obiekty.pojazdy.enumy.Marka;

public class Main {
	public static void main(String[] args) {

		Samochod mazda = new Samochod("Sedan", 1, Marka.MAZDA, "MX-5", 200);
		mazda.uruchom();
		Samochod suzuk = new Samochod("osobowy", 1, Marka.OPEL, "Astra", 100);
		suzuk.uruchom();
		Samolot samolot = new Samolot("Samolot", 2, "Boeing 747", 467);
		samolot.uruchom();
		Statek statek = new Statek("Statek", 4, "Titanic", 2200);
		statek.uruchom();

		List<Samochod> samochody = new ArrayList<>();

		samochody.add(new Samochod("osobowy", 1, Marka.FORD, "Mustang", 450));
		samochody.add(new Samochod("osobowy", 1, Marka.BMW, "M3", 473));
		samochody.add(new Samochod("osobowy", 1, Marka.AUDI, "A4", 261));
		samochody.add(new Samochod("osobowy", 1, Marka.MAZDA, "Corolla", 139));
		samochody.add(new Samochod("osobowy", 1, Marka.HONDA, "Civic", 158));
		samochody.add(new Samochod("osobowy", 1, Marka.MERCEDES, "C-Class", 255));
		samochody.add(new Samochod("osobowy", 1, Marka.VOLKSWAGEN, "Golf", 228));
		samochody.add(new Samochod("osobowy", 1, Marka.MAZDA, "Camaro", 275));
		samochody.add(new Samochod("osobowy", 1, Marka.NISSAN, "Altima", 248));
		samochody.add(new Samochod("osobowy", 1, Marka.SUBARU, "Impreza", 152));
		samochody.add(new Samochod("osobowy", 1, Marka.KIA, "Stinger", 368));
		samochody.add(new Samochod("osobowy", 1, Marka.HYUNDAI, "Elantra", 147));
		samochody.add(new Samochod("elektryczny", 1, Marka.TESLA, "Model 3", 283));
		samochody.add(new Samochod("osobowy", 1, Marka.HYUNDAI, "3", 186));
		samochody.add(new Samochod("sportowy", 1, Marka.MAZDA, "911", 379));
		samochody.add(new Samochod("SUV", 1, Marka.LAND_ROVER, "Range Rover", 395));
		samochody.add(new Samochod("SUV", 1, Marka.JEEP, "Wrangler", 285));
		samochody.add(new Samochod("osobowy", 1, Marka.MAZDA, "S60", 250));
		samochody.add(new Samochod("osobowy", 1, Marka.LEXUS, "ES", 302));
		samochody.add(new Samochod("sportowy", 1, Marka.FERRARI, "488", 661));
		samochody.add(new Samochod("sportowy", 1, Marka.FERRARI, "488", 661));
		samochody.add(new Samochod("sportowy", 1, Marka.FERRARI, "488", 661));
		samochody.add(new Samochod("sportowy", 1, Marka.FERRARI, "488", 661));
		samochody.add(new Samochod("sportowy", 1, Marka.FERRARI, "488", 661));
		samochody.add(new Samochod("sportowy", 1, Marka.FERRARI, "488", 661));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj markê samochodu: ");
		String markaInt = scanner.nextLine().trim();
		boolean znaleziono = false;

		for (Samochod samochod : samochody) {
			if (samochod.getMarka().toString().equalsIgnoreCase(markaInt)) {
				samochod.uruchom();
				znaleziono = true;
			}
		}

		if (!znaleziono) {
			System.out.println("Nie znaleziono samochodów marki: " + markaInt);
		}

		scanner.close();
	}
}
