package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Adress> collect(List<Profile> profiles) {
        List<Adress> rsl;
        rsl = profiles.stream()
                .map(Profile::getAdress)
                .collect(Collectors.toList());
        return rsl;
    }
}
