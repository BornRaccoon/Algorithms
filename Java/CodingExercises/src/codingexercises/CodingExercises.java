/**
 * @Name:		 CodingExercises.java
 * @Author:		 BornRaccoon
 * @Description: This is a collection of coding exercises. 
 */

package codingexercises;

import java.security.NoSuchAlgorithmException;

public class CodingExercises {

    public static void main(String[] args) {
       CodingExercises exercises = new CodingExercises();
       exercises.runExercises();
    }
        
    public void runExercises() 
    {
        //createStringBuilder();
        createHashTable();
    }
 
    //Exercises manually implementing a string builder
    private void createStringBuilder()
    {
        String words[] = new String[] {"hi","echo","low","low","ox","fox","rabbit",
                                       "cadbury","monitor"};
        BasicStringBuilder sentence = new BasicStringBuilder();
        
        for (String word : words)
            sentence.append(word);
        
        String s = sentence.toString();     
        System.out.println(s);
    }   
    
    //Exercises manually creating a hash table
    private void createHashTable() 
    {
        try {
            BasicHashTable table = new BasicHashTable();

            Entry item1 = new Entry("Shoes", 100);
            Entry item2 = new Entry("Handbag", 80);
            Entry item3 = new Entry("Cup", 10);
            Entry item4 = new Entry("Spoon", 3);
            Entry item5 = new Entry("Wallet", 45);

            table.put(item1);
            table.put(item2);
            table.put(item3);
            table.put(item4);
            table.put(item5);

            int value = table.get("Cup");
            System.out.println(value);       
            
        } catch (Exception e) {
            System.out.println(e.getMessage());  
        }

    }  
}


