package lt.vu.mif.mape.tms.facade.impl.task;

import lt.vu.mif.mape.tms.facade.TaskFacade;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.task.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class DemoTaskFacade implements TaskFacade {

    private Task task;
    private final TMSFactory tmsFactory;

    @Autowired
    public DemoTaskFacade(TMSFactory tmsFactory) {
        this.tmsFactory = tmsFactory;
    }

    @Override
    public Task createTask(String taskName, String description, Long creatorId, Long assigneeId) {
        task = tmsFactory.createTask(taskName, description, null);
        return task;
    }

    @Override
    public void assignTask(Long taskId, Long assigneeId) {
    }

    @Override
    public void deleteTask(Long taskId) {
    }

    @Override
    public Task updateTask(Long taskId, String taskName, String taskDescription, Long assigneeId, Long editorId) {
        return null;
    }

    @Override
    public List<Task> findTasks(Long userId) {
        return Collections.singletonList(task);
    }

    @Override
    public BigDecimal getVelocity() {
        return BigDecimal.valueOf(0.4);
    }
}