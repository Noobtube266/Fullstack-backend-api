package com.Practice.Fullstackbackendapi.repo;

import com.Practice.Fullstackbackendapi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
}
