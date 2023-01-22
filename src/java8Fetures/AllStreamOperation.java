package java8Fetures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
public class AllStreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		
		  int a[]= {3,4,4,7,3}; //Declare an Array
           
    Arrays.stream(a).filter(x->x%2==0).
    forEach(System.out::println); //Find the numbers divisible by 2
     
    System.out.println("Sum1 "+IntStream.of(a).map(i -> i).sum());
   
    System.out.println("Distinct element "+IntStream.of(a).map(i -> i).distinct()); 
    
    
   
 
    System.out.println("Sum2 "+Arrays.stream(a).filter(x->x%2==0).sum());
          
           //To find 
           OptionalDouble average=Arrays.stream(a).average();
                   
           if(average.isPresent())
          {
          	  System.out.println("Average"+average.getAsDouble());	
          }
          if(average.getAsDouble() == 0.0)
          {
          	System.out.println("Average is 0");
           }
         
          OptionalInt maxValue=Arrays.stream(a).max();
          OptionalInt minValue=Arrays.stream(a).min();
           
          System.out.println("Max    "+maxValue.getAsInt());
          
          System.out.println("Max    "+minValue.getAsInt());
          
          
          IntStream stream = IntStream.range(3, 400);
          Stream<Integer> stream1 = stream.boxed();
          System.out.println("Boxed");
          stream1.forEach(System.out::println);
          System.out.println("Stream5");     
       //   Stream<Object> stream5 = Stream.concat(stream1,
        //          Stream.of("troll", "for", "dswde"));
          
        //  stream5.forEach(System.out::println);
        //  stream5.close();
         // stream1.close();
          System.out.println("Doublestream");
          DoubleStream doubleStream = DoubleStream.generate(()
                  -> { 
                	  return (double)(Math.random() * 10000); 
                	  });
         
               // Displaying the randomly generated values
          doubleStream.limit(7).forEach(System.out::println);
          doubleStream.close();
          
          Stream<Integer> boxed=Arrays.stream(a).boxed();
          
          boxed.forEach(  
                  (n)->System.out.println(n)  
              );    
          //boxed.forEach( System.out::println); 
          boxed.close();
          
          //FlatMap
          List<Integer> PrimeNumbers = 
        		  Arrays.asList(5, 7, 11,13);       
          // Creating a list of Odd Numbers
          List<Integer> OddNumbers = 
        		  Arrays.asList(1, 3, 5);          
          // Creating a list of Even Numbers
          List<Integer> EvenNumbers = 
        		  Arrays.asList(2, 4, 6, 8);
    
          List<List<Integer>> listOfListofInts =
                  Arrays.asList
                  (PrimeNumbers, OddNumbers, EvenNumbers);
    
          System.out.println("The Structure before flattening is : " +
                                                    listOfListofInts);
            
          // Using flatMap for transformating and flattening.
          List<Integer> listofInts  = listOfListofInts.stream()
                                      .flatMap(n -> n.stream())
                                      .collect(Collectors.toList());
    
          System.out.println("The Structure after flattening is : " +
                                                           listofInts);
          
          
          ArrayList<Integer> marks = new ArrayList<Integer>();
          
          // These are marks of the students
          // Considering 5 students so input entries
          marks.add(30);
          marks.add(78);
          marks.add(26);
          marks.add(96);
          marks.add(78);
   
          // Printing the marks of the students before grace
          System.out.println(
              "Marks of students before grace : " + marks);
   
          // Now we want to grace marks by 6
          // using the streams to process over processing
          // collection
   
          // Using stream, we map every object and later
          // collect to List
          // and store them
          List<Integer> updatedMarks
              = marks.stream().filter(x->x>=30)
                    .map(i -> i + 6).distinct()
                    .collect(Collectors.toList());
   
          // Printing the marks of the students after grace
          System.out.println(
              "Marks of students  after grace : "
              + updatedMarks);
      
	
         
          Stream.iterate(2, i->i<=20, i->i+1).limit(10).forEach(System.out::println);
          
         
          Stream.iterate(2, n->n+1)   
          
          // Counter Started from 2, incremented by 1  
             
          .filter(number->number%2==0)    
             
          // Filtered out the numbers whose remainder is zero  
          // when divided by 2  
             
          .limit(5)    
          // Limit is set to 5, so only 5 numbers will be printed  
             
          .forEach(System.out::println);
          
          String str_Sample = "a";
          System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
          str_Sample = "b";
          System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
          str_Sample = "b";
          System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
	
	}
                  
	

}
