package com.eda.icerikyonetimi.service;

import com.eda.icerikyonetimi.entity.Subject;
import com.eda.icerikyonetimi.entity.SubjectDetail;
import com.eda.icerikyonetimi.repository.SubjectDetailRepository;
import com.eda.icerikyonetimi.repository.SubjectRepository;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;
import com.eda.icerikyonetimi.utility.MyFactoryService;

public class SubjectDetailService extends MyFactoryService<MyFactoryRepository, SubjectDetail, Long> {

    public SubjectDetailService() {
        super(new SubjectDetailRepository());

    }

}
