import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class redriver {
public static void main(String[] args) throws IOException {
    // Simpliest, but not the "correct" way to solve the question.
    // Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).sorted().forEach(System.out::println);

    MaxHeap<Integer> heap = new MaxHeap<>();
    
    List<Integer> ranint = Files.lines(Paths.get("data_sorted.txt")).map(Integer::parseInt).collect(Collectors.toList());
    ranint.forEach((n)->heap.add(n));

    Files.write(Paths.get("output.txt"),
    ("====================================================================="
    + System.lineSeparator()+"Heap built using sequential insertions: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    heap.writeHeap("output.txt", 10);
    
    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"Number of swaps in the heap creation: "+heap.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
   // System.out.println("Swap: "+heap.getSwap());

    for (int i = 0; i < 10; i++)
        heap.removeMax();
    Files.write(Paths.get("output.txt"),
    (System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    heap.writeHeap("output.txt", 10);


    Files.write(Paths.get("output.txt"),(System.lineSeparator()+System.lineSeparator()+"Heap built using optimal method: ").getBytes(), StandardOpenOption.APPEND);

    Integer[] data = Files.lines(Paths.get("data_sorted.txt")).map(Integer::parseInt).toArray(Integer[]::new);
    MaxHeap<Integer> optimal = new MaxHeap<>();
    optimal.heapSort(data, 10);

    for (Integer integer : data) {
    // String convert = integer.toString()+",";
    // Files.write(Paths.get("output.txt"), (convert).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    System.out.println(integer);
    }
    
    optimal.writeHeap("output.txt", 10);

    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"Number of swaps in the heap creation: "+optimal.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    //System.out.println("Swap: "+heap.getSwap());
    


    Files.write(Paths.get("output.txt"), (System.lineSeparator()+"====================================================================="+System.lineSeparator())
    .getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

    }
}





