package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Math {

    @GetMapping("/math/{n}")
    Map<Object, Object> fib(@PathVariable int n) {
        Map<Object, Object> res = new HashMap<>();
        Object arr[] = new Object[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 3.14f;
        arr[3] = 2147483647;
        arr[4] = -2147483648;
        arr[5] = "🍎🍑🍏";
        arr[6] = 'A';
        res.put("name", "maths api");
        res.put("status", 200);
        res.put("number", n);
        res.put("github", "https://github.com/vikramdev772/aimlef");
        res.put("arr[]", arr);

        return res;

    }
}
