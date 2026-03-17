class student {
    String name;
    int rollNo;
    int marks;

    // Constructor
    student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to check exam eligibility
    void checkEligibility() {
        if (marks >= 40) {
            System.out.println(name + " (Roll No: " + rollNo + ") is eligible for the exam.");
        } else {
            System.out.println(name + " (Roll No: " + rollNo + ") is NOT eligible for the exam.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating 3 objects
        student s1 = new Student("Arun", 101, 75);
        student s2 = new Student("Meena", 102, 35);
        student s3 = new Student("Rahul", 103, 50);

        // Checking eligibility
        s1.checkEligibility();
        s2.checkEligibility();
        s3.checkEligibility();
    }
}

