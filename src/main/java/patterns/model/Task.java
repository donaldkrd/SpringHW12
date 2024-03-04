package patterns.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements ITask {
    private Long id;
    private String title;
    private String urgency;
    private Status status;
    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
    }
    public enum Status {
        ToDo, InProgress, Done
    }
    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getUrgency() {
        return urgency;
    }
    public static class TaskBuilder {
        private final Task task = new Task();
        public TaskBuilder id(long id) {
            task.setId(id);
            return this;
        }
        public TaskBuilder title(String title) {
            task.setTitle(title);
            return this;
        }
        public Task build() {
            return task;
        }
    }
}
