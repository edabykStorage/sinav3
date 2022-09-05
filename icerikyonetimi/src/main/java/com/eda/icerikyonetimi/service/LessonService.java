package com.eda.icerikyonetimi.service;

import com.eda.icerikyonetimi.entity.Lesson;
import com.eda.icerikyonetimi.repository.LessonRepository;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;
import com.eda.icerikyonetimi.utility.MyFactoryService;

public class LessonService extends MyFactoryService<MyFactoryRepository, Lesson, Long> {

public LessonService() {
        super(new LessonRepository());

        }

        }
