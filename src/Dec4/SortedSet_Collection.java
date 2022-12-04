package Dec4;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;  
public class SortedSet_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stk= new Stack<Integer>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		
		
		
		SortedSet<Integer> fsnfcns = new TreeSet<Integer>();
		
		

	}

}
