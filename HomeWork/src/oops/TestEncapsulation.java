package oops;

public class TestEncapsulation {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setname("Iphone10");
        encapsulation.setprice(1200);

        System.out.println(encapsulation.getname());
        System.out.println(encapsulation.getprice());

        System.out.println(encapsulation.getname()+" "+encapsulation.getprice());
    }
}
