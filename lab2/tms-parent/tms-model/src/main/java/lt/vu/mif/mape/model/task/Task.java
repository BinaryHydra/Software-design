package lt.vu.mif.mape.model.task;

import lt.vu.mif.mape.model.user.User;

public interface Task {

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    User getCreator();

    void setCreator(User creator);

    User getAssignee();

    void setAssignee(User assignee);
}
