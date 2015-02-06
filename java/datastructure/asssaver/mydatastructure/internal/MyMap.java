package asssaver.mydatastructure.internal;

import java.util.Arrays;

/**
 * <p>
 * Internal implementation of Map structure.
 * </p>
 * <p>
 * Copyright &copy 2014 Cerner Corporation
 * </p>
 * 
 * @author C09471
 * @param <K>
 *            generic key type
 * @param <V>
 *            generic value type
 */
public class MyMap<K, V>
{
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75F;

    private MyEntry<K, V>[] values;

    /**
     * Default constructor.
     */
    @SuppressWarnings("unchecked")
    public MyMap()
    {
        values = new MyEntry[DEFAULT_CAPACITY];
    }
    
    /**
     * @param initialSize
     *  initial size of my map
     */
    @SuppressWarnings("unchecked")
    public MyMap(int initialCapacity)
    {
        values = new MyEntry[initialCapacity];
    }
    
    /**
     * @return the size of my map
     */
    public int size()
    {
        return this.size;
    }

    /**
     * @param key
     *            key to the map
     * @return value to the key
     */
    public V get(K key)
    {
        for (int i = 0; i < size; i++)
        {
            if (values[i] != null && values[i].getKey().equals(key))
            {
                return values[i].getValue();
            }
        }
        return null;
    }

    /**
     * @param key
     *            the key of my map
     * @param value
     *            the value of my map
     */
    public void put(K key, V value)
    {
        boolean insert = true;
        for (int i = 0; i < size; i++)
        {
            if (values[i] != null && values[i].getKey().equals(key))
            {
                values[i].setValue(value);
                insert = false; // update instead of inserting
            }
        }

        if (insert)
        {
            ensureCapacity();
            values[size++] = new MyEntry<K, V>(key, value);
        }
    }

    /**
     * @param key
     *            the key to be removed from my map.
     */
    public void remove(K key)
    {
        for (int i = 0; i < size; i++)
        {
          if (values[i].getKey().equals(key))
          {
              values[i] = null;
              size--;
              condenseArray(i);
          }
        }
    }

    private void ensureCapacity()
    {
        if (size == values.length * LOAD_FACTOR)
        {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }
    
    private void condenseArray(int start)
    {
        for (int i = 0; i < start; i++)
        {
            values[i] = values[i + 1];
        }
    }
    
    /**
     * <p>
     * Internal implementation of my entry for MyMap.
     * </p>
     * <p>
     * Copyright &copy 2014 Cerner Corporation
     * </p>
     * 
     * @author C09471
     * @param <K>
     *            generic key type
     * @param <V>
     *            generic value type
     */
    public class MyEntry<K, V>
    {
        private final K key;
        private V value;

        /**
         * Constructs a MyEntry with key and value pair.
         * 
         * @param key
         *            current key of my entry
         * @param value
         *            current value of my entry
         */
        public MyEntry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        /**
         * @return the value
         */
        public V getValue()
        {
            return value;
        }

        /**
         * @param value
         *            the value to set
         */
        public void setValue(V value)
        {
            this.value = value;
        }

        /**
         * @return the key
         */
        public K getKey()
        {
            return key;
        }
    }
}
