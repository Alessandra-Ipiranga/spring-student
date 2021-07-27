package de.neuefische.demoneuefische.controller;

import de.neuefische.demoneuefische.modell.Student;

import de.neuefische.demoneuefische.service.OtherStudentsService;
import de.neuefische.demoneuefische.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    private StudentsService studentsService;

    /*@Autowired
    public StudentController(@Qualifier("other") StudentsService studentsService){
        this.studentsService = studentsService;
    }*/

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentsService.getStudents();
    }

    @GetMapping("/students")
    public List<Student> getStudentsByPath(@RequestParam(name="Maria") String name) {
        return null;
    }

    @PutMapping("/Students")
    public List<Student> outStudentsByPath(@PathVariable String name, @RequestBody String nameStudent) {
        return null;
    }

    @GetMapping("/students/{}")
    public List<Student> getStudentsByRequestParameter() {
        return null;
    }

    /*public List<Student> getName() {
        Student student1 = new Student("Maria");
        Student student2 = new Student("José");
        Student student3 = new Student("Alphonso");
        List <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }*/
}
