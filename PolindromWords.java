package gorevler;

import java.util.Scanner;

public class PolindromWords {
	public static void main(String[] args) {
		//Palindromik kelimeler yapay kapak 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime = scan.nextLine();
		String tmp = "";
		
		for(int i = kelime.length() -1 ; i >= 0;i--) {
			tmp = tmp + kelime.charAt(i);
		}
		System.out.println("Kelimenin tersi: " +  tmp);
		if(kelime.equals(tmp)) {
			System.out.println("Kelime bir polindromik kelimedir.");
		} else {
			System.out.println("Kelime polindromik bir kelime değildir.");
		}
	}

}
