package org.fasttrack.tema11;

import java.io.IOException;
import java.util.List;

public class MainTema11 {

    public static void main(String[] args) throws IOException {
        String filePath = "files/grades.txt";
        FileToStudentGradesConverter converter = new FileToStudentGradesConverter();
        List<StudentGrade> studentGradesFromFile = converter.convertToStudents(filePath);
        System.out.println(String.format("Am gasit %d studenti in lista", studentGradesFromFile.size()));

        Classroom classroom = new Classroom(studentGradesFromFile);

        System.out.println("MAX GRADE IS " + classroom.getMaxGrade("Computer Science"));
        System.out.println();
        System.out.println(classroom.getGradesForDiscipline("Physics"));
        System.out.println();
        System.out.println(classroom.getGradesForStudent("Demetria Cosme"));
        System.out.println("AVERAGE IS " + classroom.getAverageGrade("Mathematics"));

        ReportGenerator report = new ReportGenerator(studentGradesFromFile);
        report.generateReport();
    }
}
