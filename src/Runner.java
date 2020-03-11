public class Runner {

    public static void main( String[] args){
        School BHS = new School("Berkeley High School");

        Section compSci = new Section("Computer Science");
        Section Math = new Section("Math");
        Section English = new Section("English");

        BHS.addSection(compSci);
        BHS.addSection(Math);
        BHS.addSection(English);

        System.out.println(BHS.toString());

        Teacher Albinson = new Teacher("Albinson", "Computer Science");
        Albinson.addSection(compSci);
        compSci.setTeacher(Albinson);

        System.out.println(Albinson.toString());

        Teacher Albrecht = new Teacher("Albrecht", "Math");
        Albrecht.addSection(Math);
        Math.setTeacher(Albrecht);

        System.out.println(Albrecht.toString());

        Teacher Kaku = new Teacher("Kaku", "English");
        Kaku.addSection(English);
        English.setTeacher(Kaku);

        System.out.println(Kaku.toString());

        Math.setTeacher(Albrecht);
        compSci.setTeacher(Albinson);
        English.setTeacher(Kaku);

        // student Noam

        Student Noam = new Student("Noam", 11);
        Noam.addSections(compSci);
        compSci.addStudent(Noam);
        Noam.addSections(Math);
        Math.addStudent(Noam);
        Noam.addSections(English);
        English.addStudent(Noam);

        System.out.println(Noam.toString());

        // student Logan

        Student Logan = new Student("Logan", 11);
        Logan.addSections(compSci);
        compSci.addStudent(Logan);
        Logan.addSections(Math);
        Math.addStudent(Logan);

        System.out.println(Logan.toString());

        // student Alberto

        Student Alberto = new Student("Alberto", 11);
        Alberto.addSections(Math);
        Math.addStudent(Alberto);

        System.out.println(Alberto.toString());

        // student Luca

        Student Luca = new Student("Luca", 11);
        Luca.addSections(Math);
        Math.addStudent(Luca);

        System.out.println(Luca.toString());

        // student Spencer

        Student Spencer = new Student("Spencer", 11);
        Spencer.addSections(English);
        English.addStudent(Spencer);

        System.out.println(Spencer.toString());

        // student Jakob

        Student Jakob = new Student("Jakob", 11);
        Jakob.addSections(English);
        English.addStudent(Jakob);

        System.out.println(Jakob.toString());

        System.out.println(Math.toString());

        System.out.println(compSci.toString());

        System.out.println(English.toString());
    }

}
