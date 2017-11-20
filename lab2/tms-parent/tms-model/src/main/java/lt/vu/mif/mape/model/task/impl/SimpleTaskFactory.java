package lt.vu.mif.mape.model.task.impl;

import lt.vu.mif.mape.model.task.Task;
import lt.vu.mif.mape.model.task.TaskFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleTaskFactory implements TaskFactory{

    public Task createTask(String name, String description) {
        SimpleTask task = new SimpleTask();
        task.setDescription(description);
        task.setName(name);
        return task;
    }
}
