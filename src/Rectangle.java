public class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }


    public void area() {
        int area = 0;
        area = height * width;
        System.out.println(area);
    }

    public void perimeter() {
        int result;
        result = (height + width) * 2;
        System.out.println(result);
    }
}
