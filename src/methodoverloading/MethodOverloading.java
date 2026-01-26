package methodoverloading;

class Example {

    public int sum(int a, int b){
        return a+b;
  }


  public int sum(int a, int b, int c){
        return a+b+c;
  }

  public int sum(int a, int b, int c, int d){
        return a+b+c+d;
  }
}


public class MethodOverloading{
    public static void main(String[] args){

        Example e = new Example();

        int i = e.sum(4,5);
        int j = e.sum(4,5,6);
        int k = e.sum(4,5,6,7);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}
