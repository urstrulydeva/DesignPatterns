package MVCPatternExample;


public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a model
        Student student = new Student("John Doe", "S123", "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentId("S456");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}

