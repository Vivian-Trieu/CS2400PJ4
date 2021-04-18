
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
public class unitTests {


    // max heap sorted data using sequential insertions
    @Test
    public void seqInsertions() throws FileNotFoundException{
        
        
    }
    
    // max heap of sorted data using optimal method
    @Test
    public void optimalMethod() throws IOException{
        {
            ArrayList<Integer> readDataSorted = new ArrayList<Integer>();
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("data_sorted.txt").getFile());
            Scanner reader = new Scanner(file);
            while (reader.hasNextInt())
            {
                readDataSorted.add(reader.nextInt());
            }

            
            Integer[] DataSorted_array = new Integer[readDataSorted.size()];
            for (int i = 0; i < readDataSorted.size(); i++)
                DataSorted_array[i] = readDataSorted.get(i);

            System.out.println(DataSorted_array);
            reader.close();
            MaxHeap<Integer> h = new MaxHeap<>();
            MaxHeap.heapSort(DataSorted_array, 100);
            h.printHeap("output.txt");
            reader.close();
        } 
    }
}
