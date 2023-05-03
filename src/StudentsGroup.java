import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentsGroup {
    private Student starosta;
    private List <Student> students = new LinkedList<>();
    private List <String> groupTasks = new ArrayList<>();

    public StudentsGroup(Student starosta) {
        this.starosta = starosta;
    }

    public void newStarosta(Student newStarosta) {
        if(getStudents().contains(newStarosta)) {
            addStudent(starosta);
            starosta = newStarosta;
            getStudents().remove(newStarosta);
        } else {
            System.out.println("No such students in group for set as starosta");
        }
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student studentRemove) {
        if(getStudents().contains(studentRemove)) {
            getStudents().removeIf(removeStudent -> removeStudent == studentRemove);
        } else {
            System.out.println("No such student");
        }
    }

    public void renameStudent(Student studentRename, String studentFirstName, String studentLastName) {
        if(getStudents().contains(studentRename)) {
            Student newName = new Student(studentFirstName, studentLastName);
            getStudents().set(getStudents().indexOf(studentRename), newName);
        } else {
            System.out.println("No such student");
        }
    }

    public void renameStarosta(Student starostaRename, String starostaFirstName, String starostaLastName) {
        if(this.starosta == starostaRename) {
            Student newStarostaName = new Student(starostaFirstName, starostaLastName);
            this.starosta = newStarostaName;
        } else {
            System.out.println("No such starosta");
        }
    }

    public void newGroupTask (String task){
        groupTasks.add(task);
        for(Student student : students){
            student.addNewTask(task);
        }
        starosta.addNewTask(task);
    }

    public void taskCompleted (String task, Student student){
        if(getStudents().contains(student)){
            student.setTaskCompleted(task);
        }else if(student == starosta){
            starosta.setTaskCompleted(task);
        }else{
            System.out.println("No such student or starosta");
        }
    }


    public List<Student> getStudents() {
        return students;
    }
}
