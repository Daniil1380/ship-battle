import java.util.Random;

public class FieldGenerator {

    public Field generateField() {
        Random random = new Random();

        Cell[][] cells = new Cell[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                boolean isShip = random.nextBoolean();
                cells[i][j] = new Cell(isShip);
            }
        }

        Field field = new Field(cells);

        return field;
    }
}
