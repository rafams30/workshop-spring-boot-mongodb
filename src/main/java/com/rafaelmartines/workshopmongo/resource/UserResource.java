package com.rafaelmartines.workshopmongo.resource;

import com.rafaelmartines.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User rafael = new User("1", "Rafael Martines", "rafael@gmail.com");
        User tay = new User("2", "Taynara Maria", "tay@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(rafael, tay));
        return ResponseEntity.ok().body(list);
    }
}
