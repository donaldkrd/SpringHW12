package patterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import patterns.model.ITask;
import patterns.service.TaskServiceFacade;

import java.util.List;

@RestController
public class TaskControllerImpl implements TaskController {
    private TaskServiceFacade facade;
    @Autowired
    public TaskControllerImpl(TaskServiceFacade facade) {
        this.facade = facade;
    }
    @Override
    public ResponseEntity<String> createTask(long id, String urgency) {
        return ResponseEntity.ok(facade.createTask(id, urgency));
    }
    @Override
    public ResponseEntity<List<ITask>> getAllUrgencyTasks() {
        return ResponseEntity.ok(facade.getUrgencyList());
    }
    @Override
    public ResponseEntity<List<ITask>> getAllNotUrgencyTasks() {
        return ResponseEntity.ok(facade.getNotUrgencyList());
    }
}
