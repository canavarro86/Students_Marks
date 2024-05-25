package org.example.students;

import org.example.students.exeptions.NotFoundExeption;

import java.util.*;

public class InScore implements Examination{

//    private final Examination examination;
    private  final Map<String, Score> marks = new HashMap<>();


//    public InScore(Examination examination){
//        this.examination = examination;
//    }

    @Override
    public void addScore(Score score) {
        marks.put(score.name(), score);
    }

    @Override
    public Score getScore(String name, String subject) throws NotFoundExeption {
        Score score = marks.get(name);
        if (score == null){
            throw new NotFoundExeption(name);
        }
        return score;
    }

    @Override
    public double getAverageForSubject(String subject) {
        double AverageForSubject = 0.0;
        int counter = 0;
        List <Double> studentMark = new ArrayList<>();
        for (int i = 0; i < marks.size(); i++){

        }

        return AverageForSubject;
    }

    @Override
    public Set<String> multipleSubmissionsStudentNames() {
        return Set.of();
    }

    @Override
    public Set<String> lastFiveStudentsWithExcellentMarkOnAnySubject() {
        return Set.of();
    }

    @Override
    public Collection<Score> getAllScores() {
        return List.of();
    }

    @Override
    public void putAllScores(List<Double> score) {


    }
}
