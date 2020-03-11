public class Person {
    public String name;
    private int id;
    private static int nextId = 0;


    public Person(String name){
        this.name  = name;
        this.id = nextId;
        nextId++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
