package com.piyush.app.JobQuest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.app.JobQuest.Models.Post;
import com.piyush.app.JobQuest.Repo.PostRepo;

@CrossOrigin(origins = "*")
@RestController
public class NewApiController {
    
    @Autowired
    private PostRepo postRepo;
    

    @GetMapping(value = "/posts")
    public List<Post> getPosts(){
        return postRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String savePosts(@RequestBody Post post){
        postRepo.save(post);
        return "saved...";
    }

    @GetMapping("/postsByKeyword")
    public List<Post> searchUsers(@RequestParam(value = "keyword", required = false) String keyword) {
        if (keyword != null) {
            return postRepo.findUsersByName(keyword);
        }
        return postRepo.findAll();
    }

    @GetMapping(value = "/deleteAllPost")
    public String deletePosts(){
        postRepo.deleteAll();
        return "Delete done";
    }
}
