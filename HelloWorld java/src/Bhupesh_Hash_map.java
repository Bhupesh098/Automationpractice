import java.util.HashMap;
import java.util.Map;
public class Bhupesh_Hash_map {
        public static void main(String args[]){
            HashMap<Integer,String> map=new HashMap<Integer,String>();
            map.put(1,"iphone 13");
            map.put(2,"poco x4");
            map.put(3,"oneplus10 pro");
            map.put(4,"Realme Neo");

            System.out.println("Iterating Hashmap...");
            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
