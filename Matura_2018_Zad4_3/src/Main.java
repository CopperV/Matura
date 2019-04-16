import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Files//sygnaly.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		int licznik = 0;
		while(s.hasNext()) {
			String s1 = s.next();
			if(czy10(s1)) {
				System.out.println(s1);
				licznik++;
			}
		}
		System.out.println(licznik);
	}
	
	private static boolean czy10(String s1) {
		for(int i = 0;i<s1.length();i++) {
			for(int j=0;j<i;j++) {
				int z1 = s1.charAt(i);
				int z2 = s1.charAt(j);
				if(Math.abs(z1-z2)>10) return false;
			}
		}
		return true;
	}

}
