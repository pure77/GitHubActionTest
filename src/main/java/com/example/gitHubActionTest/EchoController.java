package com.example.gitHubActionTest;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;



import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class EchoController {

    @GetMapping("/echo")
    public Map<String, Object> echoGet(@RequestParam(value = "message", required = false) String message) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("method", "GET");
        response.put("received_messageTest", message == null ? "no message provided" : message);
        return response;
    }

    @PostMapping("/echo")
    public Map<String, Object> echoPost(@RequestBody(required = false) Map<String, Object> requestData) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("method", "POST");
        response.put("received_data", requestData == null ? "no data provided" : requestData);
        return response;
    }
}
