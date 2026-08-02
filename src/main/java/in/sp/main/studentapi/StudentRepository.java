package in.sp.main.studentapi;

import org.springframework.data.jpa.repository.JpaRepository;
//@Repository comes when class implemented here but we use interface so no need of this annotation
//because internally implementation done by jpaRepository(which gives  save(student),findAll(),findById(id),and deleteById(id)
//that's why we don't need to write any SQL query 

public interface StudentRepository extends JpaRepository<Student,Long>{
}

