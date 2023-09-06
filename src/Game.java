import java.util.Scanner;

public class Game {

    public void start(Field field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась");
        System.out.println("-------------");
        System.out.println("Введите число:");
        int row = scanner.nextInt();
        System.out.println("Введите второе число:");
        int column = scanner.nextInt();
        Cell[][] cells = field.getCells();
        Cell targetCell = cells[row][column];

        if (targetCell.isShip()) {
            System.out.println("Молодец");
        }
        else {
            System.out.println("Обидно");
        }

    }

}
