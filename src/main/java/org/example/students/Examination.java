package org.example.students;

import org.example.students.exeptions.NotFoundExeption;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Examination{
    void addScore(Score score);

    Score getScore(String name, String subject) throws NotFoundExeption;

    double getAverageForSubject(String subject);

    Set<String> multipleSubmissionsStudentNames();

    Set<String> lastFiveStudentsWithExcellentMarkOnAnySubject();

    Collection<Score> getAllScores();

    void putAllScores(List<Double> score);
}
