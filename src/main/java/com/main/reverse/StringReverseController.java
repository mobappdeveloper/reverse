package com.main.reverse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringReverseController {

    @Value("${MY_MESSAGE}")
    private String myMessage;

    @GetMapping(path = "/reverse/{word}")
    public String reverse(@PathVariable String word) {
        return new StringBuilder(word).reverse().toString();
    }

    @GetMapping(path = "/display")
    public String displayMessage() {
        return myMessage;
    }
}
