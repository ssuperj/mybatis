package com.review.service;

import com.review.mybatis.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
@Transactional
public class MybaService {
    @Autowired
    TestMapper mapper;

    @Autowired
    PlatformTransactionManager manager;

    public String totSize(String str) {

        TransactionStatus status =
                manager.getTransaction(new DefaultTransactionDefinition());
        String totSize = "";
        try {
            totSize = mapper.totSize("");
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return totSize;
    }

}