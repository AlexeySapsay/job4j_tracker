package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class Profiles0Test {
    @Test
    public void whenCollect() {
        List<Adress0> adressList0 = List.of(
                new Adress0("Moskov", "Lenina", 22, 10),
                new Adress0("Piter", "Pyshkina", 1, 257),
                new Adress0("Tver", "Tsvetaevoy", 3, 56),
                new Adress0("Rostov On Don", "Azimov", 27, 14),
                new Adress0("Bolshie Vasuki", "Lenina", 14, 10)
        );

        List<Profile0> profList0 = List.of(
                new Profile0(new Adress0("Moskov", "Lenina", 22, 10)),
                new Profile0(new Adress0("Piter", "Pyshkina", 1, 257)),
                new Profile0(new Adress0("Tver", "Tsvetaevoy", 3, 56)),
                new Profile0(new Adress0("Rostov On Don", "Azimov", 27, 14)),
                new Profile0(new Adress0("Bolshie Vasuki", "Lenina", 14, 10))
        );

        Profiles0 profiles0 = new Profiles0();
        List<Adress0> rsl0 = profiles0.collect(profList0);
        assertEquals(adressList0, rsl0);
    }
}