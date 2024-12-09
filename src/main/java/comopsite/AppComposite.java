package comopsite;

public class AppComposite {
    public static void main(String[] args) {
        Folder root = new Folder("src");
        Folder main = new Folder("main");
        Folder java = new Folder("java");
        Folder test = new Folder("test");
        root.add(main);
        main.add(java);
        main.add(test);
        java.add(new File("UserService.java"));
        java.add(new File("ProductService.java"));
        test.add(new File("UserServiceTest.java"));
        test.add(new File("ProductTest.java"));


        root.print();
    }
}
