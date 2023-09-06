public class Main {

    public static void main(String[] args) {
        FieldGenerator fieldGenerator = new FieldGenerator();
        Field field = fieldGenerator.generateField();

        System.out.println(field);

    }
}