package patterns.service;

import patterns.model.ITask;
import java.util.List;

public interface TaskServiceFacade {
    String createTask(Long id, String urgency);
    List<ITask> getUrgencyList();
    List<ITask> getNotUrgencyList();

}
