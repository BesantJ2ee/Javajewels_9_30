package java_Sep_18;

public class Oct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="The Departed";
		String[] xc=input.split(" ");
		for(int i=1;i<xc.length;i++)
		{
			String[] xcv=xc[i].split("");
			System.out.print(xc[0]+"  ");
			for(int j=xcv.length-1;j>=0;j--) 
			{
			 System.out.print(xcv[j]);		
			}
		}
	}

}
