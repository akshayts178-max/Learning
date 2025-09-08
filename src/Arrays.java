public class Arrays {
    public static void main(String[] args) {
        int nums[] [] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        Students s1 = new Students();
        s1.roll = 1;
        s1.name = "nbmnb";
        s1.marks = 78;

        Students s2 = new Students();
        s2.roll = 2;
        s2.name = "qwef";
        s2.marks = 23;

        Students s3 = new Students();
        s3.roll = 3;
        s3.name = "sdflkj";
        s3.marks = 55;

        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name + " : " + student[i].marks);
        }

        for (Students stud : student) {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }

    static class Students {
        int roll;
        String name;
        int marks;
    }
}


