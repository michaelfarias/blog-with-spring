package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    @PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Michael Farias");
        post1.setData(LocalDate.now());
        post1.setTitulo("Michael Farias");
        post1.setTexto("Texto TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto Texto Texto TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto");

        Post post2 = new Post();
        post2.setAutor("Michael Farias");
        post2.setData(LocalDate.now());
        post2.setTitulo("Michael Farias");
        post2.setTexto("Texto TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto Texto Texto TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto");

        postList.add(post1);
        postList.add(post2);

        for(Post post : postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}


