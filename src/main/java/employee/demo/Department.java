package employee.demo;


import javax.naming.Name;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String Company;
    @NotNull
    private String Name;

    public Department() {
    }

    public Department(@NotNull String company, @NotNull String name) {
        Company = company;
        Name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

