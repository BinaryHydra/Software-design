package lt.vu.mif.mape.tms.model.task;

import lt.vu.mif.mape.tms.model.user.User;

import java.time.LocalDateTime;

public interface Task {

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    User getCreator();

    void setCreator(User creator);

    User getAssignee();

    void setAssignee(User assignee);

    Long getId();

    void setId(Long id);

    LocalDateTime getStartTime();

    void setStartTime(LocalDateTime startTime);

    LocalDateTime getEndTime();

    void setEndTime(LocalDateTime endTime);

    Long getPoints();

    void setPoints(Long points);
}
