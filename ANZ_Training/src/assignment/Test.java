package assignment;

import java.util.Random;

public  class Test {
	public static String generateString(String s1,String s2,int A, int B) {
		StringBuilder sb= new StringBuilder();
		int aCount=0;
		int bCount=0;
		Random random= new Random();
		if(random.nextBoolean()) {
			sb.append(s1.charAt(random.nextInt(s1.length())));
			aCount++;
		}
		else {
			sb.append(s2.charAt(random.nextInt(s2.length())));
			bCount++;
			
		}
		while(aCount<A || bCount<B) {
			if(aCount<A && (bCount==B || random.nextBoolean())) {
				char c =s1.charAt(random.nextInt(s1.length()));
				if(sb.length() >=2 && c ==sb.charAt(sb.length()-1) && c==sb.charAt(sb.length()-2)) {
					while ( c == sb.charAt (sb.length() -1) && c==sb.charAt(sb.length()-2)) {
						c=s1.charAt(random.nextInt(s1.length()));
					}
				}
				sb.append(c);
				aCount++;
			}
			else {
				char c=s2.charAt(random.nextInt(s2.length()));
				if(sb.length()>=2 && c== sb.charAt(sb.length()-1) && c== sb.charAt(sb.length()-2)) {
					while(c==sb.charAt(sb.length()-1) &&  c==sb.charAt(sb.length()-2)) {
						c=s2.charAt(random.nextInt(s2.length()));
					}
				}
				sb.append(c);
				bCount++;
			}
		}
		return sb.toString();
	}

}
