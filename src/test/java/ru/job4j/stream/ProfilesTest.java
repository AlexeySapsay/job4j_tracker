package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {
//    @Test
//    public void whenCollect() {
//        List<Adress> adressList = List.of(
//                new Adress("Moskov", "Lenina", 22, 10),
//                new Adress("Piter", "Pyshkina", 1, 257),
//                new Adress("Tver", "Tsvetaevoy", 3, 56),
//                new Adress("Rostov On Don", "Azimov", 27, 14),
//                new Adress("Bolshie Vasuki", "Lenina", 14, 10)
//        );
//
//        List<Profile> profList = List.of(
//                new Profile(new Adress("Moskov", "Lenina", 22, 10)),
//                new Profile(new Adress("Piter", "Pyshkina", 1, 257)),
//                new Profile(new Adress("Tver", "Tsvetaevoy", 3, 56)),
//                new Profile(new Adress("Rostov On Don", "Azimov", 27, 14)),
//                new Profile(new Adress("Bolshie Vasuki", "Lenina", 14, 10))
//        );
//
//        Profiles profiles = new Profiles();
//        List<Adress> rsl = profiles.collect(profList);
//        assertEquals(adressList, rsl);
//    }

    @Test
    public void whenCollectCompareAscendingCityAndDistinct() {
        List<Adress> adressList = List.of(
                new Adress("Bolshie Vasuki", "Lenina", 14, 10),
                new Adress("Moskov", "Lenina", 22, 10),
                new Adress("Piter", "Pyshkina", 1, 257),
                new Adress("Rostov On Don", "Azimov", 27, 14),
                new Adress("Tver", "Tsvetaevoy", 3, 56)
        );

        List<Profile> profList = List.of(
                new Profile(new Adress("Tver", "Tsvetaevoy", 3, 56)),
                new Profile(new Adress("Moskov", "Lenina", 22, 10)),
                new Profile(new Adress("Bolshie Vasuki", "Lenina", 14, 10)),
                new Profile(new Adress("Piter", "Pyshkina", 1, 257)),
                new Profile(new Adress("Moskov", "Lenina", 22, 10)),
                new Profile(new Adress("Rostov On Don", "Azimov", 27, 14)),
                new Profile(new Adress("Moskov", "Lenina", 22, 10))
        );

        Profiles profiles = new Profiles();
        List<Adress> rsl = profiles.collect(profList);
        assertEquals(adressList, rsl);
    }
}