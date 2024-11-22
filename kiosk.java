import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kiosk {

    //menuitem을 관리하는 리스트
    List<MenuItem> menuItems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("=== 키오스크 프로그램 ===");

        while (true) {
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 보기");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();  // 사용자 입력
            sc.nextLine();

            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    printMenu();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;  // 프로그램 종료
                default:
                    System.out.println("올바른 번호를 선택하세요.");
            }
        }
    }


    public void addMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
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

    public void printMenu() {
        String a = "0. 종료          | 종료";

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).toString());
        }
        System.out.println(a);
        do {
            int f = sc.nextInt();
            if (f == 0) {
                System.out.println(a);
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println(menuItems.get(f - 1).toString());
            }
        } while (true);
    }

}
