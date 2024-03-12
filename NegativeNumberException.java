import java.util.InputMismatchException;

public class NegativeNumberException extends InputMismatchException{
	public NegativeNumberException(String msg){
		super(msg);
	}
}