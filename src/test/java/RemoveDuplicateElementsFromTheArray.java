import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateElementsFromTheArray {

    public static void main(String[] args) {

        String arr[]={"Java","C#","Python","Javascript","Typescript","Java","C++"};


        //First Way

        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if (arr[i].equals(arr[j])){

                    System.out.println("Duplicate Element is Found: "+arr[i]);
                }

            }
        }



        //Second Way

        HashSet<String>set=new HashSet<String>();

        for (String a:arr){

            if (set.add(a)==false){

                System.out.println("Duplicate Element Is Found: "+a);
            }
        }

        //Third Way

        HashMap<String,Integer>map=new HashMap<String, Integer>();

        for (String a:arr){

            Integer count=map.get(a);

            if (count==null){

                map.put(a,1);
            }

            else {

                map.put(a,count+1);
            }
        }

        Set<Map.Entry<String,Integer>> entry=map.entrySet();

        for (Map.Entry<String,Integer> a:entry){

            if (a.getValue()>1){

                System.out.println("Duplicate Number Is: "+a.getKey());
            }
        }



    }
}
