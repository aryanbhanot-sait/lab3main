package exceptions;

/**
 * Throw exception when attempting to access or update a key that does not exist in the dictionary.
 */
public class KeyNotFoundException extends Exception
{
    /**
     * Constructor for KeyNotFoundException.
     * @param message The message to be passed to the user,
     * indicating what went wrong.
     */
    public KeyNotFoundException(String message)
    {
        // Pass the message up to the parent Exception class
        super(message);
    }
}