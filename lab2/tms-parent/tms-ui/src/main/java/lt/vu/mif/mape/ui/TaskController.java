package lt.vu.mif.mape.ui;


import lt.vu.mif.mape.tms.facade.TaskFacade;
import lt.vu.mif.mape.tms.model.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final TaskFacade taskFacade;

    @Autowired
    public TaskController(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
    }

    @RequestMapping("/test")
    public String mainPage() {
        return "test";
    }

    @RequestMapping("tasks/create")
    public Task createTask(@RequestParam(name = "name") String taskName,
                           @RequestParam(name = "description") String taskDescription,
                           @RequestParam (name="creatorId") Long creatorId,
                           @RequestParam (name="creatorId", required = false) Long assigneeId){
           return taskFacade.createTask(taskName, taskDescription, creatorId, assigneeId);
    }

    @RequestMapping("/tasks/all")
    public List<Task> listTasks(@RequestParam(name = "userId") Long userId){
        return taskFacade.findTasks(userId);
    }




}
