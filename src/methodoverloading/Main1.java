package methodoverloading;

class LaptopDetails{

    public String specification(String name, String colour, int price){
        return name + " - " + colour + " -> " + price;
    }

    public void specification(int price, String name, String colour){
        System.out.println(price + " - " + name + " -> " + colour);
    }
}

public class Main1 {

    public static void main(String[] args){

        LaptopDetails ld = new LaptopDetails();

        String s = ld.specification("Asus", "Mystic Rose", 200000);
        System.out.println(s);

        ld.specification(100000, "Lenovo", "Matt Silver");

    }
}
