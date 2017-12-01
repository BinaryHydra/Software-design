package lt.vu.mif.mape.tms.model.comment.impl;

import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.user.User;

import java.time.LocalDateTime;

public class InnerComment implements Comment {

    private Long id;
    private String text;
    private Task task;
    private User creator;
    private LocalDateTime creationTime;

    //region getters and setters
    @Override
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    //endregion
}
