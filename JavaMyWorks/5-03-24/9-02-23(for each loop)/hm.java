
class Students {
    String name;
    int marks;
    int rollno;
}

public class hm {
    public static void main(String[] args) {
        // int stu[]= new int[4];
        Students stu[] = new Students[3];

      stu[0] = new Students();
        stu[0].rollno = 10;
        stu[0].name = "Dhanu";
        stu[0].marks = 95;
       

         stu[1] = new Students();
        stu[1].rollno = 23;
        stu[1].name = "Kowsy";
        stu[1].marks = 97;
        

      stu[2] = new Students();
        stu[2].rollno = 1;
        stu[2].name = "Abi";
        stu[2].marks = 100;
        

        for (Students student : stu) {
            System.out.println(student.rollno + ": " + student.name + ": " + student.marks);
        }

    }
}
