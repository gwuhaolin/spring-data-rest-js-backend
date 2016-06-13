package cn.wuhaolin.controller;

import cn.wuhaolin.entity.Student;
import cn.wuhaolin.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestCtrl {

    @RequestMapping("returnString")
    @ResponseBody
    public String returnString() {
        return "string";
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hi";
    }

    @ResponseBody
    @RequestMapping("errorWithJSON")
    public void errorWithJSON() {
        throw new RuntimeException("for errorWithJSON test");
    }

    @Autowired
    StudentRepo studentRepo;

    @ResponseBody
    @RequestMapping("postForm")
    public Student postForm(@RequestParam String name, @RequestParam Integer age) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        studentRepo.save(student);
        return student;
    }
}
