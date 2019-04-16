package arraysPractice;
import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(12);
        linkedList.add(24);
        linkedList.add(36);
        linkedList.add(48);

        System.out.println(linkedList.size());

        System.out.println(linkedList);

        for (int h = 0; h < linkedList.size(); h++){
            System.out.println(linkedList.get(h));
        }

        for(Integer j:linkedList){

            System.out.println(j);

        }
    }
}
