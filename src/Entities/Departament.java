package Entities;

public class Departament {
    private Integer number;
    private String localization;
    private String name;

    public Departament(Integer number, String name, String localization) {
        this.number = number;
        this.name = name;
        this.localization = localization;
    }

    public Departament(){}

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }
}
