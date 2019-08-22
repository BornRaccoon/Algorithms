/**
 * @Name:		 BasicHashTable.java
 * @Author:		 BornRaccoon
 * @Description: This is an example of a basic hash table, without using the
 *               built-in one.
 */

package codingexercises;

import java.security.MessageDigest;
import java.util.LinkedList;

public class BasicHashTable {
    private LinkedList<Entry> table[];
    private int capacity = 100;
    private MessageDigest hash;
    
    BasicHashTable(){
        table = new LinkedList[capacity];
        try {
            hash = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
        }
        
    }
    
    public void put(Entry pair)
    {      
        int index = getIndex(pair.key);
        if (table[index] == null)
            table[index] = new LinkedList<Entry>();

        table[index].add(pair);
    }
    
    private int getIndex(String key) 
    {

        hash.update(key.getBytes());
        int initialHash = hash.hashCode();
        return (initialHash % capacity);
    }
    
    public int get(String key)
    {
        int index = getIndex(key);
        int value = 0;
        LinkedList<Entry> values = table[index];
        for (Entry e : values)
        {
            if (e.key.equals(key))
            {
                value = e.value;
                break;
            }
        }
        return value;
    }
}


