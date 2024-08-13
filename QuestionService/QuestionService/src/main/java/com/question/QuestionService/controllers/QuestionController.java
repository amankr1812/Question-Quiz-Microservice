package com.question.QuestionService.controllers;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //create
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    //getall
    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    // get one
    @GetMapping("/{questionId}")
    public Question getOne(@PathVariable Long questionId){
        return questionService.getOne(questionId);
    }

    // get all question of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfList(@PathVariable Long quizId){
        return questionService.getQuestionOfQuiz(quizId);
    }
}
