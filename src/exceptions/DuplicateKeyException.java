package exceptions;

/**
 * Throw exception when attempting to insert a key that already exists in the dictionary.
 */
public class DuplicateKeyException extends Exception
{
    /**
     * Constructor for DuplicateKeyException.
     * @param message The message to be passed to the user,
     * indicating what went wrong.
     */
    public DuplicateKeyException(String message)
    {
        // Pass the message up to the parent Exception class
        super(message);
    }
}