package lt.vu.mif.mape.rep.task.imp;

import lt.vu.mif.mape.model.task.Task;
import lt.vu.mif.mape.rep.task.TaskRep;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MockTaskRep implements TaskRep {

    private Map<Long,Task> taskMap = new HashMap<Long, Task>();
    private Long id = 0L;

    public Long save(Task task) {
        taskMap.put(id++, task);
        return id;
    }

    public Task find(Long id) {
        return taskMap.get(id);
    }
}
