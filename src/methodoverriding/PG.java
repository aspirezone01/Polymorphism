package methodoverriding;

class Owner{

    public void relationship(){
        System.out.println("PG Owner is very good in behaviour");
    }
}

class Tenant extends Owner{

    public void relationship(){
        System.out.println("PG Tenant is very happy with the Owner");
    }
}

public class PG {
    public static void main(String[] args){

        Owner o = new Tenant();
        o.relationship();
    }
}
