package cn.wuhaolin.entity;

import javax.persistence.*;

@Table
@Entity
public class Academy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;
}
