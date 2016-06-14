package cn.wuhaolin.entity.projection;

import cn.wuhaolin.entity.Student;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "NoAge", types = Student.class)
public interface NoAgeStudent {
    String getName();
}
