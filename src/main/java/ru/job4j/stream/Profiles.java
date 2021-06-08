package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Adress> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAdress)
                .sorted(Comparator.comparing(Adress::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
