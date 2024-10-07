package pl.krok.szymon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static int liczba;

	public static void main(String[] args) {
		System.out.println("Wybierz 0 - 2:");
		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			liczba = scanner.nextInt();
		} else {
			System.out.println("Nieprawid�owa warto��. Prosz� wprowadzi� 0 - 2.");
			return;
		}

		switch (liczba) {
		case 0:
			System.out.println("Wybrano 0");
			break;
		case 1:
			helloWorld();
			break;
		case 2:
			zgadnijLiczbe();
			break;

		case 3:
			calc();
			break;
		case 4:
			getPalindrome();
			break;
		case 5:
			addingArrays();
			break;
		}

	}

	private static void addingArrays() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> tabela1 = new ArrayList<>();
		List<Integer> tabela2 = new ArrayList<>();
		System.out.println(
				"Wprowad� liczby do pierwszej tablicy (naci�nij Enter bez podawania warto�ci, aby zako�czy�):");
		while (true) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}
			try {
				tabela1.add(Integer.parseInt(input));
			} catch (NumberFormatException e) {
				System.out.println("Prosz� wpisa� prawid�ow� liczb�.");
			}
		}
		System.out.println("Naci�nij Enter, aby przej�� do drugiej tablicy...");
		scanner.nextLine();
		System.out
				.println("Wprowad� liczby do drugiej tablicy (naci�nij Enter bez podawania warto�ci, aby zako�czy�):");
		while (true) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}
			try {
				tabela2.add(Integer.parseInt(input));
			} catch (NumberFormatException e) {
				System.out.println("Prosz� wpisa� prawid�ow� liczb�.");
			}
		}
		int maxLength = Math.min(tabela1.size(), tabela2.size());
		List<Integer> wynik = new ArrayList<>();
		for (int i = 0; i < maxLength; i++) {
			wynik.add(tabela1.get(i) + tabela2.get(i));
		}
		System.out.print("Wynik dodawania: ");
		for (int liczba : wynik) {
			System.out.print(liczba + " ");
		}
		scanner.close();
	}

	private static void getPalindrome() {
		System.out.println("podaj zdanie, sprawdzimy czy jest palindromem");
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String sentence = scanner.nextLine();
			if (sentence.equals("koniec")) {
				break;
			}
			boolean getPalindrome = true;
			for (int i = 0; i < sentence.length() / 2; i++) {
				char currentChar = sentence.charAt(i);
				char otherChar = sentence.charAt(sentence.length() - i - 1);

				if (currentChar != otherChar) {

					getPalindrome = false;
					break;
				}
			}
			if (getPalindrome) {
				System.out.println("przekazane zdanie  " + sentence + "  jest palindromem");
			} else {
				System.out.println("przekazane zdanie  " + sentence + "  nie jest palindromem");

			}
			System.out.println("podaj kolejne zdanie do sprawdzenia ");

		}
	}

	private static void helloWorld() {
		System.out.println("hello world");

	}

	private static void zgadnijLiczbe() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int liczbaDoZganiecia = random.nextInt(100) + 1;
		System.out.println("Wymy�li�em liczb� z przedzia�u 1-100. Zgadnij co to za liczba");

		int liczbaOdUzytkwonika;
		int iloscProb = 0;
		do {
			iloscProb++;
			System.out.print("Podaj liczb�: ");
			liczbaOdUzytkwonika = scanner.nextInt();

			if (liczbaOdUzytkwonika < liczbaDoZganiecia) {
				System.out.println("Poda�e� za ma�� liczb�");
			} else if (liczbaOdUzytkwonika > liczbaDoZganiecia) {
				System.out.println("Poda�e� za du�� liczb�");
			} else {
				System.out.println("Gratuluj�! Zgad�e� liczb� w " + iloscProb + " pr�bie");
			}
		} while (liczbaDoZganiecia != liczbaOdUzytkwonika);

	}

	private static void calc() {
		int pierwszaliczba;
		int drugaliczba;
		int znak = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj pierwsz� liczb�:");
		pierwszaliczba = scanner.nextInt();
		System.out.println("Podaj drug� liczb�");
		drugaliczba = scanner.nextInt();

		System.out.println("dodawanie, wcisnij 1");
		System.out.println("odejmowanie, wcisnij 2");
		System.out.println("mno�enie, wcisnij 3");
		System.out.println("dzielenie, wcisnij 4");
		znak = scanner.nextInt();
		switch (znak) {

		case 1: {
			System.out.println(pierwszaliczba + drugaliczba);
			break;
		}
		case 2: {
			System.out.println(pierwszaliczba - drugaliczba);
			break;
		}
		case 3: {
			System.out.println(pierwszaliczba * drugaliczba);
			break;
		}
		case 4: {
			if (drugaliczba != 0) {
				System.out.println(pierwszaliczba / drugaliczba + "  oraz reszty: " + pierwszaliczba % drugaliczba);
			} else {
				System.out.println("Nie dzielimy przez zero!!!");
			}
			break;
		}
		}
		scanner.close();
	}
}
