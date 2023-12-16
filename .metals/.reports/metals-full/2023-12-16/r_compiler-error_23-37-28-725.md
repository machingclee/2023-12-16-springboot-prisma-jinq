file:///C:/Users/user/Repos/Java/2023-12-16-springboot-with-prisma/src/main/java/com/machingclee/hibernatetest/HibernatetestApplication.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/user/Repos/Java/2023-12-16-springboot-with-prisma/src/main/java/com/machingclee/hibernatetest/HibernatetestApplication.java
text:
```scala
package com.machingclee.hibernatetest;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.machingclee.hibernatetest.dao.StudentDAO;

@SpringBootApplication
public class HibernatetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatetestApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentDAO studentDAO) {
		return (runner) -> {
			// var student = new Student("James", "Lee", "machingclee@gmail.com");
			// studentDAO.create(student);
			var student = studentDAO.findByEmail("machingclee@gmail.com");
			System.out.println(student);
		};
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