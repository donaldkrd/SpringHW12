package patterns.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patterns.model.ITask;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public interface TaskController {
    @PostMapping("/{id}/{urgency}")
    public ResponseEntity<String> createTask(@PathVariable(name = "id") long id, @PathVariable(name = "urgency") String urgency);
    @GetMapping("/urgency")
    public ResponseEntity<List<ITask>> getAllUrgencyTasks();
    @GetMapping("/noturgency")
    public ResponseEntity<List<ITask>> getAllNotUrgencyTasks();

}
