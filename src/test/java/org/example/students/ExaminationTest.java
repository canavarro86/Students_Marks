package org.example.students;

import org.example.students.exeptions.NotFoundExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExaminationTest {
    private Examination examination;

    @BeforeEach
    void setUp() {
        examination = new InScore();
    }

    @Test
    void addScore() throws NotFoundExeption{

        Score score = new Score("Artem", "Mining", 5);
        examination.addScore(score);

        Score actual = examination.getScore(score.name(), score.subject());
        Assertions.assertEquals(score, actual);

    }

    @Test
    void getScore() throws NotFoundExeption{
        //examination.getScore("blad", "suka");
        Assertions.assertThrows(NotFoundExeption.class, () -> examination.getScore("blad","suka"));

    }

    @Test
    void getAverageForSubject() {
        double getAverageForSubject = 0;

        Score score1 = new Score("Andrey", "Mining", 3);
        Score score2 = new Score("Mendy", "Mining", 3);
        Score score3 = new Score("Ruslan", "Mining", 3);
        Score score4 = new Score("Valeriy", "Mining", 3);
        Score score5 = new Score("Alexey", "Mining", 3);

        examination.putAllScores(List.of(score1.score(), score2.score(), score3.score(),
                score4.score(), score5.score()));

//        examination.addScore(score1);
//        examination.addScore(score2);
//        examination.addScore(score3);
//        examination.addScore(score4);
//        examination.addScore(score5);



        //Assertions.assertTrue(getAverageForSubject, 3);
    }

    @Test
    void multipleSubmissionsStudentNames() {
    }

    @Test
    void lastFiveStudentsWithExcellentMarkOnAnySubject() {
    }

    @Test
    void getAllScores() {

    }
}
