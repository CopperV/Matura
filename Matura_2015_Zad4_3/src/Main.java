import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		String najm = "";
		String najw = "";
		int lNajm = 0;
		int lNajw = 0;
		File file = new File("Liczby\\liczby.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		int linia = 0;
		while(s.hasNextLine()) {
			linia++;
			String line = s.nextLine();
			if(linia==1) {
				najm = line;
				najw = line;
				lNajw = linia;
				lNajm = linia;
			}
			if(line.length()<najm.length()) {
				najm = line;
				lNajm = linia;
				continue;
			}
			if(line.length()>najw.length()) {
				najw = line;
				lNajw = linia;
				continue;
			}
			if(line.length()==najm.length()) {
				if(line.compareTo(najm) < 0) {
					najm = line;
					lNajm = linia;
				}
				continue;
			}
			if(line.length()==najw.length()) {
				if(najw.compareTo(line) < 0) {
					najw = line;
					lNajw = linia;
				}
				continue;
			}
		}
		System.out.println(najm+"-najmniejsza, na linii: "+lNajm);
		System.out.println(najw+"-najwieksza, na linii: "+lNajw);
	}

}
