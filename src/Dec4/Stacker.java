package Dec4; 
import java.io.*;
import java.util.*; 
public class Stacker {
	
	 static void stack_Besant_Push_Discussion(Stack<Integer> stackinteger)
	    {
		 stackinteger.push(1);
		 stackinteger.push(2);
		 stackinteger.add(90);
		 stackinteger.push(3);
		 stackinteger.push(4);
		 stackinteger.push(5);
		System.out.println(stackinteger);
		System.out.println("After pushing seeing the peek method"+stackinteger.peek());
	    }
	      
	    // Popping element from the top of the stack
	    static void stack_pop(Stack<Integer> stack)
	    {
	      //  System.out.println("Pop Operation:");
	  
	    	stack.pop();
	    	System.out.println("After pop operation"+stack);
	    	stack.pop();
	    	System.out.println("After 2nd pop operation"+stack);
	    	stack.pop();
	    	System.out.println("After 3rd pop operation"+stack);
	    	
	    	System.out.println(stack.peek());
	    }
	  
	    // Displaying element on the top of the stack
	    static void stack_peek(Stack<Integer> stack)
	    {
	    	stack.pop();
	    	stack.peek();
	    System.out.println("After peek operation"+stack.peek());
	    	//Integer element = (Integer) stack.peek();
	     //   System.out.println("Element on stack top: " + element);
	    }
	      
	    // Searching element in the stack
	    static void stack_search(Stack<Integer> stack, int element)
	    {
	        Integer pos = (Integer) stack.search(element);
	  
	        if(pos == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element is found at position: " + pos);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
	//	Stack<String> stack1 = new Stack<String>();
		
	//	stack1.push("Karz");
	//	stack1.push("Raone");
//stack1.push("Tezaab");
	//	stack1.push("PS1");
		
		/*
		 * System.out.println(stack1); System.out.println("Popping");
		 * System.out.println(stack1.pop()); System.out.println("After Popping");
		 * System.out.println(stack1); System.out.println("After 2ND Popping");
		 * System.out.println(stack1.pop()); System.out.println(stack1);
		 * 
		 * System.out.println(stack1.peek());
		 * 
		 * System.out.println(stack1.set(0, "ABCD"));
		 * 
		 * System.out.println(stack1); System.out.println("Searching");
		 * System.out.println(stack1.search("Ra"));
		 */
		
		  
		Stacker.stack_Besant_Push_Discussion(stack);
       
		Stacker.stack_pop(stack);
		Stacker.stack_peek(stack);
		
		
		
		//stack_pop(stack);
      //  stack_push(stack);
      //  stack_peek(stack);
          stack_search(stack, 1);
     //   stack_search(stack, 6);  

	
	Stack<Integer> a1 = new Stack<Integer>();
	a1.push(2);
	a1.push(4);
	a1.push(8);
	a1.push(12);
	
	
          Integer pos = (Integer) a1.search(45);
          
          System.out.println("Position for new stack"+pos);
          
	}



}
