package hellocucumber;

public class Color {

    private static String color;

    public Color(String color) {
        Color.color = color;
    }

    static String colorResult() {
        return color;
    }

}
