package cn.wuhaolin.repository;

import cn.wuhaolin.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Long> {
}
