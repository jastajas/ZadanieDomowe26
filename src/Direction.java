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
        switch (num){
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return SOUTH;
            case 3:
                return WEST;
            default:
                return UNDEFINED;
        }
    }

    @Override
    public String toString() {
        return  "OK więc idziemy na " + polishName;
    }
}
