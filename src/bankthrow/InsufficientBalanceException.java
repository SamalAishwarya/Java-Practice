package bankthrow;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String s){
        super(s);
    }

}
