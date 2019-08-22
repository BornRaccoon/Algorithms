/**
 * @Name:		 BasicStringBuilder.java
 * @Author:		 BornRaccoon
 * @Description: This is an example of a basic string builder, without using the
 *               built-in one.
 */

package codingexercises;

import java.util.Arrays;

class BasicStringBuilder {   
    private int capacity;
    private int currentSize;
    private char characterArray[];
    
    public BasicStringBuilder()
    {
        capacity = 16;
        currentSize = 0;
        characterArray = new char[capacity];
    }
    
    public void append(String word)
    {
        if (currentSize + word.length() > capacity)
            increaseArrayCapacity(word.length());
        
        for (int index = 0; index < word.length(); index++)
        {
            characterArray[currentSize] = word.charAt(index);
            currentSize++;
        }
    }
    
    private void increaseArrayCapacity(int length)
    {
       capacity = capacity + length;
       char tempArray[] = Arrays.copyOf(characterArray, capacity);
       characterArray = tempArray.clone();
    }
    
    @Override
    public String toString()
    {
        return new String(characterArray, 0, currentSize);
    }
}