import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Student {
    private String firstName;
    private String lastName;
    private String uniqueID;
    private Map <String, Boolean> studentTasks = new HashMap<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueID = UUID.randomUUID().toString();
    }

    public void addNewTask(String task){
        studentTasks.put(task, false);
    }

    public void setTaskCompleted(String task){
        if(studentTasks.containsKey(task)){
          studentTasks.replace(task, true);
        } else {
            System.out.println("No such task");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniqueID() {
        return uniqueID;
    }
}
