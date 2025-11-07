package Entities;

public class Dependent {
    private String name;
    private Integer age;
    private String kinship;

    public Dependent(){}

    public Dependent(String name, Integer age, String kinship) {
        this.name = name;
        this.age = age;
        this.kinship = kinship;
    }

    public String getKinship() {
        return kinship;
    }

    public void setKinship(String kinship) {
        this.kinship = kinship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
