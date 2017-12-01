package lt.vu.mif.mape.tms.rep.impl;

import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.rep.TaskRep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Repository
public class MemoryTaskRep implements TaskRep {

    private Map<Long, Task> taskMap = new HashMap<>();
    private Long id = 0L;

    @Override
    public Long save(Task task) {
        taskMap.put(++id, task);
        task.setId(id);
        return id;
    }

    @Override
    public Task find(Long id) {
        return taskMap.get(id);
    }

    @Override
    public void delete(Task task) {
        if (task.getId() != null) {
            taskMap.remove(id);
        }
    }

    @Override
    public Task update(Task task) {
        assert (task.getId() != null);
        assert (taskMap.get(task.getId()) != null);
        taskMap.put(task.getId(),task);
        return task;
    }

    @Override
    public List<Task> findAllTasks() {
        return taskMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }
}
