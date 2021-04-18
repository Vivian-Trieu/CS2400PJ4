import java.io.IOException;
import java.nio.file.*;

public class redriver {
public static void main(String[] args) throws IOException {
    MaxHeap<Integer> orderheap = new MaxHeap<>();
    Integer[] data = Files.lines(Paths.get("data_sorted.txt")).map(Integer::parseInt).toArray(Integer[]::new);
    orderheap.heapSort(data, 10);
    Files.write(Paths.get("output.txt"),
    ( System.lineSeparator()+"====================================================================="
    + System.lineSeparator()+"Heap built using sequential insertions: ").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

    for (Integer integer : data) {
        // String convert = integer.toString()+",";
        // Files.write(Paths.get("output.txt"), (convert).getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        System.out.println(integer);
    }
    
    System.out.println("orderheap: "+ orderheap.getSwap());
    // for (int i = 0; i < 10; i++) {
    //     String convert = data[i].toString()+",";
    // }
    

    }
}