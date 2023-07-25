package org.fasttrack.tema11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    private List<StudentGrade> grades;

    public ReportGenerator(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public void generateReport() throws IOException {
        String filePath = "files/grade-reports.out";
        Classroom myClassroom = new Classroom(grades);
        StudentGrade maxStudent  = myClassroom.getMaxGrade("Computer Science");
        String lineToWrite = "Cea mai mare nota: " + maxStudent.getName() + " " + maxStudent.getGrade();

        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write(lineToWrite);
        writer.close();
    }
}
