package lt.vu.mif.mape.rep.task;

import lt.vu.mif.mape.model.task.Task;

public interface TaskRep {

    Long save(Task task);

    Task find(Long id);
}
