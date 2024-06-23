package ss3_java_overview.Exercise7;

public class Exercise7e {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a =  i++ + j++ + i++ + j++;

        System.out.println("i =  " + i);
        System.out.println("j =  " + j);
        System.out.println("a = " + a);
    }
}
