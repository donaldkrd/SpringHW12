package patterns.service;

import org.springframework.stereotype.Service;
import patterns.model.ITask;
import patterns.model.Task;

@Service
public class TaskStatusService {
    public static boolean checkStatus(ITask task) {
        if (task.getStatus() == null) {
            task.setStatus(Task.Status.ToDo);
        }
        return true;
    }
}
