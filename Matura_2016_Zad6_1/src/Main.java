import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static int klucz = 107%26;
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Cezar//dane_6_1.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		while(s.hasNextLine()) {
			StringBuilder string = new StringBuilder(s.nextLine());
			for(int i = 0; i<string.length();i++) {
				char z = znak(string.toString(),i);
				string.setCharAt(i, z);
			}
			System.out.println(string);
		}
	}
	
	private static char znak(String str, int i) {
		int z = (int)(str.charAt(i));
		if(z+3<=90) {
			z+=3;
		}else {
			z=z+3-26;
		}
		return (char) z;
	}

}
