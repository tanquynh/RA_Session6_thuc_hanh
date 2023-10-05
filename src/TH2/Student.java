package TH2;

public class Student {
    int studentId;
    String studentName;
    int age;
    boolean sex;
    String className;
    String address;

    public Student() {
    }

    public Student(int studentId, String studentName, int age, boolean sex, String className,String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.className = className;
        this.address = address;
    }

    public void display() {
        System.out.println("Mã HS " + studentId + "\n"
                            + "Tên học sinh : " + studentName + "\n"
                            + "Tuổi : " + age + "\n"
                            + "Giới tính : "  +(sex? "nam" : "nữ") + "\n"
                            + "Lớp : " + className + "\n"
                            + "Địa chỉ : " + address + "\n");
    }

}

