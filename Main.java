public class Main {
    public static void main( String[] args ){

        StudentService service = new StudentService();  //object created

        Student s1 = new Student(402, "Mahi" , "Sunil" , " Neeta " , 90.5 );  // one student detail done
        Student s2 = new Student(403, "Shubhi" , "Dev" , "Lata" , 80.5 );
        Student s3 = new Student(404, "Rahi" , "Shusheel" , "Seeta " , 85 );



        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);

        boolean deleted = service.deleteStudentById(402);

        if (deleted) {
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Student not found");
        }

        service.printAllStudents();


    }
}
