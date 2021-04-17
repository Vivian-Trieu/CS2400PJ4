import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.*;

public class driver {
public static void main(String[] args) throws IOException {
    
    // Simpliest, but not the "correct" way to solve the question.
    // List<Integer> num = Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).sorted().collect(Collectors.toList());
    // num.forEach(System.out::println);
    
    List<Integer> ranint = Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).collect(Collectors.toList());
    MaxHeap<Integer> heap = new MaxHeap<>();
    ranint.forEach((n)->heap.add(n));
    ranint.forEach(System.out::println);
   


/*      try (Stream<String> stream = Files.lines(Paths.get("data_random.txt"))) {
        //MaxHeap<Interger> Tree = new MaxHeap<>();
        // stream.sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList()).forEach(System.out::println);
        stream.forEach(System.out::println);
        //stream.sorted().forEach(System.out::println);
} */
    System.out.println("=====================================================================");
    System.out.println();


    }
}

/* =====================================================================
Heap built using sequential insertions: 100,94,99,77,93,98,61,68,76,84,...
Number of swaps in the heap creation: 480
Heap after 10 removals: 90,89,62,77,88,53,61,68,76,84,...

Heap built using optimal method: 100,95,99,79,94,98,63,71,78,87,...
Number of swaps in the heap creation: 96
Heap after 10 removals: 90,89,63,79,88,55,62,71,78,87,...
===================================================================== */