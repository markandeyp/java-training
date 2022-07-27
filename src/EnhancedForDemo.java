public class EnhancedForDemo {
    public static void main(String[] args) {
        final String[] names = {"Juan", "Julia", "Robert", "Earl", "Jack"};

        for (String name : names) {
            System.out.printf("%s has %s letters\n", name, name.length());
        }
    }
}
