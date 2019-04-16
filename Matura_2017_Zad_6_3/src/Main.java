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
		int kontrast = 0;
		for(int j=0;j<piksele.length;j++) {
			for(int k=0;k<piksele[j].length;k++) {
				if(j-1>=0) {
					if(Math.abs(piksele[j][k]-piksele[j-1][k])>128) {
						kontrast++;
						continue;
					}
				}
				if(j+1<200) {
					if(Math.abs(piksele[j][k]-piksele[j+1][k])>128) {
						kontrast++;
						continue;
					}
				}
				if(k-1>=0) {
					if(Math.abs(piksele[j][k]-piksele[j][k-1])>128) {
						kontrast++;
						continue;
					}
				}
				if(k+1<320) {
					if(Math.abs(piksele[j][k]-piksele[j][k+1])>128) {
						kontrast++;
						continue;
					}
				}
			}
		}
		System.out.println(kontrast+" pikseli kontrastujacych");
	}

}
