package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;
import exceptions.DuplicateKeyException;
import exceptions.KeyNotFoundException;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	/**
	 * Constructor for Dictionary.
	 * Initializes the keys and values ArrayLists.
	 */
	public Dictionary()
	{
		this(DEFAULT_SIZE);
	}

	public Dictionary(int size)
    {
        this.keys = new ArrayList<>(size);
        this.values = new ArrayList<>(size);
    }

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException
	{
		if (keys.contains(key)) {
			throw new DuplicateKeyException("Key already exists: " + key);
		}
		this.keys.add(key);
		this.values.add(value);
		return true;
	}

    @Override
    public V remove(K key) throws KeyNotFoundException {
        if (!this.keys.contains(key)) {
            return null;
        }
        int index = this.keys.indexOf(key);
        V removedValue = this.values.get(index);
        this.keys.remove(index);
        this.values.remove(index);
        return removedValue;
    }

	@Override
	public boolean update(K key, V value) throws KeyNotFoundException
	{
		int index = keys.indexOf(key);
		if (index == -1) {
			throw new KeyNotFoundException("Key not found: " + key);
		}
		values.set(index, value);
		return true;
	}

	@Override
	public int size()
	{
		return keys.size();
	}

	@Override
	public boolean isEmpty()
	{
		return keys.isEmpty();
	}

	@Override
	public V lookup(K key)
	{
		int index = keys.indexOf(key);
		if (index == -1) {
			return null; // or throw KeyNotFoundException
		}
		return values.get(index);
	}

}
