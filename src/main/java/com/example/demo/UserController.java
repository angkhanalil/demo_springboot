package com.example.demo;

import java.util.List;

import com.example.demo.dto.UserDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @GetMapping("/users")
    List<UserDTO> getUsers() throws Exception {
        RestTemplate rst = new RestTemplate();
        ResponseEntity<String> resp = rst.getForEntity("https://jsonplaceholder.typicode.com/users", String.class);
        ObjectMapper mapper = new ObjectMapper();
        List<UserDTO> list = mapper.readValue(resp.getBody(), new TypeReference<List<UserDTO>>() {

        });
        return list;
    }
}
