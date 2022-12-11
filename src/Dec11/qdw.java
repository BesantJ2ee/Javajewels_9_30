package Dec11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * The interface Queue is available in the java.util package and does extend the Collection interface. It is used to keep the elements that are processed in the First In First Out (FIFO) manner. It is an ordered list of objects, where insertion of elements occurs at the end of the list, 
 * and removal of elements occur at the beginning of the list
 * @author hp
 *
 */
public class qdw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * Creates a PriorityQueue with the default 
		 * initialcapacity (11) that orders its elements according to 
		 * their natural ordering.

		 */
		Queue<String> queue=new PriorityQueue<String>();
		/**
		 * Resizable-array implementation of the Deque interface. 
		 * Arraydeques have no capacity restrictions; they grow as necessary to supportusage. 
		 * They are not thread-safe; in the absence of externalsynchronization, they do not support concurrent access by multiple threads.Null elements are prohibited. This class is likely to be faster than Stack when used as a stack, 
		 * and faster than LinkedListwhen used as a queue
		 */
		ArrayDeque<Integer> qa= new ArrayDeque<Integer>();
		/**
		 * 
		 * A linear collection that supports element insertion and removal at 
		 * both ends. The name deque is short for "double ended queue"and is 
		 * usually pronounced "deck". Most Deque implementations 
		 * place no fixed limits on the number of elementsthey may 
		 * contain, but this interface supports capacity-restricteddeques 
		 * as well as those with no fixed size limit. 
		 * This interface defines methods to access the elements at 
		 * bothends of the deque. Methods are provided to insert, remove, and 
		 * examine the element. Each of these methods exists in two forms:
		 * one throws an exception if the operation fails, 
		 * the other returns aspecial value (either null or false, depending onthe operation). The latter form of the insert operation isdesigned specifically for use with capacity-restricted Deque implementations; in most implementations, insertoperations cannot fail. 

The twelve methods described above are summarized in thefollowing table: 
Summary of Deque methods

 
First Element (Head)

Last Element (Tail)


Throws exception

Special value

Throws exception

Special value



Insert
addFirst(e) offerFirst(e) addLast(e) offerLast(e) 

Remove
removeFirst() pollFirst() removeLast() pollLast() 

Examine
getFirst() peekFirst() getLast() peekLast() 


This interface extends the Queue interface. When a deque isused as a queue, FIFO (First-In-First-Out) behavior results. Elements areadded at the end of the deque and removed from the beginning. The methodsinherited from the Queue interface are precisely equivalent to Deque methods as indicated in the following table: 
Comparison of Queue and Deque methods


Queue Method

Equivalent Deque Method



add(e)
addLast(e) 

offer(e)
offerLast(e) 

remove()
removeFirst() 

poll()
pollFirst() 

element()
getFirst() 

peek()
peekFirst() 


Deques can also be used as LIFO (Last-In-First-Out) stacks. Thisinterface should be used in preference to the legacy Stack class.When a deque is used as a stack, elements are pushed and popped from thebeginning of the deque. Stack methods are equivalent to Dequemethods as indicated in the table below: 
Comparison of Stack and Deque methods


Stack Method

Equivalent Deque Method



push(e)
addFirst(e) 

pop()
removeFirst() 

peek()
getFirst() 


Note that the peek method works equally well whena deque is used as a queue or a stack; in either case, elements aredrawn from the beginning of the deque. 

This interface provides two methods to remove interiorelements, removeFirstOccurrence and removeLastOccurrence. 

Unlike the List interface, this interface does notprovide support for indexed access to elements. 

While Deque implementations are not strictly requiredto prohibit the insertion of null elements, they are stronglyencouraged to do so. Users of any Deque implementationsthat do allow null elements are strongly encouraged not totake advantage of the ability to insert nulls. This is so because null is used as a special return value by various methodsto indicate that the deque is empty. 

Deque implementations generally do not defineelement-based versions of the equals and hashCodemethods, but instead inherit the identity-based versions from class Object. 

This interface is a member of the Java Collections Framework.
Type Parameters:<E> the type of elements held in this dequeSince:1.6Author:Doug LeaJosh Bloch
		 */
		Deque<Integer> deque = new ArrayDeque<Integer>();  
	    // Inserts the element.  
	    deque.add(1);  
	    deque.add(2);  
	    deque.add(3);  
	    System.out.println("Inserting three elements : ");  
	    for (Integer integer : deque) {  
	    System.out.println(integer);      
	    }  
	    // Popping the element.  
	    deque.pop();  
	    System.out.println("After popping : ");  
	    for (Integer integer : deque) {  
	        System.out.println(integer);  
	    }  
	    deque.remove(3);  
	    System.out.println("Removing the element 3 :"+deque);
	}

}
