package lt.vu.mif.mape.tms.facade.impl.comment;

import lt.vu.mif.mape.tms.facade.CommentFacade;
import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.model.user.User;
import lt.vu.mif.mape.tms.rep.CommentRep;
import lt.vu.mif.mape.tms.rep.TaskRep;
import lt.vu.mif.mape.tms.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class RealCommentFacade implements CommentFacade {

    private TMSFactory tmsFactory;
    private CommentRep commentRep;
    private TaskRep taskRep;
    private UserRep userRep;

    @Autowired
    public RealCommentFacade(TMSFactory tmsFactory, CommentRep commentRep, TaskRep taskRep, UserRep userRep) {
        this.tmsFactory = tmsFactory;
        this.commentRep = commentRep;
        this.taskRep = taskRep;
        this.userRep = userRep;
    }

    @Override
    public Comment createComment(Long taskId, Long creatorId, String text) {
        Task task = taskRep.find(taskId);
        User author = userRep.find(creatorId);
        Comment comment = tmsFactory.createComment(task, author, text);
        commentRep.save(comment);
        return comment;
    }

    @Override
    public Comment updateComment(Long commentId, String text) {
        Comment comment = commentRep.find(commentId);
        comment.setText(text);
        return commentRep.update(comment);
    }

    @Override
    public void deleteComment(Long commentId) {
        Comment comment = commentRep.find(commentId);
        commentRep.delete(comment);
    }

    @Override
    public List<Comment> findTaskComments(Long taskId) {
        Task task = taskRep.find(taskId);
        return commentRep.findTaskComments(task);
    }
}
