package lt.vu.mif.mape.tms.rep;

import lt.vu.mif.mape.tms.model.task.Task;

import java.util.List;

public interface TaskRep {

    Long save(Task task);

    Task find(Long id);

    void delete(Task task);

    Task update(Task task);

    List<Task> findAllTasks();
}
