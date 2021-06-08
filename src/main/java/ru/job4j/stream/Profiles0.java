package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

//https://job4j.ru/profile/exercise/3/task-view/252/solutionId/165733
// первая задача!

public class Profiles0 {
    public List<Adress0> collect(List<Profile0> profiles) {
        return profiles.stream().
                map(Profile0::getAdress0)
                .collect(Collectors.toList());
    }
}
