package lt.vu.mif.mape.tms.model.factory;

import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.user.User;

public interface TMSFactory {

    Task createTask(String name, String description, User author);

    User createUser(String userName, String password);

    Comment createComment(Task task, User author, String commentText);

}
