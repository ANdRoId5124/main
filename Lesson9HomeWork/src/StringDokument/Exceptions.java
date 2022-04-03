package StringDokument;

public class Exceptions {
    public static class AbcException extends Exception {
        AbcException(String message) {
            super(message);
        }

        AbcException() {
        }
    }

    public static class StartException extends Exception {
        StartException(String message) {
            super(message);
        }
        StartException(){}
    }

    public static class EndException extends Exception{
        EndException(String message){
            super(message);
        }
        EndException(){}
    }
}