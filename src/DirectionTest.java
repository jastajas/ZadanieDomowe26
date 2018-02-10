import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Direction[] directions = Direction.values();

        for (int i = 0; i < directions.length - 1; i++) {
            System.out.println( directions[i].name());
        }

        System.out.println("Podaj kierunek geograficzny: ");
        String direction = sc.nextLine();
        Direction dir = Direction.valueOf(direction);

        System.out.println(dir.toString());

        for (int i = 0; i < directions.length - 1; i++) {
            System.out.println(directions[i].ordinal() + " - " + directions[i].name());
        }
        System.out.println("Podaj nr kierunku: ");
        Direction dirNew = Direction.convert(sc.nextInt());
        System.out.println("Kierunek jaki wybrałeś to: " + dirNew.getPolishName());


    }
}
