import java.util.*;
import java.util.stream.Collectors;

public class Stream_Api {

    /*
     * 1)Stream allows functional style operations on collections,sequences of adat.
     * 2)Streams can be sequential or parallel, and they support operations that
     * can be executed in a pipeline.
     * 3)Stream opeartions are Lazy
     * 4) lazy operations are operations that are not executed immediately
     * but are deferred until a terminal operation is invoked
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("a", "b", "c", "d");

        /*
         * Filter is used for filtering the data of a stream on the basis of given
         * predicate.Only matched elements will be in the outut stream.
         */

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("a"))
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);
        // **************************************************************************************************************

        /*
         * Map is ued for iterating over each element and process function on every
         * element
         * and returns stream with transformed elements.
         */

        List<Integer> nameLength = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        nameLength.forEach(System.out::println);

        // ************************************************************************************************************

        // FlatMap is used for creating a single stream .

        List<List<String>> namesList = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David"));

        List<String> flatList = namesList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        flatList.forEach(System.out::println);

        // ***************************************************************************************************************

        // Distinct Function used for removing duplicates this will return distinct
        // elements only

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> distinctNos = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        distinctNos.forEach(System.out::println); // output is 1,2,3,4,5

        // *****************************************************************************************************************
        // */

        // sorted function is used for sorting the elements

        List<String> nameList = Arrays.asList("Charlie", "Alice", "Bob");

        List<String> sortedNames = nameList.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedNames.forEach(System.out::println);

        // ****************************************************************************************************************************
        // */

        // Limit method Truncates the stream to contain no more than maxSize elements.

        List<Integer> limitedNumbers = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        limitedNumbers.forEach(System.out::println);

        // ****************************************************************************************************************************

        // Skip function Skips the first n elements of the stream.

        List<Integer> skippedNumbers = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());

        skippedNumbers.forEach(System.out::println);

        // **************************************************************************************************************************************************
        // */

        // Reduce Method Reduces the elements of the stream into a single value using an
        // associative accumulation function and an identity value.

        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);

    }

}
