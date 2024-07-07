package ss7_debug_string;

public class Exercise2 {
    public static void main(String[] args) {
//        a. Chuyển đổi String thành int
        String str = "1000";
        int a = Integer.parseInt(str);
//        b. Chuyển đổi int thành String
        String b = String.valueOf(a);
//        c. Chuyển đổi String thành long
        long c = Long.parseLong(str);
//        d. Chuyển đổi long thành String
        String d = String.valueOf(c);
//        e. Chuyển đổi String thành float
        float e = Float.parseFloat(str);
//        f. Chuyển đổi float thành String
        String f = String.valueOf(e);
//        g. Chuyển đổi String thành double
        double g = Double.parseDouble(str);
//        h. Chuyển đổi double thành String
        String h = String.valueOf(g);
//        i. Chuyển đổi String thành short
        short i = Short.parseShort(str);
//        k. Chuyển đổi short thành String
        String k = String.valueOf(i);
    }
}
