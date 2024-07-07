package com.zw.db;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ActiveJdbcAspect {

    private final static Logger logger = LoggerFactory.getLogger(ActiveJdbcAspect.class);

    @Pointcut("execution(* com.zw.db.service.*.*(..))")
    public void dbConnect() {
        logger.info("ActiveJdbcAspect exec");
    }

    @Before("dbConnect()")
    public void createConnect() {
        logger.info("ActiveJdbcAspect open");
        Base.open();
    }

    @After("dbConnect()")
    public void releaseConnect() {
        logger.info("ActiveJdbcAspect close");
        Base.close();
    }
}