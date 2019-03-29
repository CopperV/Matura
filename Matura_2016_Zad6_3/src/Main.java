import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Cezar//dane_6_3.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		while(s.hasNextLine()) {
			String str_source = s.next();
			String str_coded = s.next();
			int key = getKey(str_source, str_coded);
			if(!czyZaszyfrowany(str_source, str_coded, key)) {
				System.out.println(str_source);
			}
		}
	}
	
	private static int getKey(String str1, String str2) {
		int ch_str2 = str2.charAt(0);
		int ch_str1 = str1.charAt(0);
		int key;
		if(ch_str2-ch_str1>=0) {
			key = ch_str2-ch_str1;
		}else {
			key = ch_str2-ch_str1+26;
		}
		return key;
	}
	
	private static boolean czyZaszyfrowany(String s1, String s2, int key) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i = 0; i<s1.length();i++) {
			char z = znak(s1,i,key);
			if(z!=s2.charAt(i)) return false;
		}
		return true;
	}
	
	private static char znak(String str, int i, int key) {
		int z = (int)(str.charAt(i));
		if(z+key<=90) {
			z+=key;
		}else {
			z=z+key-26;
		}
		return (char) z;
	}

}
