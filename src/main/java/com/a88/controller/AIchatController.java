package com.a88.controller;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AIchatController {

    @Resource
    private OpenAiChatClient openAiChatClient;

    @RequestMapping("/ai/chat")
    public String chat(@RequestParam("msg") String msg) {
        String call = openAiChatClient.call(msg);
        return call;
    }
}
