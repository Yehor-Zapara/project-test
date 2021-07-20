public class App {
    public static void main(String[] args) {
        int x = 51;
        int y = -3;
        System.out.println(sum(x, y));
        System.out.println(div(x, y));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int div(int x, int y) {
        return x - y;
    }
}
