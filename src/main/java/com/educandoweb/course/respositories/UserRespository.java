package com.educandoweb.course.respositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {

}
