package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>();
    public PostService(){
        posts.add(new Post((long)0,"CHJF", new Date(10)));
        posts.add(new Post((long)1,"OJOJKJLFSNIF", new Date(20)));
        posts.add(new Post((long)2,"PUTIN", new Date(2022)));
    }
    public ArrayList<Post> listAllPost(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post((long)(posts.size()), text, new Date()));
    }
}
