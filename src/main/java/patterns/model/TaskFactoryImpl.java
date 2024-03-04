package patterns.model;

public class TaskFactoryImpl implements TaskFactory {
    @Override
    public ITask createTask(long id) {
        Task.TaskBuilder builder = new Task.TaskBuilder();
        builder.id(id).title("title_" + id);
        return builder.build();
    }
}
