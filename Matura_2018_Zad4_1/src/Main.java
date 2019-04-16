import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Files//sygnaly.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		int wiersz = 0;
		StringBuilder sb = new StringBuilder("");
		while(s.hasNext()) {
			wiersz++;
			String str = s.next();
			if(wiersz%40==0) {
				char ch = str.charAt(9);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}

}
