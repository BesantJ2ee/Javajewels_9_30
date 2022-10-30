package java_Oct_29;

public class oddoreven1 {
	static String check(String x, String a) {
		int countf = 0;
		int countb = 0;
		String[] ax = x.split("");
		//PRASTIGE
		//12345678
		//01234567
		
			for (int i = 0; i < ax.length; i++) {
				if (ax[i].equals(a)) {
					countf = i+1;
					System.out.println(i+"Befor");
					continue;
				}
			}	
		
		
//		System.out.println(countf);
		
		
		for (int j = ax.length - 1; j >= 0; j--) {
			if (ax[j].equals(a)) {
				countb = j;
				break;
			}
		}
		// System.out.println(m);
	//	System.out.println(countb);
		String X1 = null;
		int y = countf + countb;
	//	System.out.println(y);
		if (y % 2 == 0) {
			X1 = "even";
		} else {
			X1 = "odd";
		}
		return X1;
	}
	public static void main(String[] args) {
		String n = oddoreven1.check("PRASTIGE", "S");
		System.out.println("This is a" + n + "number");
	}

}
