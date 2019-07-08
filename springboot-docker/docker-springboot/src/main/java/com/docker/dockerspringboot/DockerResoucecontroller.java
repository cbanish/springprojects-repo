package com.docker.dockerspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

 
@RestController
@RequestMapping(value= "/rest/docker/hello")
public class DockerResoucecontroller {

    /**
     * Method to show mesasage from docker.
     * @param emp
     * @return
     */
    @GetMapping()
    public String hello() {
        
        return "Hello from Spring boot Docker project";
    }

}