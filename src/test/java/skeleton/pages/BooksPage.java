package skeleton.pages;

import com.google.common.collect.ImmutableMap;
import skeleton.PageData;

import java.util.Map;

public class BooksPage implements PageData {
    @Override
    public Map<String, String> getElementDescription() {
        return ImmutableMap.<String, String>builder()
                .put("Add Book", "add-book")
                .put("Title", "title")
                .put("ImagePath", "imagePath")
                .put("Author", "author")
                .put("ISBN", "ISBN")
                .put("Create", "input[type='submit'][value='Create']")
                .put("Update", "input[type='submit'][value='Update']")
                .put("Last Edit", ".action-item > .action-edit")
                .put("Last Delete", ".action-item > .action-delete")
                .build();
    }
}
