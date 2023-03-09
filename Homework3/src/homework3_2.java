import java.util.Scanner;

public class homework3_2 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz: ");
		String kelime = scan.nextLine();
		String kelime1 = "";
		
		
		for(int i=kelime.length()-1; i>=0; i--) {
			kelime1 += kelime.charAt(i);	
		}
		
		System.out.println(kelime1);
		
		if(kelime.equals(kelime1)) {
			System.out.println("Girmis oldugunuz kelime palindromdur.");
		}
		else {
			System.out.println("Girmis oldugunuz kelime palindrom degildir.");
		}
		
		
	}
	
}
