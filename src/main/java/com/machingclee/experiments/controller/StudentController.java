package com.machingclee.experiments.controller;

import static com.machingclee.experiments.generated.Tables.STUDENT;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;
import com.machingclee.experiments.dto.StudentDTO;

@Component
public class StudentController {

    private DSLContext db;

    @Autowired
    public StudentController(DSLContext ctx) {
        this.db = ctx;
    }

    public ServerResponse getStudents(ServerRequest req) {
        var students = db.select(STUDENT.FIRST_NAME, STUDENT.LAST_NAME, STUDENT.EMAIL)
                .from(STUDENT)
                .fetch()
                .into(StudentDTO.class);
        return ServerResponse.ok().body(students);
    }
}
