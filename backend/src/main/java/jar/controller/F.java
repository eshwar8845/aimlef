package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class F {

    @GetMapping("/fruits")

    Map<Object, Object> fruits() {
        Map<Object, Object> res = new HashMap<>();

        res.put("msg", " fruits api end point");
        res.put("status", 200);
        res.put("data", "🥭🫐🍏🍑🍍🍎");

        return res;
    }

}
