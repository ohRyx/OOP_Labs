package Lab_08;

public class UserDataException extends Exception {

    public UserDataException(String message)
    {
        super(message);
    }

    public UserDataException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
    
}
