package arraysPractice;

public class Arrays {


    public static void main(String[] args) {
        String[]  array1 = {"a", "v", "d","s"};

         System.out.println(array1.length); //length of the array

         System.out.println(array1[2]); //how to get the value of the index
         System.out.println("=============");

        for (int q = 0; q < 3; q++) {
            System.out.println(array1[q]);

            for (int i = 0; i < 2; i++)
                System.out.println(i);
        }
        System.out.println("=============");

        String[] array2 = new String[3];
        array2[0]="jeff";
        array2[1]="jsk";
        array2[2]="mob";



        System.out.println(array2.length);
        System.out.println(array2[0]);
        System.out.println("===============");

        try {
        System.out.println(array2[3]);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }


        System.out.println("===============");


        System.out.println("class       name");

        for (int z=0; z<3; z++){
            System.out.println(z+"             "+array2[z]);
        }
        System.out.println("===============");

        Object [] obj = new Object [3];
        obj [0] = 12;
        obj [1] = 12.54;
        obj [2] = "sam";

        System.out.println(obj.length);
        for (int t = 0; t < obj.length; t++){
            System.out.println(obj[t]);
        }

    }







}