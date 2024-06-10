package Palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Palavra: ");
		String palavra = reader.nextLine().toUpperCase();

		System.out.print("\nPalíndromo: " + palindromo(palavra));

		reader.close();

	}

	private static boolean palindromo(String _palavra) {
		for (int i = 0; i < _palavra.length() / 2; i++) {
			char esquerda = _palavra.charAt(i);
			char direita = _palavra.charAt(_palavra.length() - 1 - i);
			if (esquerda != direita) {
				return false;
			}
		}
		return true;
	}

}
