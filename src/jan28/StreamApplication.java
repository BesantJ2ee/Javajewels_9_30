package jan28;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction t1= new Transaction(7,"GROCERY",190);
		Transaction t2= new Transaction(8,"MOBIL",180);
		Transaction t3= new Transaction(3,"GROCERY",170);
		Transaction t4= new Transaction(1,"MOBIL",160);
		Transaction t5= new Transaction(9,"GROCERY",150);
		Transaction t6= new Transaction(0,"MOBILE",10);
		
		
		List<Transaction> te= Arrays.asList(t1,t2,t3,t4,t5,t6);

		List<Integer> transactionId = te.stream().
				filter(k->k.getTransactionType().equalsIgnoreCase("GROCERY"))
				.sorted((o1,o2)->o1.getId().compareTo(o2.getId()))
				.map(c->c.getId())
				.collect(Collectors.toList());
		System.out.println("Grocery"+transactionId);
		
		Boolean transactionIds = te.stream().
				anyMatch(k->k.getTransactionType().equalsIgnoreCase("GROCERY"));
		
		long transactionIdu = te.stream().
				filter(k->k.getTransactionType().equalsIgnoreCase("GROCERY"))
				.count();
		
		Boolean allMach = te.stream().
				allMatch(k->k.getTransactionType().equalsIgnoreCase("GROCERY"));
		
		Boolean noMach = te.stream().
				noneMatch(k->k.getTransactionType().equalsIgnoreCase("MILK"));
		
		List<Integer> transactionIdvdd = te.stream().distinct()
				.sorted((o1,o2)->o1.getId().compareTo(o2.getId()))
				 .map(c->c.getId())
				.collect(Collectors.toList());
		
		Stream<Integer> stream
        = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

    // apply dropWhile to drop all the numbers
    // matches passed predicate
    List<Integer> list
        = stream.dropWhile(number -> (number == 4))
              .collect(Collectors.toList());

    // print list
    System.out.println(list);
				
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<?>>>>>>>>>>>>>>>>>>>>");
		transactionIdvdd.forEach(System.out::println);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<?>>>>>>>>>>>>>>>>>>>>");
		System.out.println(transactionId);
		System.out.print(transactionIds);
		System.out.print(transactionIdu);
		System.out.println(allMach);
		System.out.println(noMach);
		
		
		List<Integer> tedfsd= Arrays.asList(5,23,3,2,1);
	//	List<Integer> listdfvs
     //   = tedfsd.stream().collect(Collectors.averagingInt((ToIntFunction<? super T>) tedfsd));
		
		
		
		int sum = tedfsd.stream().reduce(0, (x,y) -> x+y);
		
		int multiplicaion = tedfsd.stream().reduce(1, (x,y)->x*y);
		
		System.out.println(tedfsd.stream().mapToInt(x->x).reduce(1, Math::multiplyExact));
		
		System.out.println(sum);
		
		System.out.println(multiplicaion);
		
		tedfsd.stream().mapToInt(Integer::intValue).sum();
		tedfsd.stream().mapToInt(Integer::intValue).average();

		System.out.println(tedfsd.stream().collect(Collectors.summingInt(Integer::intValue)));
		
		
		
		Stream<Integer> str = tedfsd.stream();
		  
        // Get Spliterator object on stream
        Spliterator<Integer> splitr = str.spliterator();
  
        // Get size of the list
        // encountered by the
        // forEachRemaining method
        System.out.println("Estimate size: "
                           + splitr.estimateSize());
  
        // Print getExactSizeIfKnown
        // returns exact size if finite
        // or return -1
        System.out.println("Exact size: "
                           + splitr.getExactSizeIfKnown());
  
        // Check if the Spliterator has all
        // the characteristics
        System.out.println("Boolean Result: "
                           + splitr.hasCharacteristics(
                                 splitr.characteristics()));
  
        System.out.println("Elements of ArrayList :");
  
        // print elements using forEachRemaining
        splitr.forEachRemaining(
            (n) -> System.out.println(n));
        
        
  
        // Obtaining another Stream to the array list.
        Stream<Integer> str1 = list.stream();
  
        splitr = str1.spliterator();
  
        // Obtain spliterator using     trySplit() method
        Spliterator<Integer> splitr2 = splitr.trySplit();
  
        // If splitr can be partitioned use splitr2 first.
        if (splitr2 != null) {
  
            System.out.println("Output from splitr2: ");
            splitr2.forEachRemaining(
                (n) -> System.out.println(n));
        }
  
        // Now, use the splitr
        System.out.println("Output from splitr1: ");
        splitr.forEachRemaining(
            (n) -> System.out.println(n));
 
			
	}

}
