package cn.wuhaolin.entity;

import javax.persistence.*;
import java.util.Set;

@Table
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @ManyToMany
    public Set<Student> students;

}
