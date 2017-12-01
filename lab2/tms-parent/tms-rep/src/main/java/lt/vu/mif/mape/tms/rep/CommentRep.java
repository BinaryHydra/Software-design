package lt.vu.mif.mape.tms.rep;

import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.task.Task;

import java.util.List;

public interface CommentRep {

    Long save(Comment comment);

    Comment find(Long id);

    void delete(Comment comment);

    Comment update(Comment comment);

    List<Comment> findTaskComments(Task task);
}
