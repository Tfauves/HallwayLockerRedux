package com.careerdevs.openshit.repositories;

import com.careerdevs.openshit.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
