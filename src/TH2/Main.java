package TH2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn A", 19, true, "JA1", "Hà Nội");
        Student student2 = new Student(2, "Nguyễn Thi B", 20, false, "JA2" , "Đà Nẵng");
        Student student3 = new Student(3, "Nguyễn Văn C", 21, true, "JA3" , "Hà Nội");

        System.out.println("--------Sinh viên 1----------------");
        student1.display();
        System.out.println("--------Sinh viên 2----------------");
        student2.display();
        System.out.println("--------Sinh viên 3----------------");
        student3.display();
    }

}
