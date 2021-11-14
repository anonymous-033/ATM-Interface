public class InvalidIdPinException extends Exception{
    public InvalidIdPinException(){
        super("Invalid pin");
    }
    public InvalidIdPinException(String message){
        super(message);
    }
}
