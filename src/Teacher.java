public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount = 0;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section s) {
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        return "The teacher named " + this.name + " teaches the following sections: " + listSections();
    }

    public String listSections() {
        String o = "";

        for(int i = 0; i<sectionCount; i++) {
            o += sections[i].getName() + ", ";
        }


        return o;
    }

}
