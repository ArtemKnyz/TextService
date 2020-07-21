package messages.text.controller;

import messages.text.exceptions.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("text")
public class MessageController {
    public List<String> messages = new ArrayList<String>() {{
        add("Тихо струится река серебристая");
        add("В царстве вечернем зеленой весны.");
        add("Солнце садится за горы лесистые.");
        add("Рог золотой выплывает луны.");
    }};


    @GetMapping
    public String list() {
        list().length();
        return messages.stream().sorted().findFirst().orElseThrow(NotFoundException::new);
    }

    /*@GetMapping("{id}")
    public List<String> getMessageById(@PathVariable String id) {
        return getMessage(id);
    }

    private List<String> getMessage(@PathVariable String id) {
        return messages.stream()
                .filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }*/
}

