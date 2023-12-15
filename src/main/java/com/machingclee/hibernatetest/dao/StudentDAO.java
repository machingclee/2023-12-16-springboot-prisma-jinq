package com.machingclee.hibernatetest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.machingclee.hibernatetest.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAO {
    private EntityManager em;

    @Autowired
    public StudentDAO(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public void create(Student student) {
        em.persist(student);
    };
}
