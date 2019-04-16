import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Files//sygnaly.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		String s1 = s.nextLine();
		int liczba = 0;
		for(int i = 0;i<s1.length();i++) {
			if(czyPowtarzaSie(i, s1)) liczba++;
		}
		while(s.hasNextLine()) {
			String s2 = s.nextLine();
			int liczba2 = 0;
			for(int i = 0;i<s2.length();i++) {
				if(czyPowtarzaSie(i, s2)) liczba2++;
			}
			if(liczba2>liczba) {
				liczba = liczba2;
				s1 = s2;
			}
		}
		System.out.println(s1+" "+liczba);
	}
	
	private static boolean czyPowtarzaSie(int index, String str) {
		for(int i=0;i<index;i++) {
			if(str.charAt(index)!=str.charAt(i)) continue;
			else return false;
		}
		return true;
	}

}
