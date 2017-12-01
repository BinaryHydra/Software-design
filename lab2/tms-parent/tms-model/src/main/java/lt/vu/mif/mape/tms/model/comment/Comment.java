package lt.vu.mif.mape.tms.model.comment;

import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.user.User;

import java.time.LocalDateTime;

public interface Comment {

    Long getId() ;

    void setId(Long id);

    String getText();

    void setText(String text);

    Task getTask();

    void setTask(Task task);

    User getCreator();

    void setCreator(User creator);

    LocalDateTime getCreationTime();

    void setCreationTime(LocalDateTime creationTime);




}
