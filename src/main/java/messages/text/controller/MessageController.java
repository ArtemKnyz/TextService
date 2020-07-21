package messages.text.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("text")
public class MessageController {
    @GetMapping
    public String list(){
        return "main";
    }

}
