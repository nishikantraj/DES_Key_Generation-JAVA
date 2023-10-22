package generation;

import java.util.Random;

public class Key_Generation {
	protected static String getKey() {
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
}
