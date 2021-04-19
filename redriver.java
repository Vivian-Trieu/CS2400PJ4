import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class redriver extends MaxHeap<String> {
public static void main(String[] args) throws IOException {
    // Simpliest, but not the "correct" way to solve the question.
    // Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).sorted().forEach(System.out::println);

    // max heap of sorted data using sequential insertions
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

    // max heap of sorted data using optimal method
    MaxHeap<Integer> optimal = new MaxHeap<>(100);
    Files.write(Paths.get("output.txt"),(System.lineSeparator()+System.lineSeparator()+"Heap built using optimal method: ").getBytes(), StandardOpenOption.APPEND);

    // Integer[] data = Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).toArray(Integer[]::new);
    // optimal.heapSort(data, 10);
    // data.forEach(System.out::println);
    // optimal.writeHeap("output.txt", 100);


    Integer[] dint = Files.lines(Paths.get("data_sorted.txt")).map(Integer::parseInt).toArray(Integer[]::new);
    optimal.heapSort(dint, 10);
    System.out.println("nos: "+optimal.getSwap());

    for (int i=dint.length; i>=90; i--) {
        System.out.println(i);
        // String convert = integer.toString()+",";
        // Files.write(Paths.get("output.txt"), (convert).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }


    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"Number of swaps in the heap creation: "+optimal.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
   
    for (int i = 0; i < 10; i++)
        optimal.removeMax();
    Files.write(Paths.get("output.txt"),
    (System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    optimal.writeHeap("output.txt", 10);
    
    
    Files.write(Paths.get("output.txt"), (System.lineSeparator()+"====================================================================="+System.lineSeparator())
    .getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

     // max heap of randomized data using sequential insertions
     MaxHeap<Integer> heap2 = new MaxHeap<>();
    
     List<Integer> randomizedData = Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).collect(Collectors.toList());
     randomizedData.forEach((n)->heap2.add(n));
 
     Files.write(Paths.get("output.txt"),
     ("====================================================================="
     + System.lineSeparator()+"Heap built using sequential insertions: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
     heap2.writeHeap("output.txt", 10);
     
     Files.write(Paths.get("output.txt"),
     ( System.lineSeparator()+"Number of swaps in the heap creation: "+heap2.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    // System.out.println("Swap: "+heap.getSwap());
 
     for (int i = 0; i < 10; i++)
         heap2.removeMax();
     Files.write(Paths.get("output.txt"),
     (System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
     heap2.writeHeap("output.txt", 10);
 
    }
}





