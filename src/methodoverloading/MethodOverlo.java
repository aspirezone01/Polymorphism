package methodoverloading;

class LoginService{

    public String login(String username, String password){
        return "Login using username and password";
    }

    public void login(String username, int otp){
        System.out.println("Login using username and Otp");
    }
}

public class MethodOverlo {

    public static void main(String[] args){

        LoginService lg = new LoginService();

        String s = lg.login("samMathur","anjccjchdbjhdkalsjks");

        System.out.println(s);
        System.out.println("Hello from remote");

        lg.login("michealDubey",1234);


    }

}
