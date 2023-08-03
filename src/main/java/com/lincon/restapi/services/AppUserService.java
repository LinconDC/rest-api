package com.lincon.restapi.services;

import com.lincon.restapi.domain.AppUser;
import com.lincon.restapi.repositories.AppUserRepository;
import com.lincon.restapi.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository repository;

    public AppUser findById(Integer id) {
        Optional<AppUser> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found ID:" + id + ", Type: " + AppUser.class.getName()));
    }

    public List<AppUser> findAll() {
        return repository.findAll();
    }

    public AppUser update(Integer id, AppUser obj) {
        AppUser newObj = findById(id);
        newObj.setName(obj.getName());
        newObj.setLogin(obj.getLogin());
        newObj.setPassword(obj.getPassword());
        return repository.save(newObj);
    }
}
