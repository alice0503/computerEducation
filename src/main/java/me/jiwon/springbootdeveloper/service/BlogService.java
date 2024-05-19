package me.jiwon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jiwon.springbootdeveloper.domain.Article;
import me.jiwon.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service //빈으로 등록

public class BlogService {

    private final BlogRepository blogRepository;

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
