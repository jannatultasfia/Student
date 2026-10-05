class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    Student highestMark(Student[] arr) {
        Student top = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].marks > top.marks) {
                top = arr[i];
            }
        }
        return top;
    }

    Student findById(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].id == id) {
                return arr[i];
            }
        }
        return null;
    }

    double averageMark(Student[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].marks;
        }
        return sum / arr.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Jannatul", 88);
        Student s2 = new Student(2, "Tasfia", 92);
        Student s3 = new Student(3, "Snigdha", 79);
        Student s4 = new Student(4, "Riya", 65);
        Student s5 = new Student(5, "Shipa", 85);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        System.out.println("All students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].id + ", " + students[i].name + ", " + students[i].marks);
        }

        Student top = s1.highestMark(students);
        System.out.println("Highest: " + top.name + ", " + top.marks);

        Student found = s1.findById(students, 3);
        if (found != null) {
            System.out.println("Found: " + found.name + ", " + found.marks);
        }
        else {
            System.out.println("Student not found");
        }

        double avg = s1.averageMark(students);
        System.out.println("Average: " + avg);
    }
                               }
