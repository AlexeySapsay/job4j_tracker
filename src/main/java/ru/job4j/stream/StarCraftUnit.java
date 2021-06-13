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

        StarCraftUnit.Builder buildName(String name) {
            this.name = name;
            return this;
        }

        StarCraftUnit.Builder buildRace(String race) {
            this.race = race;
            return this;
        }

        StarCraftUnit.Builder buildGasCost(short gasCost) {
            this.gasCost = gasCost;
            return this;
        }

        StarCraftUnit.Builder buildMineralCost(short mineralCost) {
            this.mineralCost = mineralCost;
            return this;
        }

        StarCraftUnit.Builder buildTimeBuild(short timeBuild) {
            this.timeBuild = timeBuild;
            return this;
        }

        StarCraftUnit build() {
            StarCraftUnit unit = new StarCraftUnit();
            unit.name = name;
            unit.race = race;
            unit.gasCost = gasCost;
            unit.mineralCost = mineralCost;
            unit.timeBuild = timeBuild;
            return unit;
        }
    }

    public static void main(String[] args) {
        StarCraftUnit unit = new Builder()
                .buildName("SiegeTank")
                .buildRace("Terran")
                .buildGasCost((short) 125)
                .buildMineralCost((short) 150)
                .buildTimeBuild((short) 32)
                .build();
        System.out.println(unit);
    }
}

