import java.util.ArrayList;
import java.util.List;

public class StudentService{

    // arraylist declaration
    private List<Student> students ;

    //constructor
    public StudentService() {
        students = new ArrayList<>();
    }

    //method to add students
    public void addStudent(Student student){
        students.add(student);
    }

    // method to print all students

        public void printAllStudents() {

            //handles enpty input
            
    if (students.isEmpty()) {
        System.out.println("No students available");
        return;
    }

    for (Student student : students) {
        System.out.println(student);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

    }

    // search student by id

    public Student searchById(int id){

        //for - each loop
        for ( Student student : students ){
            if(student.getId() == id ){
                return student;
            }
        }
        return null;
    }

  /* public boolean deleteStudentById(int id) {

    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getId() == id) {
            students.remove(i);
            return true;
        }
    }

    return false;
}
*/


    public boolean updateStudentById(int id, String name, String f_name, String m_name, double percentage) {

    for (Student student : students) {
        if (student.getId() == id) {

            student.setName(name);
            student.setF_name(f_name);
            student.setM_name(m_name);
            student.setPercentage(percentage);

            return true;
        }
    }

    return false;
}
        


     

}
