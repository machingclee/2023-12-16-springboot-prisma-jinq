file:///C:/Users/user/Repos/Java/2023-12-16-springboot-with-prisma/src/main/java/com/machingclee/hibernatetest/dao/StudentDAO.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/user/Repos/Java/2023-12-16-springboot-with-prisma/src/main/java/com/machingclee/hibernatetest/dao/StudentDAO.java
text:
```scala
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

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:45)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:99)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator