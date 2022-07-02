package net.javaguides.springboot.controller;

// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.ProjectStatus;
import net.javaguides.springboot.repository.ProjectStatusRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProjectStatusController {

    @Autowired
    private ProjectStatusRepository projectStatusRepository;

    // get all employees
    @GetMapping("/projects")
    public List<ProjectStatus> getAllEmployees() {
        return projectStatusRepository.findAll();
    }
}
