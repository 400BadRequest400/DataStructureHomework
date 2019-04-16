package arraysPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class ScannerClass {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("give me the name of 3 players");

        String name = scanner.nextLine();
        arrayList.add(name);


        while (arrayList.size()!= 5){
        name = scanner.nextLine();
        arrayList.add(name);

        }
        System.out.println(arrayList);



        }


    }

