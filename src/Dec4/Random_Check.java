package Dec4;

import java.util.Random;
//Random class is used to generate pseudo-random numbers in java
//An instance of this class is thread-safe
public class Random_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
        System.out.println(random.nextInt(16)*1000);
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextGaussian());
       
          System.out.println(random.nextLong());  
      System.out.println(random.nextInt());
       
      long seed = 95;
      random.setSeed(seed);
	}

}
