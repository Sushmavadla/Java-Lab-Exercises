package exceptions;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException()
	{
		System.out.println("Low Balance");
	}
	
    public InsufficientBalanceException(String msg)
    {
    	
    		System.out.println(msg);
    }
}
