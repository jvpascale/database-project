package EntitiesDTOs;

public class EmployeeDTO {

    private String role;
    private String name;
    private Float salary;
    private Integer cpf;

    public EmployeeDTO(){}

    public EmployeeDTO(String role, Integer cpf, Float salary, String name) {
        this.role = role;
        this.cpf = cpf;
        this.salary = salary;
        this.name = name;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
