public class JavaMethods {

        String name = "Bruce";

        String getName(){
            return this.name;
        }


    public static void main(String[] args)
    {
        JavaMethods bruce = new JavaMethods();
        String name = bruce.getName();
        System.out.println(name);
    }


}
