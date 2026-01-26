package methodoverloading;

class LoginService{

    public String login(String username, String password){
        return "Login using username and password"+password;
    }

    public void login(String username, int otp){
        System.out.println("Login using username and Otp");
    }
}

public class MethodOverlo {

    public static void main(String[] args){

        LoginService lg = new LoginService();

        String s = lg.login("samMathur","jedjhjbduknd");

        System.out.println(s);
        System.out.println("Hello from local");


        lg.login("michealDubey",1234);


    }

}
