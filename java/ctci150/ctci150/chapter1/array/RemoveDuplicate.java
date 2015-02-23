package ctci150.chapter1.array;


/**
 * <p>
 * Design an algorithm and write code to remove the duplicate characters in a string without using
 * </br> any additional buffer.
 * </br> Pay attention that the input string is considered as a char array.
 * </p>
 * <p>
 * Copyright &copy Pan
 * </p>
 * 
 * @author Henry Pan
 */
public class RemoveDuplicate
{
    public void removeDuplicate(char[] str)
    {
        if(str == null) return;
        if(str.length < 2) return;
        
        int tail = 1;
        
        for (int i = 1; i < str.length; i++)
        {
            int j;
            for (j = 0; j < tail; j++)
            {
                if (str[j] == str[i])
                    break;
            }
            
            if (j == tail)
            {
                str[tail] = str[i];
                tail++;
            }
        }
        str [tail] = 0;
    }
    
    public static void main(String[] args)
    {
        RemoveDuplicate rd = new RemoveDuplicate();
        String input = "aabdecf";
        char[] resultStr = input.toCharArray();
        rd.removeDuplicate(resultStr);
        System.out.println(resultStr);
    }
}
