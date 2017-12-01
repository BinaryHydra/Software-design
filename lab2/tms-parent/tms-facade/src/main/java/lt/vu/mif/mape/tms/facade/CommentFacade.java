package lt.vu.mif.mape.tms.facade;

import lt.vu.mif.mape.tms.model.comment.Comment;

import java.util.List;

public interface CommentFacade {

    Comment createComment(Long taskId, Long creatorId, String text);

    Comment updateComment(Long commentId, String text);

    void deleteComment(Long commentId);

    List<Comment> findTaskComments(Long taskId);
}
