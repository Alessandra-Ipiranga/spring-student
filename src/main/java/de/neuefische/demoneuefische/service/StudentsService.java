package de.neuefische.demoneuefische.service;

import de.neuefische.demoneuefische.modell.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("default")
public class StudentsService implements OtherStudentsService{
    public List<Student> getStudents() {
        return List.of(
                new Student("Maria"),
                new Student("José"),
                new Student("Alfonso"));
    }
}