package com.wj.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommonDao {

    private static final Logger logger = LoggerFactory.getLogger(CommonDao.class);

    @Autowired
    private SqlSessionTemplate sqlSession;

    protected void printQueryId(String queryId){
        if(logger.isDebugEnabled()){
            logger.debug("\t QueryId  \t:  " + queryId);
        }
    }

    public List selectList(String queryId){
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }

}
