package com.eda.icerikyonetimi.service;

import com.eda.icerikyonetimi.entity.Subject;
import com.eda.icerikyonetimi.repository.SubjectRepository;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;
import com.eda.icerikyonetimi.utility.MyFactoryService;

public class SubjectService extends MyFactoryService<MyFactoryRepository, Subject, Long> {

    public SubjectService() {
        super(new SubjectRepository());

    }

}
