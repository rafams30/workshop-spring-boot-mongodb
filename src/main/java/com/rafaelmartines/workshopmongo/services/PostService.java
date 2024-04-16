package com.rafaelmartines.workshopmongo.services;

import com.rafaelmartines.workshopmongo.domain.Post;
import com.rafaelmartines.workshopmongo.domain.User;
import com.rafaelmartines.workshopmongo.dto.UserDTO;
import com.rafaelmartines.workshopmongo.repository.PostRepository;
import com.rafaelmartines.workshopmongo.repository.UserRepository;
import com.rafaelmartines.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
