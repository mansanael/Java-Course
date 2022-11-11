public class TryConst {
    private String username;
    private int age;

    public TryConst(){}

    public TryConst (String username){
        this.username = username;
    }

    public TryConst(String username, int age){
        this.username = username;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void main(String[] args){
        TryConst tryConst = new TryConst();
        TryConst tryConst1 = new TryConst("Mansa");
        System.out.println(tryConst.age = 100);
        TryConst tryConst2 = new TryConst("Babs", 25);
    }
}
