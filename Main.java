import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print(" Enter your choice  ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Father Name: ");
                    String f_name = sc.nextLine();

                    System.out.print("Enter Mother Name: ");
                    String m_name = sc.nextLine();

                    System.out.print("Enter Percentage: ");
                    double percentage = sc.nextDouble();

                    service.addStudent(new Student(id, name, f_name, m_name, percentage));
                    System.out.println("Student added successfully");
                    break;

                case 2:
                    service.printAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    Student found = service.searchById(searchId);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Correct Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter Correct Father Name: ");
                    String newFather = sc.nextLine();

                    System.out.print("Enter Correct Mother Name: ");
                    String newMother = sc.nextLine();


                    System.out.print("Enter Correct Percentage: ");
                    double newPer = sc.nextDouble();

                    boolean updated = service.updateStudentById(
                            updateId, newName, newFather, newMother, newPer);

                    System.out.println(updated ? "Updated successfully" : "Student not found");
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = service.deleteStudentById(deleteId);
                    System.out.println(deleted ? "Deleted successfully" : "Student not found");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Choice not applied");
            }
        }
    }

}
