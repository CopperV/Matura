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
		int max = piksele[0][0];
		int min = piksele[0][0];
		for(int j=0;j<piksele.length;j++) {
			for(int k=0;k<piksele[j].length;k++) {
				if(piksele[j][k]>max) max = piksele[j][k];
				if(piksele[j][k]<min) min = piksele[j][k];
			}
		}
		System.out.println("Najciemniejszy piksel: "+min);
		System.out.println("Najjasniejszy piksel: "+max);
	}

}
