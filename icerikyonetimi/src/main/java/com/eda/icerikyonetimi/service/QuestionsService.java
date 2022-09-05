package com.eda.icerikyonetimi.service;

import com.eda.icerikyonetimi.entity.Questions;
import com.eda.icerikyonetimi.repository.QuestionsRepository;
import com.eda.icerikyonetimi.repository.SubjectDetailRepository;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;
import com.eda.icerikyonetimi.utility.MyFactoryService;

public class QuestionsService extends MyFactoryService<MyFactoryRepository, Questions, Long> {

    public QuestionsService() {
        super(new QuestionsRepository());

    }

}
