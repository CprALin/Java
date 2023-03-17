package softwareProduct;

public class Main {
    public static void main(String[] args) {
        softwareProduct[] p1 = {
                new operatingSystem(1245, "WindowsNT", 5000),
                new progLanguage(2134, "Pascal", 3500),
                new utilitarian(56890, "NortonCommander", 1200),
                new game(789, "Mahjong", 23456) };

        for (var p : p1) {
            p.calculateNewPrice();
            System.out.println(p);
        }
    }
}
