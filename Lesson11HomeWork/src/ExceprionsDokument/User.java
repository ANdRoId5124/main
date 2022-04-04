package ExceprionsDokument;


public class User {
    public static void showDataOfUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length() > 20) {
            throw new WrongLoginException("Login should have 20 symbols! No more!!!");
        }
        if(login.contains(" ")) {
            throw new WrongLoginException("Exceprion: User cannot use \" \" in login");
        }
        System.out.println("Login is" + " " + true);

        if(password.length() > 20){
            throw new WrongPasswordException("Password should have 20 symbols! No more!!!");
        }
        if(password.contains(" ")){
            throw new WrongPasswordException("Exceprion: User cannot use \" \" in password");
        }
        if(!password.contains("1") && !password.contains("2") && !password.contains("3")
                && !password.contains("4") && !password.contains("5") && !password.contains("6")
                && !password.contains("7") && !password.contains("8") && !password.contains("8")
                && !password.contains("0")){
            throw new WrongPasswordException("Password should have one digit at least");

        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Password should be == confirmPassword");
        }
        System.out.println("Password is " + true);
        }
    }

