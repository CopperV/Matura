import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Obraz//przyklad.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		int[][] piksele = new int[200][320];
		int i = 0;
		while(s.hasNext()) {
			for(int j=0; j<320; j++) {
				piksele[i][j] = s.nextInt();
			}
			i++;
		}
		int dlugosc = 0;
		for(int j = 0;j<320;j++) {
			int liczba = piksele[0][j];
			int t_dlugosc = 0;
			for(int k = 0;k<200;k++) {
				if(piksele[k][j]==liczba) t_dlugosc++;
				else {
					t_dlugosc=0;
					liczba = piksele[k][j];
				}
				if(t_dlugosc>dlugosc) dlugosc = t_dlugosc;
			}
		}
		System.out.println("Najdluzsza linia: "+dlugosc);
	}

}
