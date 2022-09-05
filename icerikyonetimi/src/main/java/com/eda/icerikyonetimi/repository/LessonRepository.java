package com.eda.icerikyonetimi.repository;

import com.eda.icerikyonetimi.entity.Lesson;

import com.eda.icerikyonetimi.utility.MyFactoryRepository;

public class LessonRepository extends MyFactoryRepository<Lesson, Long> {

    public LessonRepository() {
        super(new Lesson());

    }


}
