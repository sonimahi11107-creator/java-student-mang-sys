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
    public void printAllStudents(){

        //for - each loop 
        for(Student student : students){    //for (datatype variable : list)
            System.out.println(student);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); // shoe seperation b/w each student
        }
    }

    // search student by id

    public Student searchById(int id){

        //for - each loop
        for ( Student student : students ){
            if(student.getId == id ){
                return student;
            }
        }
        return null;
    }
    
    


}
