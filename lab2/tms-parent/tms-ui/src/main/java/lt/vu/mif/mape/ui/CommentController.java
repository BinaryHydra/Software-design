package lt.vu.mif.mape.ui;


import lt.vu.mif.mape.tms.facade.CommentFacade;
import lt.vu.mif.mape.tms.model.comment.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    private final CommentFacade commentFacade;

    @Autowired
    public CommentController(CommentFacade commentFacade) {
        this.commentFacade = commentFacade;
    }

    @RequestMapping("comments/create")
    public Comment createTask(@RequestParam(name = "text") String text,
                              @RequestParam (name="taskId") Long taskId,
                              @RequestParam (name="creatorId") Long creatorId){
           return commentFacade.createComment(taskId, creatorId, text);
    }
}
