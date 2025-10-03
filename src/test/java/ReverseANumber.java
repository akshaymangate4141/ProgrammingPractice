public class ReverseANumber {

    public static void main(String[] args) {

        int num=12345;

        int reverse=0;

        while (num!=0){

            reverse=reverse*10+num%10;

            num=num/10;
        }

        System.out.println(reverse);

        System.out.println(new StringBuffer(String.valueOf(reverse)).reverse());
    }

}
