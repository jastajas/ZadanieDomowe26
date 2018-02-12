public enum Direction {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód"),
    UNDEFINED("nieznany");

    private final String polishName;

    Direction(String polishName){
        this.polishName = polishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public static Direction convert(int num){
        Direction[] dir = Direction.values();
        return dir[num];
    }

    @Override
    public String toString() {
        return  "OK więc idziemy na " + polishName;
    }
}
