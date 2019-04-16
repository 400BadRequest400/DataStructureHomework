package oops;

public class PolymorphismPhone {

    // method overloading
    // same method name, different parameters in a same class
    public void method(int x, int y) {
        int w = x + y;
        System.out.println(w);
    }

    public void method(int x, int y, int z){
        double w = x + y;
        double f = z/w;
        System.out.println(f);
    }

    public static void main(String[] args) {
        PolymorphismPhone polymorphismPhone = new PolymorphismPhone();
       // polymorphismPhone.method(6, 14);
        polymorphismPhone.method(6, 14,11);



        //polymorphismPhone.facetime();
    }
}