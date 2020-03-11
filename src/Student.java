public class Student extends Person {
    private Section[] Section = new Section [10];
    private int grade;
    private int SectionCount = 0;

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public Section[] getSection() {
        return Section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        this.grade = g;
    }

    public void addSections(Section s){
        this.Section[SectionCount] = s;
        SectionCount++;
    }

    public String toString(){
        return this.name +" is in "+ this.grade + " grade, and is enrolled in the following sections: "+ listSections();
    }

    public String listSections() {
        String o = "";

        for(int i = 0; i<SectionCount; i++) {
            o += Section[i].getName() + ", ";
        }


        return o;
    }
}
