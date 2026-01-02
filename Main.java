public class Main {
    public static void main( String[] args ){

        StudentService service = new StudentService();  //object created

        Student s1 = new Student(402, "Mahi" , "Sunil" , " Neeta " , 90.5 );  // one student detail done

        service.addStudent(s1);
        System.out.println(s1);
    }
}
