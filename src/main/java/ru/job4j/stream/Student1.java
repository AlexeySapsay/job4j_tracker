package ru.job4j.stream;

public class Student1 {
    private int score;
    private String surname;

    public Student1(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student1 student1 = (Student1) o;
        return score == student1.score
                && surname.equals(student1.surname);
    }

    @Override
    public int hashCode() {
        int result = score;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}
