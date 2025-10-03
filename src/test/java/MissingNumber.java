public class MissingNumber {
    public static void main(String[] args) {

        int a[]={1,2,3,4,6,7,8,9,10,11,12};

        int sum=0;

        int sum2=0;

        for(int i=0;i<a.length;i++){

            sum=sum+a[i];
        }

        for (int j=1;j<=12;j++){

            sum2=sum2+j;
        }

        System.out.println(sum2-sum);

    }

}
