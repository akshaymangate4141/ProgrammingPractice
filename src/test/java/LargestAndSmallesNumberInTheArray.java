import java.util.Arrays;

public class LargestAndSmallesNumberInTheArray {

    public static void main(String[] args) {


        int arr[]={12,10,20,11,25,40,50,42,41,55,44};

        int smallest=arr[0];

        int largest=arr[0];

        for (int i=1;i<arr.length;i++){

            if (arr[i]>largest){

                largest=arr[i];
            }

            else if (arr[i]<smallest){

                smallest=arr[i];
            }
        }

        System.out.println("Array Is Equal To: "+Arrays.toString(arr));

        System.out.println("Smallest Number Is Equal To: "+smallest);

        System.out.println("Largest number Is Equal To: "+largest);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
