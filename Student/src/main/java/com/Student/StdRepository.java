package com.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StdRepository extends JpaRepository<Student, Integer> {

}


//save()
//saveAll()
//findAll()
//delete()
//deleteById()