package cn.wuhaolin.repository;

import cn.wuhaolin.entity.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> ageGreaterThan(@Param("age") int age, Pageable pageable);

    List<Student> nameContaining(@Param("keyword") String keyword);

    Student nameEquals(@Param("name") String name);
}
