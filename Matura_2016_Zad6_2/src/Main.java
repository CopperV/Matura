import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Cezar//dane_6_2.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		while(s.hasNext()) {
			String str = s.next();
			int key = s.nextInt()%26;
			StringBuilder strb = new StringBuilder(str);
			for(int i = 0; i<str.length();i++) {
				char z = znak(str,i,key);
				strb.setCharAt(i, z);
			}
			System.out.println(strb);
		}
	}
	
	private static char znak(String str, int i, int key) {
		int z = (int)(str.charAt(i));
		if(z-key>=65) {
			z-=key;
		}else {
			z=26-key+z;
		}
		return (char) z;
	}

}
