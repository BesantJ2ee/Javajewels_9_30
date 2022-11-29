package Nov27;
import org.apache.commons.lang3.StringUtils;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String place1 ="chennai";//Literal
		String p1 = new String("bangalore");
		//place1=place1+"a";//Explicitly re assighn chennai to new varable
		                   //chennaia
		//System.out.println(place1);
		place1.concat("a");
		//String immutable that mearns once u declare it will not cahnge
		//in order to change u need to reassighn
		//using equal(=) opereator
		//System.out.println(place1);
		
		//Final variable cannpt be changed
		//even for reassighnment case
		final String place2 ="chennai";
		//place2=place2.concat("a");
		
		//StringBuffer a1="sfsfs";
		//This is not allowed in stringbuffer for the case of literal
		StringBuffer a = new StringBuffer();
		a.append("Java");
		a.append("_");
		a.append("Programms");
		a.reverse();
		
		//now its a string buffer obkect
		//System.out.println(a);
		//Convert to string object
		//System.out.println(a.toString());
		
		
		
		StringBuilder az = new StringBuilder();
		az.append("Java");
		az.append("_");
		az.append("Programms");
		az.reverse();
		System.out.println(az.toString());
		
		
		
		
		
		
//	System.out.println(place1);
		
		final String place ="chennai";
	//	place=place+"a";
	//	System.out.println(place);
		
		String a5 ="a";
		a5=a5.concat("b");
		
		//StringUtils
		
		String placex ="chennai";
		
		
		//System.out.println(StringUtils.substring(placex, 2));
		
		System.out.println(StringUtils.substringAfter(placex, "a"));
		
		
		System.out.println(StringUtils.substringBefore(placex, "a"));
		
		//System.out.println(Integer.parseInt(placex));
		//System.out.println(Double.parseDouble(placex));
		//System.out.println(Boolean.pa);
         
		
		
	}

}
