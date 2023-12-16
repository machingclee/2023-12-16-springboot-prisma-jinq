# 2023-12-16-springboot-with-prisma
Integration of prisma and springboot.

# Why?
- The native table migration by Hibernate sucks, like you cannot drop non-null and set nullable by using entity class definition and annotations. 

- Intead, the java-end should only be a table-consumer, the table-producer should be something else.

- With my experience from `prisma` + `kysely` in `nodejs` world, I believe prisma + springboot must be a good fit.

- We integrate springboot with jooq. Jooq reverse-engineers our database and produce types field names, etc, automatically for us. Which is a counterpart of kysely in nodejs world.
