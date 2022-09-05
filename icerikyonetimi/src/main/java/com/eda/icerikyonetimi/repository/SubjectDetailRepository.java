package com.eda.icerikyonetimi.repository;

import com.eda.icerikyonetimi.entity.Subject;
import com.eda.icerikyonetimi.entity.SubjectDetail;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;

public class SubjectDetailRepository extends MyFactoryRepository<SubjectDetail, Long> {

    public SubjectDetailRepository() {
        super(new SubjectDetail());

    }
}
