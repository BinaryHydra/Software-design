package lt.vu.mif.mape.tms.facade;

import lt.vu.mif.mape.tms.model.task.Task;

import java.math.BigDecimal;
import java.util.List;

public interface TaskFacade {

    Task createTask(String taskName, String description, Long creatorId, Long assigneeId);

    void assignTask(Long taskId, Long assigneeId);

    void deleteTask(Long taskId);

    Task updateTask(Long taskId, String taskName, String taskDescription, Long assigneeId, Long editorId);

    List<Task> findTasks(Long userId);

    BigDecimal getVelocity();
}
