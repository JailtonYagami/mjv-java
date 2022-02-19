public class School {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "ALOISIO";
        student.age = 25;
        student.color = "BLACK";
        student.sex = 'M';

        Student student2 = new Student();
        student2.name = "PEDOR";
        student2.age = 19;
        student2.color = "BLACK";
        student2.sex = 'M';

        System.out.println(student.toString());


    }
}
