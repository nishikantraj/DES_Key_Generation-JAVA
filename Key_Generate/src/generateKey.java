import java.util.Random;
import java.util.Scanner;
public class generateKey {
	public static String getKey() {
		char[]chr= {'a','b','c','d','e','f','g',
					'h','i','j','k','l','m','n',
					'o','p','q','r','s','t','u',
					'v','w','x','y','z','#','$','%','&','@'};
		Random rand=new Random();
		int len=chr.length;
		StringBuilder str=new StringBuilder();
		for(int i=0;i<8;i++) {
			str.append(chr[rand.nextInt(len)]);
		}
		return str.toString();
	}
	public static String menu_driven() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Manual Key Generation:  [0]");
		System.out.println("Dyanmic Key Generation: [1]");
		int choice=sc.nextInt();
		String static_key, dynamic_key;
		switch(choice) {
			case 0: System.out.println("Enter 8 character as a Key: ");
					static_key=sc.next();
					if(static_key.length()==8) {
//						System.out.println("Key: "+static_key);
						return static_key;
					}
					else {
						System.out.println("Length of Key should be 8.");
						menu_driven();
					}
			case 1: dynamic_key=getKey();
//					System.out.println("Key: "+dynamic_key);
					return dynamic_key;
			default: System.out.println("Invalid Input");
		}
		return null;
	}

	public static void main(String[] args) {
		menu_driven();
	}
}
