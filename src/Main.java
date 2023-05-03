public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("First1", "Last1");
        Student student2 = new Student("First2", "Last2");
        Student student3 = new Student("First3", "Last3");
        Student student4 = new Student("First4", "Last4");
        Student student5 = new Student("First5", "Last5");

        StudentsGroup group1 = new StudentsGroup(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);

        group1.renameStarosta(student1, "New", "Starosta");
        group1.removeStudent(student5);
        group1.renameStudent(student2, "New2", "Last2");
        group1.newStarosta(student3);
        group1.newGroupTask("Task1");
        group1.newGroupTask("Task2");
        group1.taskCompleted("Task1", student4);
    }
}
