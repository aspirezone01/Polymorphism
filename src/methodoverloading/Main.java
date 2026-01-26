package methodoverloading;

public class Main {

    public static void main(String[] args){

        DisplayDetails d = new DisplayDetails();
        d.show("Mike", 10);
        d.show(20,"John");
    }
}

class DisplayDetails{

    public void show(String text, int number){

        System.out.println(text + " "+ number);
    }

    public void show(int number, String text){

        System.out.println(number + " "+ text);
    }
}
