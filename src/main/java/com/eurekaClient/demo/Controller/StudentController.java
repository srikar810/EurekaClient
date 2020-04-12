package com.eurekaClient.demo.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaClient.demo.domain.Student;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();
	 
    static {
        schooDB = new HashMap<String, List<Student>>();
 
        List<Student> lst = new ArrayList<Student>();
        Student std = new Student("Sajal", "Class IV");
        lst.add(std);
        std = new Student("Lokesh", "Class V");
        lst.add(std);
 
        schooDB.put("abcschool", lst);
        System.out.println("hjdsfjshbdj");
 
        lst = new ArrayList<Student>();
        std = new Student("Kajal", "Class III");
        lst.add(std);
        std = new Student("Sukesh", "Class VI");
        lst.add(std);
 
        schooDB.put("xyzschool", lst);
 
    }
    
    @GetMapping("/{schoolName}")
    public List<Student> getStudents(@PathVariable String schoolName) {
        System.out.println("Getting Student details for " + schoolName);
 
        List<Student> studentList = schooDB.get(schoolName);
        if (studentList == null) {
            studentList = new ArrayList<Student>();
            Student std = new Student("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }
    
    @GetMapping("/")
    public String defaultString() {
    	return "Srikar";
    }
}
