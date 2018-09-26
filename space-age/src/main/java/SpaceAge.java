class SpaceAge {

    private double seconds;

    enum Periods{
        EARTH(1), 
        MERCURY(0.2408467), 
        VENUS(0.61519726),
        MARS(1.8808158),
        JUPITER(11.862615),
        SATURN(29.447498),
        URANUS(84.016846),
        NEPTUNE(164.79132);

        private final double earthYears;

        Periods(double earthYears) {
            this.earthYears = earthYears;
        }

        double getEarthYears() {
            return this.earthYears;
        }
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds / 31557600;
    }

    double onMercury() {
        return onEarth() / Periods.MERCURY.getEarthYears();
    }

    double onVenus() {
        return onEarth() / Periods.VENUS.getEarthYears();
    }

    double onMars() {
        return onEarth() / Periods.MARS.getEarthYears();
    }

    double onJupiter() {
        return onEarth() / Periods.JUPITER.getEarthYears();
    }

    double onSaturn() {
        return onEarth() / Periods.SATURN.getEarthYears();
    }

    double onUranus() {
        return onEarth() / Periods.URANUS.getEarthYears();
    }

    double onNeptune() {
        return onEarth() / Periods.NEPTUNE.getEarthYears();
    }

}
