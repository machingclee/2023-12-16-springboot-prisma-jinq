package com.machingclee.jooq.dao;

import java.util.UUID;
import java.util.List;

import static com.machingclee.jooq.generated.Tables.*;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.machingclee.jooq.generated.tables.records.StudentRecord;

@Repository
public class StudentDAO {
    private DSLContext db;

    @Autowired
    StudentDAO(DSLContext ctx) {
        this.db = ctx;
    }

    public void create(StudentRecord student) {
        db.insertInto(STUDENT,
                STUDENT.FIRST_NAME, STUDENT.LAST_NAME, STUDENT.EMAIL)
                .values(student.getFirstName(), student.getLastName(), student.getEmail())
                .execute();
    };

    public StudentRecord findById(UUID uuid) {
        var result = db.selectFrom(STUDENT).where(STUDENT.ID.equal(uuid)).fetchOne().into(StudentRecord.class);
        return result;
    }

    public List<StudentRecord> getStudents() {
        var result = db
                .select()
                .from(STUDENT)
                .orderBy(STUDENT.LAST_NAME.asc()).fetch().into(StudentRecord.class);
        return result;
    }

    public StudentRecord findByEmail(String email) {
        var result = db.selectFrom(STUDENT).where(STUDENT.EMAIL.equal(email)).fetchOne().into(StudentRecord.class);
        return result;
    }
}
