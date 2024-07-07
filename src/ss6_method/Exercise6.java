package ss6_method;
//Viết chương trình nhập thông tin của một nhân viên trong công ty. Thông tin cần nhập vào bao gồm: họ tên, tuổi, giới tính, mức lương cơ bản, điểm trung bình tốt nghiệp đại học (theo thang điểm 10). Sau khi nhập xong thì in thông tin đã nhập ra.


import java.util.Scanner;

public class Exercise6 {
    static String name;
    static int age;
    static  String gender;
    static  double salary;
    static  double averageScore;
    public static void main(String[] args) {
        enterInfor();
        outInfor();

    }
     static void enterInfor (){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter name: ");
         name = scanner.nextLine();

         System.out.println("Enter age: ");
         age = Integer.parseInt(scanner.nextLine());

         System.out.println("Enter gender: ");
         gender = scanner.nextLine();

         System.out.println("Enter salary: ");
         salary =  scanner.nextDouble();

         System.out.println("Enter avarage score: ");
         averageScore = scanner.nextDouble();


     }
     static  void outInfor (){
         System.out.println("Name: "+ name);
         System.out.println("Age: "+ age);
         System.out.println("Gender: "+ gender);
         System.out.println("Salary: "+ salary);
         System.out.println("Average score: : "+ averageScore);

     }
}
