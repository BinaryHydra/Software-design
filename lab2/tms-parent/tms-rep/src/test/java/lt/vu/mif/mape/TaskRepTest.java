package lt.vu.mif.mape;

import lt.vu.mif.mape.tms.rep.config.RepConfig;
import lt.vu.mif.mape.model.task.Task;
import lt.vu.mif.mape.model.task.TaskFactory;
import lt.vu.mif.mape.rep.task.TaskRep;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(classes = {RepConfig.class})
public class TaskRepTest {

    @Autowired
    private TaskRep taskRep;

    @Autowired
    private TaskFactory taskFactory;

    private Task task1;

    @Before
    public void setUp{
        assertNotNull(taskFactory);
        task1 = taskFactory.createTask("test task name", "test task description");
    }

    @Test
    public void saveFindTest(){
        Long taskId = taskRep.save(task1);
        assertNotNull(taskId);
        Task taskFound = taskRep.find(taskId);
        assertNotNull(taskFound);
        assertEquals(taskFound.getName(), task1.getName());
        assertEquals(taskFound.getDescription(), task1.getDescription());

    }





}
