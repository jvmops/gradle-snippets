package com.jvmops.apps.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/")
public class DummyApi {

    @GetMapping
    public WelcomeMessage hello(@RequestParam("name") String name) {
        return new WelcomeMessage(name);
    }

    class WelcomeMessage {
        static final String messageTemplate = "Hello, %s!";

        final String message;
        final OffsetDateTime timestamp = OffsetDateTime.now();

        public WelcomeMessage(String name) {
            this.message = String.format(messageTemplate, name);
        }

        public String getMessage() {
            return message;
        }

        public OffsetDateTime getTimestamp() {
            return timestamp;
        }
    }
}
