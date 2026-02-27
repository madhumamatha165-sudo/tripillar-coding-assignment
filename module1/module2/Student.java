class Student {
    int roll;
    String name;

    Student() {
        roll = 0;
        name = "Unknown";
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Lekhya");

        s1.display();
        s2.display();
    }
}
