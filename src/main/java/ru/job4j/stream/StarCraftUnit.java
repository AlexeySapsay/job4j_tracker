package ru.job4j.stream;

public class StarCraftUnit {
    private String name;
    private String race;
    private short gasCost;
    private short mineralCost;
    private short timeBuild;

    @Override
    public String toString() {
        return "StarCraftUnit{"
                + "name='" + name + '\''
                + ", race='" + race + '\''
                + ", gasCost=" + gasCost
                + ", mineralCost=" + mineralCost
                + ", timeBuild=" + timeBuild
                + '}';
    }

    static class Builder {
        private String name;

        private String race;

        private short gasCost;

        private short mineralCost;

        private short timeBuild;

        ru.job4j.stream.StarCraftUnit.Builder buildName(String name) {
            this.name = name;
            return this;
        }

        ru.job4j.stream.StarCraftUnit.Builder buildRace(String race) {
            this.race = race;
            return this;
        }

        ru.job4j.stream.StarCraftUnit.Builder buildGasCost(short gasCost) {
            this.gasCost = gasCost;
            return this;
        }

        ru.job4j.stream.StarCraftUnit.Builder buildMineralCost(short mineralCost) {
            this.mineralCost = mineralCost;
            return this;
        }

        ru.job4j.stream.StarCraftUnit.Builder buildTimeBuild(short timeBuild) {
            this.timeBuild = timeBuild;
            return this;
        }

        ru.job4j.stream.StarCraftUnit build() {
            ru.job4j.stream.StarCraftUnit unit = new ru.job4j.stream.StarCraftUnit();
            unit.name = name;
            unit.race = race;
            unit.gasCost = gasCost;
            unit.mineralCost = mineralCost;
            unit.timeBuild = timeBuild;
            return unit;
        }
    }

    public static void main(String[] args) {
        ru.job4j.stream.StarCraftUnit unit = new Builder()
                .buildName("SiegeTank")
                .buildRace("Terran")
                .buildGasCost((short) 125)
                .buildMineralCost((short) 150)
                .buildTimeBuild((short) 32)
                .build();
        System.out.println(unit);
    }
}

