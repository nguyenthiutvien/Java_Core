package ss9_array;

import java.util.Scanner;

public class Exercise3 {
    static Scanner scanner = new Scanner(System.in);

    static String[] name = new String[5];
    static int[] age = new int[5];
    static String[] gender = new String[5];
    static double[] salary = new double[5];
    ;
    static double[] averageScore = new double[5];
    static int n = 0;

    public static void main(String[] args) {

        String choice;

        do {
            inputInfor(n);
            n++;
            System.out.println("Enter Yes to continue and No to break");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("YES") || choice.equalsIgnoreCase("yES") || choice.equalsIgnoreCase("YeS"));

        for (int i = 0; i < n; i++) {
            System.out.println("The information of employee " + (i + 1) + " is ");
            outputInfor(i);
        }
        System.out.println("Employee have most high point is: ");
        findHighPoint();

        System.out.println("Enter exactly name what you find");
        String names = scanner.nextLine();
        findExactlyName(names);
        System.out.println("Enter name what you find");
        String nearName = scanner.nextLine();
        findNearExactlyName(nearName);
    }

    static void inputInfor(int i) {
        System.out.print("Enter name: ");
        name[i] = scanner.nextLine();

        System.out.print("Enter age: ");
        age[i] = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter gender: ");
        gender[i] = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary[i] = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter average score: ");
        averageScore[i] = Double.parseDouble(scanner.nextLine());

    }

    static void outputInfor(int i) {
        System.out.println("Name: " + name[i]);
        System.out.println("Age: " + age[i]);
        System.out.println("Gender: " + gender[i]);
        System.out.println("Salary: " + salary[i]);
        System.out.println("Average score: " + averageScore[i]);

    }

    //    Find employee who have most high point average
    static void findHighPoint() {
        double max = averageScore[0];
        for (int i = 1; i < n; i++) {
            if (max < averageScore[i]) {
                max = averageScore[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (max == averageScore[i]) {
                outputInfor(i);
            }
        }

    }

    //    Find by exactly name
    static void findExactlyName(String names) {
        for (int i = 0; i < n; i++) {
            if (names.equals(name[i])) {
                outputInfor(i);
            }
        }
    }

    static void findNearExactlyName(String names) {
        for (int i = 0; i < n; i++) {
            if ((name[i]).contains(names)) {
                outputInfor(i);
            }
        }
    }
}
