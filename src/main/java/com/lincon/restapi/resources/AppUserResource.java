package com.lincon.restapi.resources;

import com.lincon.restapi.domain.AppUser;
import com.lincon.restapi.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/appusers")
public class AppUserResource {
    @Autowired
    private AppUserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AppUser> findById(@PathVariable Integer id) {
        AppUser obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<AppUser>> findAll() {
        List<AppUser> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
