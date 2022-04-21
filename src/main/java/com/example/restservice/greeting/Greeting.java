package com.example.restservice.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeting {



    private Congratulation congratulation;

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        if (!(congratulation ==null)) {
            return content + " " + congratulation.happyBirthday();
        } else {
            return content;
        }
    }

    @Autowired
    public void setCongratulation(Congratulation congratulation) {
        this.congratulation = congratulation;
    }
}
