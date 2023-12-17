/*
  Warnings:

  - You are about to drop the `student` table. If the table is not empty, all the data it contains will be lost.

*/
-- DropTable
DROP TABLE "student";

-- CreateTable
CREATE TABLE "Student" (
    "id" UUID NOT NULL DEFAULT gen_random_uuid(),
    "firstName" TEXT NOT NULL,
    "lastName" TEXT NOT NULL,
    "email" TEXT NOT NULL,

    CONSTRAINT "Student_pkey" PRIMARY KEY ("id")
);
