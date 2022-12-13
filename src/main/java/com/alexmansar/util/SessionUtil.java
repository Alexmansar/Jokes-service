package com.alexmansar.util;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
@Slf4j
@FieldDefaults(level = AccessLevel.PROTECTED)
public class SessionUtil extends HibernateUtil {
    final Session session;

    public SessionUtil() {
        session = getSessionFactory().openSession();
        log.info(String.valueOf(session.isOpen()));
    }
}