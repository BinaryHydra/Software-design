package lt.vu.mif.mape.tms.facade.impl.task;

import lt.vu.mif.mape.tms.bl.VelocityCalculator;
import lt.vu.mif.mape.tms.facade.TaskFacade;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.user.User;
import lt.vu.mif.mape.tms.rep.TaskRep;
import lt.vu.mif.mape.tms.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class RealTaskFacade implements TaskFacade {

    private TMSFactory tmsFactory;
    private UserRep userRep;
    private TaskRep taskRep;
    private VelocityCalculator velocityCalculator;

    @Autowired
    public RealTaskFacade(TMSFactory tmsFactory, UserRep userRep, TaskRep taskRep, VelocityCalculator velocityCalculator) {
        this.tmsFactory = tmsFactory;
        this.userRep = userRep;
        this.taskRep = taskRep;
        this.velocityCalculator = velocityCalculator;
    }

    @Override
    public Task createTask(String taskName, String description, Long creatorId, Long assigneeId) {
        User creator = userRep.find(creatorId);
        User assignee = userRep.find(assigneeId);
        Task task = tmsFactory.createTask(taskName, description, creator);
        task.setAssignee(assignee);
        taskRep.save(task);
        return task;
    }

    @Override
    public void assignTask(Long taskId, Long assigneeId) {
        Task task = taskRep.find(taskId);
        User assignee = userRep.find(assigneeId);
        task.setAssignee(assignee);
    }

    @Override
    public void deleteTask(Long taskId) {
        Task task = taskRep.find(taskId);
        if (task != null) {
            taskRep.delete(task);
        }
    }

    @Override
    public Task updateTask(Long taskId, String taskName, String taskDescription, Long assigneeId, Long editorId) {
        Task task = taskRep.find(taskId);
        task.setName(taskName);
        task.setDescription(taskDescription);
        User assignee = task.getAssignee();
        if (assignee != null && assigneeId.equals(assignee.getId())) {
            task.setAssignee(userRep.find(assigneeId));
        }
        return taskRep.update(task);
    }

    @Override
    public BigDecimal getVelocity(){
        return velocityCalculator.calculate(taskRep.findAllTasks(), LocalDateTime.now().minusWeeks(2L));
    }

    @Override
    public List<Task> findTasks(Long userId) {
        return taskRep.findAllTasks();
    }
}
