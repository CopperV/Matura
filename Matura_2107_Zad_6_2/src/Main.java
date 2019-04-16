import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Obraz//dane.txt");
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
		int licznik = 0;
		for(int j = 0;j<piksele.length;j++) {
			if(!isSimetric(j, piksele)) licznik++;
		}
		System.out.println(licznik);
	}
	
	private static boolean isSimetric(int index, int[][] tab) {
		for(int i=0;i<tab[index].length/2;i++) {
			if(tab[index][i]!=tab[index][tab[index].length-i-1]) {
				return false;
			}
		}
		return true;
	}

}
