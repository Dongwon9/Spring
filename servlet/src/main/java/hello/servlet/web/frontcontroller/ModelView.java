package hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class ModelView {
    /**
     * 이것은 뷰의 실제 경로가 아니라 '논리 경로'를 저장한다.
     * 실제경로는 프론트컨트롤러의 viewResolver()를 통해 얻는다.
     */
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }
}
