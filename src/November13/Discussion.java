package November13;

public class Discussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "RRR", "Ram", "Lakhan" };
		char[] s1 = { 'R', 'm', 'L' };
		String a1 = "Ram";
		char a2='m';
		//For each loop
		for(String aa1:s)
		{
			System.out.println(aa1);
			
		}
		
		
		
		
		
		
		

		for (int i = 1; i < s.length; i++) {
			if (s[i].equals(a1)) {
				System.out.println(i);

			}
		}
		
		for (int j = 0; j < s1.length; j++) {
			if (s1[j]==a2) {
				System.out.println(j);

			}
		}
		

	}

}
