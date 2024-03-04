package patterns.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patterns.model.ITask;
import patterns.model.TaskFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
@Data
public class TaskServiceFacadeImpl implements TaskServiceFacade {
    @Autowired
    private TaskFactory taskFactory;
    private List<ITask> urgencyTaskList = new CopyOnWriteArrayList<>();
    private List<ITask> notUrgencyTaskList = new CopyOnWriteArrayList<>();
    @Override
    public String createTask(Long id, String urgency) {
        StringBuilder stringBuilder = new StringBuilder();
        ITask task = taskFactory.createTask(id);
        task.setUrgency(urgency);
        if (TaskStatusService.checkStatus(task)) {
            System.out.println("Status task with ID: " + task.getId() + ", is " + task.getStatus());
            if (TaskUrgency.isUrgency(task)) {
                urgencyTaskList.add(task);
                System.out.println("Task with ID " + task.getId() + ", save in urgencyTaskList");
                stringBuilder.append("urgencyTaskList");
            } else {
                notUrgencyTaskList.add(task);
                System.out.println("Task with ID " + task.getId() + ", save in notUrgencyTaskList");
                stringBuilder.append("notUrgencyTaskList");
            }
        }
        return "Task with ID: " + task.getId() + " save in " + stringBuilder;
    }
    @Override
    public List<ITask> getUrgencyList() {
        return urgencyTaskList;
    }
    @Override
    public List<ITask> getNotUrgencyList() {
        return notUrgencyTaskList;
    }
}
