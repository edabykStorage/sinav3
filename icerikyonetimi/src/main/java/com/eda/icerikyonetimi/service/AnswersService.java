package com.eda.icerikyonetimi.service;

import com.eda.icerikyonetimi.entity.Answers;
import com.eda.icerikyonetimi.entity.Lesson;
import com.eda.icerikyonetimi.repository.AnswersRepository;
import com.eda.icerikyonetimi.repository.LessonRepository;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;
import com.eda.icerikyonetimi.utility.MyFactoryService;

public class AnswersService  extends MyFactoryService<MyFactoryRepository, Answers, Long> {

    public AnswersService() {
        super(new AnswersRepository());

    }

}