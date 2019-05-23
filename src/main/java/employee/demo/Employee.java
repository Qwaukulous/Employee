package employee.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

ublic class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String position;
    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Departments Departments; //come correct this later fool



}
