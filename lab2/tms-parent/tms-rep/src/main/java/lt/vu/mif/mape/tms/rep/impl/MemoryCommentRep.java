package lt.vu.mif.mape.tms.rep.impl;

import lt.vu.mif.mape.tms.model.comment.Comment;
import lt.vu.mif.mape.tms.model.task.Task;
import lt.vu.mif.mape.tms.rep.CommentRep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Repository
public class MemoryCommentRep implements CommentRep {

    private HashMap<Long, Comment> commentMap = new HashMap<>();
    private Long id = 0L;

    @Override
    public Long save(Comment comment) {
        commentMap.put(++id, comment);
        comment.setId(id);
        return id;
    }

    @Override
    public Comment find(Long id) {
        return commentMap.get(id);
    }

    @Override
    public void delete(Comment comment) {
        commentMap.remove(comment.getId());
    }

    @Override
    public Comment update(Comment comment) {
        return commentMap.put(comment.getId(), comment);
    }

    @Override
    public List<Comment> findTaskComments(Task task) {
        return commentMap.entrySet().stream().map(Map.Entry::getValue)
                .filter(comment -> comment.getTask().getId().equals(task.getId()))
                .collect(Collectors.toList());
    }
}
