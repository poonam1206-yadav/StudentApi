
	package in.sp.main.studentapi;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	@Service
	public class StudentService {
	    @Autowired
	    private StudentRepository repo;

	    public List<Student> getAllStudents() { return repo.findAll(); }
	    public Student addStudent(Student s) { return repo.save(s); }
	    public void deleteStudent(Long id) { repo.deleteById(id); }
	    public Student updateStudent(Long id, Student s) {
	        s.setId(id);
	        return repo.save(s);
	    }
	}
