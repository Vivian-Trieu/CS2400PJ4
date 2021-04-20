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

    for (int i = 0; i < 10; i++)
        heap.removeMax();
    Files.write(Paths.get("output.txt"),(System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    heap.writeHeap("output.txt", 10);


    // max heap of sorted data using optimal method
    MaxHeap<Integer> optimal = new MaxHeap<>(100);
    Files.write(Paths.get("output.txt"),(System.lineSeparator()+System.lineSeparator()+"Heap built using optimal method: ").getBytes(), StandardOpenOption.APPEND);
    Integer[] dint = Files.lines(Paths.get("data_sorted.txt")).map(Integer::parseInt).toArray(Integer[]::new);
    
    MaxHeap<Integer> opt = new MaxHeap<>(dint);
    opt.optimalWriteHeap("output.txt", 10);
    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"Number of swaps in the heap creation: "+opt.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
   
    for (int i = 0; i < 10; i++)
     opt.removeMax();
    Files.write(Paths.get("output.txt"),
    (System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);    
    opt.optimalWriteHeap("output.txt", 10);


    Files.write(Paths.get("output.txt"), (System.lineSeparator()+"====================================================================="+System.lineSeparator())
    .getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);


    MaxHeap<Integer> Rheap = new MaxHeap<>();
    
    List<Integer> Rranint = Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).collect(Collectors.toList());
    Rranint.forEach((n)->Rheap.add(n));

    Files.write(Paths.get("output.txt"),
    ("====================================================================="
    + System.lineSeparator()+"Heap built using sequential insertions: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    Rheap.writeHeap("output.txt", 10);
    
    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"Number of swaps in the heap creation: "+Rheap.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

    for (int i = 0; i < 10; i++)
        Rheap.removeMax();
    Files.write(Paths.get("output.txt"),(System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    Rheap.writeHeap("output.txt", 10);


    Files.write(Paths.get("output.txt"),(System.lineSeparator()+System.lineSeparator()+"Heap built using optimal method: ").getBytes(), StandardOpenOption.APPEND);
    Integer[] Rdint = Files.lines(Paths.get("data_random.txt")).map(Integer::parseInt).toArray(Integer[]::new);
    
    MaxHeap<Integer> Ropt = new MaxHeap<>(Rdint);
    Ropt.optimalWriteHeap("output.txt", 10);
    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"Number of swaps in the heap creation: "+Ropt.getSwap()).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
   
    for (int i = 0; i < 10; i++)
     Ropt.removeMax();
    Files.write(Paths.get("output.txt"),
    (System.lineSeparator()+"Heap after 10 removals: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);    
    Ropt.optimalWriteHeap("output.txt", 10);


    Files.write(Paths.get("output.txt"), (System.lineSeparator()+"====================================================================="+System.lineSeparator())
    .getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}





