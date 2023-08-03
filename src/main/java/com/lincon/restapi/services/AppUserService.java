package com.lincon.restapi.services;

import com.lincon.restapi.domain.AppUser;
import com.lincon.restapi.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository repository;
    public AppUser findById(Integer id) {
        Optional<AppUser> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
