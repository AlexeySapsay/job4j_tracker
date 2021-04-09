package ru.job4j.map;

/**
 * Метод принимает список объектов Info. При это эти объекты содержат два поля:
 * <p>
 * 1. city - название города, где производились наблюдения;
 * <p>
 * 2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
 * <p>
 * Необходимо реализовать метод так, чтобы в результате
 * вернулся список объектов Info в котором будет указано имя города наблюдения
 * и общее количество осадков за период наблюдения.
 */

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Set<String> citySetStr = new LinkedHashSet<String>();
        Map<String, Integer> cityRainfallMap = new HashMap<String, Integer>();

        // add city from Info to citySetStr
        for (Info element : list) {
            citySetStr.add(element.getCity());
        }

        // make a key from citySet to cityRainfallMap
        // put a key and make Integer value == 0;
        for (String key : citySetStr) {
            cityRainfallMap.put(key, 0);
        }

        //put value to rainfall value
        for (String key : citySetStr) {
            int rainfall = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCity().equals(key)) {
                    rainfall += list.get(i).getRainfall();
                }
            }
            cityRainfallMap.put(key, rainfall);
        }

        for (Map.Entry<String, Integer> entry : cityRainfallMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " , " + value);
        }

        // convert cityRainfallMap to rsl ArrayList
        for (Map.Entry<String, Integer> entry : cityRainfallMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            rsl.add(new Info(key, value));
        }
        return rsl;
    }

    public static class Info {
        private String city;
        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
