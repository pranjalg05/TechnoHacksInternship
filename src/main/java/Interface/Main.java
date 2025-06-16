package Interface;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square(5);
        int area = (int) sq.getArea();
        int peri = (int) sq.getPerimeter();
        System.out.printf("Area of square is %d and perimeter is %d", area, peri);
    }
}
