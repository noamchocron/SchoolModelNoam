import java.util.Arrays;

public class Section {
    private String name;
    private Teacher teacher;
    private Student[] students =  new Student[50];
    private int currentSize;

    public Section( String name){
        this.name = name;
        this.currentSize = currentSize;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }

    @Override
    public String toString(){
        return this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + listStudents();
    }

    public String listStudents() {
        String o = "";

        for(int i = 0; i<currentSize; i++) {
            o += students[i].getName() + ", ";
        }


        return o;
    }
}
