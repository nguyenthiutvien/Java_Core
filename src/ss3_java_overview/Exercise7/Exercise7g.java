package ss3_java_overview.Exercise7;

public class Exercise7g {
    public static void main(String[] args) {
        int i = 1;
        int a =  i++ + ++i - i-- - --i;

        System.out.println("i =  " + i);
        System.out.println("a = " + a);
    }
}
