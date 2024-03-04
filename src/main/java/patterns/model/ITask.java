package patterns.model;

public interface ITask {
    public Long getId();
    public String getTitle();
    public String getUrgency();
    public Task.Status getStatus();
    public void setStatus(Task.Status status);
    public void setUrgency(String urgency);
}
