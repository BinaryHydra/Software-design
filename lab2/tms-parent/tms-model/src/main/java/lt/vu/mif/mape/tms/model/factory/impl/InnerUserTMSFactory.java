package lt.vu.mif.mape.tms.model.factory.impl;

import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.comment.impl.InnerComment;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.task.impl.InnerTask;
import lt.vu.mif.mape.tms.model.user.User;
import lt.vu.mif.mape.tms.model.user.impl.InnerUser;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InnerUserTMSFactory implements TMSFactory {

    @Override
    public User createUser(String userName, String password) {
        InnerUser user = new InnerUser();
        user.setName(userName);
        user.setPassword(password);
        return user;
    }

    @Override
    public Task createTask(String name, String description, User author) {
        InnerTask task = new InnerTask();
        task.setName(name);
        task.setDescription(description);
        task.setCreator(author);
        return task;
    }

    @Override
    public Comment createComment(Task task, User author, String commentText) {
        InnerComment innerComment = new InnerComment();
        innerComment.setCreator(author);
        innerComment.setTask(task);
        innerComment.setText(commentText);
        innerComment.setCreationTime(LocalDateTime.now());
        return innerComment;
    }
}
