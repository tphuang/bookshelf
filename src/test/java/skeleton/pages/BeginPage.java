package skeleton.pages;

import com.google.common.collect.ImmutableMap;
import skeleton.PageData;

import java.util.Map;

public class BeginPage implements PageData {
    @Override
    public Map<String, String> getElementDescription() {
        return ImmutableMap.<String, String>builder()
                .put("books", "books")
                .build();
    }
}
