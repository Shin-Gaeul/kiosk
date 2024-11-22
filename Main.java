import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("이름을 입력하세요: ");
            String name = sc.nextLine();
            if (name.equals("menu add end")) {
                System.out.println("메뉴추가가 완료되었습니다");
                break;
            } else {
                System.out.println("가격을 입력하세요: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("설명을 입력하세요: ");
                String explane = sc.nextLine();


                MenuItem menuItem = new MenuItem(name, price, explane);
                menuItems.add(menuItem);
            }
        }
    }
}
