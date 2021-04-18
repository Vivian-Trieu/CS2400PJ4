
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
public class unitTests {


    // max heap sorted data using sequential insertions
    @Test
    public void seqInsertions() throws FileNotFoundException{
        
        /*
        ArrayList<Integer> data = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("data_sorted.txt"))) {
        while(sc.hasNext());
            data.add(sc.nextInt());
        }
        Integer[] sortedData_array = data.toArray(new Integer[]{});

        MaxHeap<Integer> heap1 = new MaxHeap<>();
        

        System.out.println("Heap built using sequential insertions: "); */
    }
    
    // max heap of sorted data using optimal method
    @Test
    public void optimalMethod(){
        try
        {
            ArrayList<Integer> readDataSorted = new ArrayList<Integer>();
            File file = new File("data_sorted.txt");
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
        catch (IOException e)
        {
            System.out.println("Error while reading");
        }

    }
}
