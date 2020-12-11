package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/demo")
public class DemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }

    @Get(uri="/hello/{name}", produces = MediaType.TEXT_PLAIN)
    public String greet(String name) {
        return "Hello There Again " + name;
    }
}