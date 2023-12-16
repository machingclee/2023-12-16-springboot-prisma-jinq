package com.machingclee.hibernatetest.dao;

import java.util.UUID;

import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.machingclee.hibernatetest.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAO {
    private EntityManager em;
    private JinqJPAStreamProvider streams;

    @Autowired
    public StudentDAO(EntityManager em, JinqJPAStreamProvider streams) {
        this.em = em;
        this.streams = streams;
    }

    @Transactional
    public void create(Student student) {
        em.persist(student);
    };

    public Student findById(UUID uuid) {
        return em.find(Student.class, uuid);
    }

    public Student findByEmail(String email) {
        var result = streams
                .streamAll(em, Student.class)
                .where(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
        return result;
    }
}
