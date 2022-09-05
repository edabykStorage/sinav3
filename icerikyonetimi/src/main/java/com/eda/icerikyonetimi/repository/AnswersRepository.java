package com.eda.icerikyonetimi.repository;

import com.eda.icerikyonetimi.entity.Answers;
import com.eda.icerikyonetimi.entity.Questions;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;

public class AnswersRepository extends MyFactoryRepository<Answers, Long> {

    public AnswersRepository() {
        super(new Answers());

    }


}
