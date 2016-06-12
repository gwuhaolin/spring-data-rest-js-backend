package cn.wuhaolin.repository;

import cn.wuhaolin.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClassroomRepo extends JpaRepository<Classroom, Long> {
}
