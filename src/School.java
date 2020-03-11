import java.util.Arrays;

public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount = 0;


    public School(String name) {
        this.name = name;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "The school named " + this.name + " has " + this.sectionCount + " sections.";
    }
}
