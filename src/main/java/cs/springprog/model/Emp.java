package cs.springprog.model;

public class Emp {
    private int id;
    private String name;
    private String city;

    Emp(){
        System.out.println("hi object created......");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
