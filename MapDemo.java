import java.util.*;
public class MapDemo{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(10,"96");
        map.put(9,"95");
        map.put(1,"97");
        map.put(2,"98");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

if(map.containsKey(1)){
            String a=map.get(1);
            System.out.println("value for key 1 is: "+a);
        }else{
            System.out.println("key is not found");
        }
        hm.put(key: 10, value: "89");
hm.remove("10")
    }
}