package com.famba.wooly;

import com.famba.wooly.domain.Student;
import com.famba.wooly.factory.StudentFactory;
import com.famba.wooly.service.student.StudentService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/wooly")
public class RestApp {

    @Autowired
    private StudentService studentService;

    //http://localhost:8080/wooly/addStudent/01/mawande/21333/matanzima/email@gmail.com/mycorrect
    @GetMapping(path = "/addStudent/{id}/{name}/{surname}/{stud_no}/{password}/{email}")
    public @ResponseBody String addStudent(@PathVariable String id,@PathVariable String name,
                                           @PathVariable String surname, @PathVariable String stud_no,
                                           @PathVariable String password, @PathVariable String email)
    {
        Student student = StudentFactory.buildStudent(id,name,surname, stud_no, password, email);
        studentService.save(student);
        return new Gson().toJson(student);
    }

    //http://localhost:8080/wooly/readdStudent/01
    @GetMapping(path = "readStudent/{id}")
    public @ResponseBody String readStudent(@PathVariable String id)
    {
        Student student = studentService.findbyId(id);
        return new Gson().toJson(student);
    }

    //http://localhost:8080/wooly/updateStudent/01/mawande/21333/matanzima/email@gmail.com/mycorrect
    @GetMapping(path = "/updateStudent/{id}/{name}/{surname}/{stud_no}/{email}/{password}")
    public @ResponseBody String updateStudent(@PathVariable String id, @PathVariable String name,
                                              @PathVariable String surname, @PathVariable String stud_no,
                                              @PathVariable String email, @PathVariable String password)
    {
        Student student = studentService.findbyId(id);

        if(student == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Student insertStudent = StudentFactory.buildStudent(id, name, surname, stud_no, email, password);
        studentService.update(insertStudent);
        return new Gson().toJson(insertStudent);
    }


    //http://localhost:8080/wooly/deleteStudent/01
    @GetMapping(path = "deleteStudent/{id}")
    public @ResponseBody void deleteStudent(@PathVariable String id) {
        Student student = studentService.findbyId(id);
        if (student == null) {
            System.out.println("Record does not exist");
        } else {
            studentService.delete(student);
            System.out.println("Record deleted");
        }
    }


//    @RequestMapping(path="getStudents/", method=RequestMethod.GET)
//    public @ResponseBody List<Student> getStudent() {
//        Student student = studentService.
//        List<Student> stud = new ArrayList<Student>();
//        return stud;
//    }


}
