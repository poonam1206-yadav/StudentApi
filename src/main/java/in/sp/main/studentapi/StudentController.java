package in.sp.main.studentapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController {
	
@Autowired
private StudentRepository repo;
	
	@GetMapping
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return repo.save(student);
		
	}
		@DeleteMapping("/{id}")
		public String deleteStudent(@PathVariable Long id) {
			repo.deleteById(id);
		return "student deleted with id :" +id;
}
		@PutMapping("/{id}")
		public Student updateStudent(@PathVariable Long id,@RequestBody Student updatedStudent) {
			updatedStudent.setId(id);
				return repo.save(updatedStudent);	
				}
			}

	
