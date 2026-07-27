package in.sp.main.studentapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	public List<Student> students= new ArrayList<>();
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return students;
	}
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		students.add(student);
	
		return "Student added :"+student.getName()+"-"+student.getCourse();
	}

		@DeleteMapping("/deleteStudent/{name}")
		public String deleteStudent(@PathVariable String name) {
		return "name " + name + " delete ho gaya";
}
		@PutMapping("/updateStudent/{name}")

		public String updateStudent(@PathVariable String name,@RequestBody Student updatedStudent) {
			for(Student s:students) {
				if(s.getName().equals(name)) {
					s.setCourse(updatedStudent.getCourse());
					return "student updated :"+ name+ "->"+updatedStudent.getCourse();
				}
			}
				return "studnet not found "+name;
					
				}
			}

	
