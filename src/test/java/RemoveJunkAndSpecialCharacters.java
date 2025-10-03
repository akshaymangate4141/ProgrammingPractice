public class RemoveJunkAndSpecialCharacters {

    public static void main(String[] args) {

        String name="@#$%^name#$%^&*";

        String name2=name.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(name2);
    }


}
