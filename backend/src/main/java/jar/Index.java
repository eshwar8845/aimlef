package jar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.R;

@RestController
public class Index {

    @GetMapping("/")
    R f1() {

        return new R();

    }

    @PostMapping("/p")
    String f2() {
        return "aiml ef students";

    }
}
