package CoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamHacks {

    public static void main(String[] args) {
        /**
         * 1. Null? No Problem! Stream.ofNullable() to the Rescue
         * Java 9's Stream.ofNullable() is your new best friend. 
         * It silently kicks out null values, saving you from those infamous crashes.
         */

         List<String> names = Arrays.asList("Alice", null, "Bob", "Charlie", null);
         List<String> filteredNames = names
                                      .stream()
                                      .flatMap(Stream::ofNullable)
                                      .collect(Collectors.toList());
        System.out.println(filteredNames);


        /**
         * 2. Infinite Streams? Yes, You Can! Stream.iterate()
         * Generate sequences on the fly - like magic
         * Need a never ending list of even numbers? Stream.iterate() has you covered
         * 
         */

         Stream.iterate(2, n -> n+2)
            .limit(5)
            .forEach(System.out::println); // 2, 4, 6. 8. 10

            /**
             * 3. takeWhile() & dropWhile():  Slice your Streams like a chef
             * Cut your data with precision
             * 
             * Java 9's dynamic duo lets you split collections based on conditions
             */

             List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
             List<Integer> taken = numbers
                                   .stream()
                                   .takeWhile(n -> n < 5) // Grabs [1, 2, 3, 4]
                                   .collect(Collectors.toList());
                System.out.println("taken:" +taken);

                List<Integer> dropped =  numbers
                                         .stream()
                                         .dropWhile(n -> n < 5)
                                         .collect(Collectors.toList());
                System.out.println("droped:"+dropped);


                /**
                 * 4. Collectors.teeing(): Two Birds, One Stone
                 * Run two collectors at once - then merge the results!
                 * Java 12's teeing() is a game changer for parallel processing
                 */

                 Map<String, Optional<Integer>> minMax = numbers.stream()
                 .collect(Collectors.teeing(
                    Collectors.maxBy(Integer::compare), // Finds max
                    Collectors.minBy(Integer::compare), //  Finds min
                   (max,min) -> Map.of("Max", max, "Min", min)
                 ));

                 /**
                  * Merge streams seamlessly with Stream.concat()
                  * Split collections into groups using partitioningBy()
                  * Generate ranges without loops via IntStream.range() and rangeClosed()

                  Why this matters?
                  * Reduce boilerplate code by 50%
                  * Prevent bugs
                  * Make your code instantly more readable
                  */


    }
    
}
