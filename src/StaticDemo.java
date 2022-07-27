public class StaticDemo {
    static String name;

    void print() {
        System.out.println("Name is " + name);
    }

    void change() {
        StaticDemo.name = "Name " + System.currentTimeMillis();
    }

    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo();
        StaticDemo demo2 = new StaticDemo();
        StaticDemo demo3 = new StaticDemo();

        demo1.print();
        demo2.print();
        demo3.print();

        demo1.change();

        demo1.print();
        demo2.print();
        demo3.print();

        demo2.change();

        demo1.print();
        demo2.print();
        demo3.print();
    }
}
