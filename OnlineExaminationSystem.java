public class OnlineExaminationSystem {

    static abstract class Question {
        abstract int evaluate(String ans);
    }

    static class MultipleChoiceQuestion extends Question {
        int evaluate(String ans) {
            return ans.equals("C") ? 5 : 0;
        }
    }

    static class Student {
        int id;

        Student(int id) {
            this.id = id;
        }
    }

    static class Attempt {
        boolean submitted = false;
    }

    public static void main(String[] args) {

        Student s = new Student(1);

        Question q = new MultipleChoiceQuestion();

        Attempt a = new Attempt();

        String answer = "C";

        System.out.println("Student " + s.id + " started Exam A");

        a.submitted = true;

        System.out.println("Score = " + q.evaluate(answer));

        if (a.submitted)
            System.out.println("Cannot change answers");
    }
}