package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    private final Comparator<Adress> compareByCity =
            Comparator.comparing(Adress::getCity);

//    private final Comparator<Adress> compareByCity = (o1, o2)
//            -> o1.getCity().compareTo(o2.getCity());

    public List<Adress> collect(List<Profile> profiles) {
        List<Adress> rsl;
//        rsl = profiles.stream()
//                .map(Profile::getAdress)
//                .collect(Collectors.toList());
//        return rsl;

        rsl = profiles.stream()
                .map(Profile::getAdress)
                .sorted(compareByCity)
                .distinct()
                .collect(Collectors.toList());
        return rsl;
    }
}
