package lt.vu.mif.mape.model.task.impl;

import lt.vu.mif.mape.model.task.Task;
import lt.vu.mif.mape.model.user.User;

public class SimpleTask implements Task {

    private String name;
    private String description;
    private User creator;
    private User assignee;

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
    //endregion

}
