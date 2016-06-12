package cn.wuhaolin.repository;

import cn.wuhaolin.entity.Academy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AcademyRepo extends JpaRepository<Academy, Long> {
}
