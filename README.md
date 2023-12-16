# 2023-12-16-springboot-with-prisma
Integration of prisma and springboot.

# Why?
- The native table migration by Hibernate sucks, like you cannot drop non-null and set nullable by using entity class definition and annotations. 

- Intead, the java-end should only be a table-consumer, the table-producer should be something else.

- With my experience from `prisma` + `kysely` in `nodejs` world, I believe prisma + springboot must be a good fit.

- We also study type-safe query to prevent writing query in ***plain string***, which makes it very difficult to correctly make changes to tables (as requirement changes, table name, field name should also be changed). 
