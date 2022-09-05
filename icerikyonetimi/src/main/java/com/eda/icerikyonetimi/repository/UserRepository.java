package com.eda.icerikyonetimi.repository;

import com.eda.icerikyonetimi.entity.User;
import com.eda.icerikyonetimi.utility.MyFactoryRepository;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;

public class UserRepository extends MyFactoryRepository<User, Long> {

    public UserRepository() {
        super(new User());


    }


    String sql = "SELECT user_id , COUNT(*) FROM tbl_subject_detail_tbl_user GROUP BY user_id order by count Desc limit 1;";


    public Optional<User> enCokIcerikUreten() {
        User user = null;
        Object o = getEntityManager().createNativeQuery(sql).getResultList().get(0);
        BigInteger o1 = (BigInteger) Arrays.asList((Object[]) o).get(0);
        try {
            return findById(o1.longValue());

        } catch (Exception e) {
            return Optional.ofNullable(null);
        }

    }
}
