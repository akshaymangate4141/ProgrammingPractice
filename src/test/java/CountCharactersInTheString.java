import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharactersInTheString {

    public static void main(String[] args) {

        String name="AkshayMangate";

        HashMap<Character,Integer>map=new HashMap<Character, Integer>();

        for (char a:name.toCharArray()){

            Integer count=map.get(a);

            if (count==null){

                map.put(a,1);
            }

            else {

                map.put(a,count+1);
            }
        }

        System.out.println(map);


        String namu="AkshayKumar";

        HashMap<Character,Integer>map1=new HashMap<Character, Integer>();

        for (char a:namu.toCharArray()){

            Integer count=map1.get(a);

            if (count==null){

                map1.put(a,1);
            }
            else {

                map1.put(a,count+1);
            }
        }

        System.out.println(map1);

        Set<Map.Entry<Character,Integer>> entry=map1.entrySet();

        for (Map.Entry <Character,Integer>a:entry){

            if (a.getValue()>1 ){

                System.out.println("Duplicate Value Is: "+a.getKey());
            }
        }


    }
}
