package arraysPractice;

public class ArraySquare {

    public static void main(String[] args) {
        int[][]array3 = {{4, 5, 9, 10}, {14, 23, 9, 17}};
       // System.out.println(array3[1][3]);

        System.out.println(array3.length);

        System.out.println(array3[0].length);

        for (int h = 0; h < array3.length; h++) {


            for (int r = 0; r < 4; r++) {

                System.out.println(array3[h][r]);
            }
        }


    }
}
