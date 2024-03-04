package patterns.service;

import org.springframework.stereotype.Service;
import patterns.model.ITask;

@Service
public class TaskUrgency {
    public static boolean isUrgency(ITask task) {
        if (task.getUrgency().equals("yes")) {
            return true;
        }
        return false;
    }
}
