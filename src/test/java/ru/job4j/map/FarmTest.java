package ru.job4j.map;

/**
 * https:\\job4j.ru/edu/task_code?topicId=29&taskCodeId=216&solutionId=new_task
 */

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static ru.job4j.map.Farm.Animal;

public class FarmTest {
    @Test
    public void sumLegs() {
        Map<Animal, Integer> data = Map.of(
                new Animal("chicken", 2), 5,
                new Animal("cow", 4), 2,
                new Animal("pig", 4), 8
        );
        int rsl = Farm.sumLegs(data);
        assertThat(rsl, is(50));
    }
}