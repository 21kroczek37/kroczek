package main.java.pl.krok.szymon.obiekty.pojazdy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.pl.krok.szymon.obiekty.pojazdy.enumy.Marka;

public class Main {
	public static void main(String[] args) {
		try {
			// Samochod mazda = new Samochod("Sedan", 1, Marka.MAZDA, "MX-5",
			// 200);
			// mazda.uruchom();
			//
			// Samochod opel = new Samochod("osobowy", 1, Marka.OPEL, "Astra",
			// 100);
			// opel.uruchom();
			//
			// Samolot samolot = new Samolot("Samolot", 2, "Boeing 747", 467);
			// samolot.uruchom();
			//
			// Statek statek = new Statek("Statek", 4, "Titanic", 2200);
			// statek.uruchom();

			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj markê samochodu: ");
			String modelInt = scanner.nextLine().trim();

			List<Samochod> samochody = new ArrayList<>();// nowa lista
			File file = new File("F:\\programy\\kroczek\\src\\main\\resources\\caes.csv"); // wczytuje
			boolean isHeader = true;									// plik
			System.out.println("wszystkie nasze samochody:");
			if (file.exists()) { // je¿eli plik istnieje
				try (Scanner in = new Scanner(file)) {// skanuje plik
					while (in.hasNextLine()) {// petla dla kazdej lini
						String line = in.nextLine();// wczytuje kolejna linie
						System.out.println(line);// wypisanie lini pojednynczej
						
						if (isHeader == true) {
							isHeader = false;
							continue;
						}
						String[] parametrySamochodu = line.split(";");// wczytuje
																		// mi 1
																		// zamiast
																		// 2
																		// linijki
						String typ = parametrySamochodu[0];
						String marka = parametrySamochodu[1];
						String silnik = parametrySamochodu[2];
						String model = parametrySamochodu[3];
						String konie = parametrySamochodu[4];
						Samochod one = new Samochod(typ, marka, silnik,
								model, konie);

						samochody.add(one);

					}
				}
			}
			
			System.out.println(" szukam... w" + samochody.size());
			boolean znaleziono = false;
			for (Samochod one : samochody) {// lista po ka¿dym samochodzie
				System.out.println(" szukam" + one);
				if (one.getMarka().toString().equalsIgnoreCase(modelInt)) {
					one.uruchom();
					znaleziono = true;
					break;
				}
			}

			if (!znaleziono) {
				System.out.println("Nie znaleziono samochodów marki: " + modelInt);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Wyst¹pi³ b³¹d: " + e.getMessage());
		}
	}
}
