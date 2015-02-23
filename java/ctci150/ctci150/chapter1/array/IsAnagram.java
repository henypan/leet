package ctci150.chapter1.array;

/**
 * <p>
 *  Write a method to decide if two strings are anagrams or not.
 * </p>
 * <p>
 * Copyright &copy 2015 Pan
 * </p>
 *
 * @author Henry Pan
 */
public class IsAnagram
{
    public static boolean anagram(String s, String t)
    {
        if (s.length() != t.length())
            return false;
        int[] letters_count = new int[128];
        int num_unique_chars = 0;
        int num_complteted_count = 0;
        char[] s_array = t.toCharArray();

        for (char c : s_array)
        {
            // here we do two things: 1) Add unique letter counters which is to count the number of
            // unique letter we encounters;  2) for each letter, we count the number of it.
            if(letters_count[c] == 0)
                num_unique_chars++;
            letters_count[c]++;
        }

        for (int i = 0; i<t.length(); i++)
        {
            int c = (int) t.charAt(i);
            if (letters_count[c] == 0)
                return false;
            letters_count[c]--;
            // make sure going through all the letters we encountered
            if (letters_count[c] == 0)
            {
                num_complteted_count ++;
                // At the time each letter count is compared, we compare the whole unique chars we
                // counted, if same, return true.
                if (num_complteted_count == num_unique_chars)
                    return true;
            }
        }
        return false;
    }
}
