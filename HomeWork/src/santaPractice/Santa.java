package santaPractice;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Santa {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        ArrayList<String> familymembers = new ArrayList<String>();

        System.out.println("type your familly member name, put 4 peoples name");
        String name = scan.nextLine();
        familymembers.add(name);
        while (familymembers.size() != 4){
            name = scan.nextLine();
            familymembers.add(name);
        }
        System.out.println("your family member ="+familymembers);
        System.out.println("for who you want to give the secret gift :");

        String nameremove = scan.nextLine();
        familymembers.remove(nameremove);

        int winner = random.nextInt(familymembers.size());
        String winnername = familymembers.get(winner);

        System.out.println(nameremove+"your gift will be given by "+winnername);
    }

}
