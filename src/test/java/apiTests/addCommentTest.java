package apiTests;

import api.TrelloBO;
import org.testng.annotations.Test;

public class addCommentTest {
    TrelloBO trelloBO = new TrelloBO();

    @Test
    public void AddComment() {
        trelloBO.addComment();
    }
}
