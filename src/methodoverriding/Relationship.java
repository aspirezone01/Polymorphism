package methodoverriding;

public class Relationship {

    public static void main(String[] args){

        Parents ps = new Child();
        ps.relationship();
    }
}

class Parents{
    public void relationship(){
        System.out.println("My child is very Polite and Courteous");
    }
}

class Child extends Parents{
    @Override
    public void relationship(){
        System.out.println("Glad to have a parent like this");
    }
}
