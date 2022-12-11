package com.alexmansar.util;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;

@FieldDefaults(level = AccessLevel.PROTECTED)
public class SessionUtil extends HibernateUtil {
    final Session session;

    public SessionUtil() {
        session = getSessionFactory().openSession();
    }
}
