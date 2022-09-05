package com.eda.icerikyonetimi.repository;

import com.eda.icerikyonetimi.entity.Questions;
import com.eda.icerikyonetimi.entity.User;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;

public class QuestionsRepository extends MyFactoryRepository<Questions, Long> {

    public QuestionsRepository() {
        super(new Questions());

    }


}

