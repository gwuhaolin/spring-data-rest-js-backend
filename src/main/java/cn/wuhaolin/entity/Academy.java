package cn.wuhaolin.entity;

import javax.persistence.*;
import java.util.Set;

@Table
@Entity
public class Academy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @OneToMany
    public Set<Student> students;
}
