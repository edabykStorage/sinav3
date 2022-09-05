package com.eda.icerikyonetimi.repository;

import com.eda.icerikyonetimi.entity.Subject;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;

public class SubjectRepository extends MyFactoryRepository<Subject, Long> {

    public SubjectRepository() {
        super(new Subject());

    }
}
