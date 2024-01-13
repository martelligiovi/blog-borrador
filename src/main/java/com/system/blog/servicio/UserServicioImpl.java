package com.system.blog.servicio;

import com.system.blog.DTO.UserDTO;
import com.system.blog.repositorio.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class UserServicioImpl implements UserServicio{

    @Autowired
    private UserRepositorio userRepositorio;

    public UserDTO crearUser(UserDTO userDTO) {


        return null;
    }

    public UserDTO obtenerUserPorId(Long id) {
        return null;
    }

    public void eliminarUser(Long id) {

    }

    public List<UserDTO> obtenerUsers() {
        return null;
    }

    @Override
    public boolean login(String username, String password) {
        return !Objects.isNull(userRepositorio.findByUsernameAndPassword(username, password));
    }

}
