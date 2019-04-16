package arraysPractice;
import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("akli");
        arrayList.add("jeff");
        arrayList.add("winsen");
        arrayList.add("menad");

        System.out.println(arrayList.size());
        System.out.println("===================");

        for (String x: arrayList){

        //for (int i=0; i < arrayList.size(); i++ ){ in arrayList this kind of loop doesn't work


           System.out.println(x);
        }
        System.out.println("===================");

        arrayList.remove(0);

        System.out.println("===================");

        System.out.println(arrayList);

    }






}
