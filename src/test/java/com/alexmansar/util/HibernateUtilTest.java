package com.alexmansar.util;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HibernateUtilTest {
    SessionFactory sessionFactory;

    @BeforeEach
    public void initSessionFactory() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @AfterEach
    public void destroySessionFactory() {
        sessionFactory = null;
    }

    @Test
    public void sessionFactoryOpenTest() {
        Assertions.assertTrue(sessionFactory.isOpen());
    }

    @Test
    public void sessionFactoryClosedTest() {
        Assertions.assertFalse(sessionFactory.isClosed());
    }

}