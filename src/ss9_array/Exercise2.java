package ss9_array;

import java.util.Scanner;

public class Exercise2 {
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

}
