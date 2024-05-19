package me.jiwon.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.jiwon.springbootdeveloper.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {
    private final BlogService blogService;

    @GetMapping("/api/articles")
}
