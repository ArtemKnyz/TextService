package messages.text.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("text")
public class MessageController {
    public List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
        add(new HashMap<String, String>() {{
            put("id", "1");
            put("text", "Тихо струится река серебристая");
        }});
        add(new HashMap<String, String>() {{
            put("id", "2");
            put("text", "В царстве вечернем зеленой весны.");
        }});
        add(new HashMap<String, String>() {{
            put("id", "3");
            put("text", "Солнце садится за горы лесистые.");
        }});
        add(new HashMap<String, String>() {{
            put("id", "4");
            put("text", "Рог золотой выплывает луны.");
        }});
    }};


    @GetMapping
    public List<Map<String, String>> list() {
        return messages;
    }

}
