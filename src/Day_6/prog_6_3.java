package Day_6;

class University {
    String universityName = "KIIT";
    String location = "Bhubaneswar";

    class Department {
        String deptName = "CSE";
        String hodName = "Dr. Sankar";

        void display() {
            System.out.println("University: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department: " + deptName);
            System.out.println("HOD: " + hodName);
        }
    }

    void showDepartment() {
        Department d = new Department();
        d.display();
    }
}

public class prog_6_3 {
    public static void main(String[] args) {
        University uni = new University();
        uni.showDepartment();
    }
}
