package utilities;

import exceptions.DuplicateKeyException;
import exceptions.KeyNotFoundException;

/**
* DictionaryADT.java
*
* @author amrit reddy
* @version 1.0
* 
* Interface Definition: This interface represents the contract for a Dictionary ADT (Abstract Data Type) 
that stores key-value pairs with unique keys.
*/

public interface DictionaryADT<K,V>
{
/**
 * Inserts a new key-value pair into the dictionary.
 * @param key the key to be inserted (must be unique)
 * @param value the value associated with the key
 * @throws DuplicateKeyException if the key already exists in the dictionary
 * @throws NullPointerException if the key is null
 * @precondition key != null
 * @postcondition dictionary contains the new key-value pair
 * @postcondition size of the dictionary increases by 1
 */
    boolean insert(K key, V value) throws DuplicateKeyException;

/**
 * Removes the key-value pair associated with the specified key from the dictionary.
 * @param key the key to be removed
 * @return the value associated with the removed key, or null if the key does not exist
 * @throws NullPointerException if the key is null
 * @throws KeyNotFoundException if the key does not exist in the dictionary
 * @precondition key != null
 * @postcondition dictionary no longer contains the key-value pair
 * @postcondition size of the dictionary decreases by 1 if the key was found
*/
    V remove(K key) throws KeyNotFoundException;

/**
 * Updates the value associated with the specified key in the dictionary.
 * @param key the key whose value is to be updated
 * @param value the new value to be associated with the key
 * @throws KeyNotFoundException if the key does not exist in the dictionary
 * @throws NullPointerException if the key is null
 * @precondition key != null
 * @precondition key exists in the dictionary
 * @postcondition the value associated with the key is updated to the new value
*/
    boolean update(K key, V value) throws KeyNotFoundException;

/**
 * Returns the number of key-value pairs in the dictionary.
 * @return the number of elements in the dictionary
 * @postcondition returns the size of the dictionary
 */
    int size();

/**
 * Checks if the dictionary is empty.
 * @return true if the dictionary contains no key-value pairs, false otherwise
 * @postcondition returns true if size() == 0, false otherwise
 */
    boolean isEmpty();

/**
 * Checks if the dictionary contains a specific key and returns the value.
 * @param key the key to check for existence
 * @return the value associated with the key if it exists, null otherwise
 * @throws NullPointerException if the key is null
 * @precondition key != null
 * @postcondition returns the value associated with the key if it exists, null otherwise
 */
    V lookup(K key) throws KeyNotFoundException;
}
