import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coke", 2.5, ""));
        drinks.addMenuItem(new MenuItem("Sprite", 2.5, ""));
        drinks.addMenuItem(new MenuItem("Water", 1.0, ""));

        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));
        desserts.addMenuItem(new MenuItem("Brownie", 4.0, "초콜릿 브라우니"));


        // 키오스크 생성 및 메뉴 전달
        Kiosk kiosk = new Kiosk();
        kiosk.setMenus(Arrays.asList(burgers, drinks)); // 메뉴 전달
        kiosk.start(); // Kiosk 실행
    }
    }


