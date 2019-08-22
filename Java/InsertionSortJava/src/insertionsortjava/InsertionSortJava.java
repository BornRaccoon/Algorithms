/**
 * @Name:		 InsertionSortJava.java
 * @Author:		 BornRaccoon
 * @Description: This is a simple insertion sort in Java. 
 */

package insertionsortjava;

public class InsertionSortJava {

    public InsertionSortJava() {
    }
    
    public static void main(String[] args) {
        //Main sequence
        int sequenceToSort[] = {1,34,2,3,4,140,12,55,13,10};
        
        InsertionSortJava prog = new InsertionSortJava();
        prog.displayWelcomeMessage();
        String result = prog.run(sequenceToSort);
        System.out.println(result);
    }

    public String run(int[] sequenceToSort) {      
        int sortedSequence[] = runInsertionSort(sequenceToSort);
        String result = "Result: ";
        for (int digit : sortedSequence)
        {
            result += digit + " ";
        }
        return result;
    }
    
    private int[] runInsertionSort(int[] sequenceToSort)
    {         
       for (int index = 1; index < sequenceToSort.length; index++)
       {
            int key = sequenceToSort[index];
            int comparison = index - 1;
            while (comparison >= 0 && sequenceToSort[comparison] > key)
            {
                    sequenceToSort[comparison+1] = sequenceToSort[comparison];
                    comparison--;
            }
            sequenceToSort[comparison+1] = key;
       }   
       
       return sequenceToSort;
    }
    
    public void displayWelcomeMessage() {
        System.out.println("BornRaccoon: Java - Insertion Sort\n"
                + "Worst-case complexity: O(n^2)\n"
                + "Sequence of numbers: (1,34,2,3,4,140,12,55,13,10)");
    }

}
