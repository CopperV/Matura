import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		int liczby = 0;
		File file = new File("liczby//liczby.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		while(s.hasNext()) {
			String linia = s.next();
			int zera = 0;
			int jedynki = 0;
			for(int i = 0; i<linia.length(); i++) {
				if(linia.charAt(i)=='0') zera++;
				if(linia.charAt(i)=='1') jedynki++;
			}
			if(zera>jedynki) liczby++;
		}
		System.out.println(liczby+" liczb ma wiecej zer niz jedynek");
	}

}
