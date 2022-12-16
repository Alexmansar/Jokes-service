package com.alexmansar.util;

import org.hibernate.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SessionUtilTest extends HibernateUtilTest {
    Session session;

    @BeforeEach
    public void initSession() {
        session = sessionFactory.openSession();
    }

    @AfterEach
    public void destroySession() {
        session.close();
    }

    @Test
    public void sessionOpenTest() {
        Assertions.assertTrue(session.isOpen());
    }
}