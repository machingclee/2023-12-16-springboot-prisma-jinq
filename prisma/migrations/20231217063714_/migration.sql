/*
  Warnings:

  - You are about to drop the column `firstName` on the `student` table. All the data in the column will be lost.
  - Added the required column `first_name` to the `student` table without a default value. This is not possible if the table is not empty.

*/
-- AlterTable
ALTER TABLE "student" DROP COLUMN "firstName",
ADD COLUMN     "first_name" TEXT NOT NULL;
