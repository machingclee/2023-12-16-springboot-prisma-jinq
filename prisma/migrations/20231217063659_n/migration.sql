/*
  Warnings:

  - You are about to drop the `Student` table. If the table is not empty, all the data it contains will be lost.

*/
-- DropTable
DROP TABLE "Student";

-- CreateTable
CREATE TABLE "student" (
    "id" UUID NOT NULL DEFAULT gen_random_uuid(),
    "firstName" TEXT NOT NULL,
    "last_name" TEXT NOT NULL,
    "email" TEXT NOT NULL,

    CONSTRAINT "student_pkey" PRIMARY KEY ("id")
);
