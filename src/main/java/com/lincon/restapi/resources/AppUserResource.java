package com.lincon.restapi.resources;

import com.lincon.restapi.domain.AppUser;
import com.lincon.restapi.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/{id}")
    public ResponseEntity<AppUser> update(@PathVariable Integer id, @RequestBody AppUser obj) {
        AppUser newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }
}
