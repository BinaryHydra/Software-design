package lt.vu.mif.mape.tms.model.factory.impl;

import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.task.impl.ClientTask;
import lt.vu.mif.mape.tms.model.user.User;

public class ClientTMSFactory implements TMSFactory{

    @Override
    public Task createTask(String name, String description, User author) {
        ClientTask task = new ClientTask();
        task.setName(name);
        task.setDescription(description);
        task.setCreator(author);
    }

    @Override
    public User createUser(String userName, String password) {
        return null;
    }

    @Override
    public Comment createComment(Task task, User author, String commentText) {
        return null;
    }
}
