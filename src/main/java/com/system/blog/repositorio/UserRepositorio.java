package com.system.blog.repositorio;

import com.system.blog.entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorio extends JpaRepository<User, Long>{
    public User findByUsernameAndPassword(String username, String password);

}
