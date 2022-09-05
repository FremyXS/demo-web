package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public ArrayList<Post> listAllPost(){
        ArrayList<Post> list = new ArrayList<Post>();
        list.add(new Post("CHJF", 10));
        list.add(new Post("OJOJKJLFSNIF", 20));
        list.add(new Post("PUTIN", 550));
        return list;
    }
}
