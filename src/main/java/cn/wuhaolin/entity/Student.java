package cn.wuhaolin.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column
    public Integer age;

    @ManyToMany
    public Set<Student> friends;

    @ManyToOne
    public Academy academy;

    @ManyToMany(mappedBy = "students")
    public Set<Classroom> classrooms;

}
