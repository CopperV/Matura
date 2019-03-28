import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		int liczby2 = 0;
		int liczby8 = 0;
		File file = new File("liczby\\liczby.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		while(s.hasNext()) {
			String linia = s.next();
			int znak = linia.length() - 1;
			if(linia.charAt(znak)=='0') liczby2++;
			if(linia.charAt(znak)=='0' && linia.charAt(znak-1)=='0' && linia.charAt(znak-2)=='0') liczby8++;
		}
		System.out.println(liczby2+" jest podzielnych przed 2");
		System.out.println(liczby8+" jest podzielnych przez 8");
	}

}
