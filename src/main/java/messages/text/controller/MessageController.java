package messages.text.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@RestController
@RequestMapping("text")
public class MessageController {
    public List<String> messages = new ArrayList<String>() {{
        add("Тихо струится река серебристая");
        add("В царстве вечернем зеленой весны.");
        add("Солнце садится за горы лесистые.");
        add("Рог золотой выплывает луны.");
        /*add("Рог");
        add("Мох");
        add("Сон");*/
    }};


    @GetMapping
    public Map<Integer, String> list() {
        messages.sort((s1, s2) -> {
            if(s1.length() != s2.length())
                return s1.length() - s2.length();
            else
                return s1.compareTo(s2);
        });
       /* Multimap<String, String> map = ArrayListMultimap.create();
        map = (Multimap<String, String>) messages.stream()
                .collect(Collectors.toMap((p) -> p.length(), p->p));*/

        return new TreeMap<>(messages.stream()
                .collect(Collectors.toMap((p) -> p.length(), p->p)));
    }
}

