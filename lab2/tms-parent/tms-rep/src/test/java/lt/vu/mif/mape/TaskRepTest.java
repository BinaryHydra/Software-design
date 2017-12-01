package lt.vu.mif.mape;

import lt.vu.mif.mape.tms.model.config.ModelConfig;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.rep.config.RepConfig;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.rep.TaskRep;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ModelConfig.class, RepConfig.class })
@Rollback
public class TaskRepTest {

    @Autowired
    private TaskRep taskRep;

    @Autowired
    private TMSFactory taskFactory;

    private Task task1;

    @Before
    public void setUp(){
        assertNotNull(taskFactory);
        task1 = taskFactory.createTask("test task name", "test task description", null);
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
