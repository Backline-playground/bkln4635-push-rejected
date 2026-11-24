package com.backline.fixture;

import org.apache.commons.text.StringSubstitutor;

import java.util.Map;

public class Greeter {
    public static String greet(String name) {
        return new StringSubstitutor(Map.of("name", name)).replace("Hello, ${name}!");
    }
}
