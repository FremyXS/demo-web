package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>();
    public PostService(){
        posts.add(new Post("CHJF", new Date(10), 10));
        posts.add(new Post("OJOJKJLFSNIF", new Date(20), 20));
        posts.add(new Post("PUTIN", new Date(2022), 550));
    }
    public ArrayList<Post> listAllPost(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, new Date(), 0));
    }
}
