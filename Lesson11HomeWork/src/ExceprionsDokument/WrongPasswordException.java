package ExceprionsDokument;

public class WrongPasswordException extends Exception{
    WrongPasswordException(String message){
        super(message);
    }
    WrongPasswordException(){}
}
