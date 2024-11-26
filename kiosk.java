import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus=new ArrayList<>();;
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
    private List<cart> carts = new ArrayList<>();
    public void addCarts(MenuItem menuItem) {
        cart cart1 = new cart(menuItem.getName(), menuItem.getPrice(), menuItem.getExplain());
        carts.add(cart1);
        System.out.println("장바구니에 추가되었습니다.");
    }
    public void removeCarts() {
        carts.clear();
        System.out.println("장바구니를 비웠습니다.");
    }


    public void start(){
        Scanner scanner=new Scanner(System.in);
        int cartin = 0;
        int order = 0;


        while(true){
            printMainMenus();
            int mainChoice=scanner.nextInt();
            if(mainChoice==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (mainChoice==1){
                Menu selectedMenu=menus.get(mainChoice-1);
                System.out.println("[ " + selectedMenu.getCategory() + " MENU ]");
                List<MenuItem> menuItems = selectedMenu.getMenuItems();
                for (int i = 0; i < menuItems.size(); i++) {
                    System.out.println((i + 1) + ". " + menuItems.get(i));
                }

                System.out.print("원하는 메뉴 번호를 입력하세요: ");
                int itemChoice = scanner.nextInt();
                MenuItem selectedItem = menuItems.get(itemChoice - 1);
                selectedMenu.printMenu();
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인");
                System.out.println("2. 취소");
                cartin=scanner.nextInt();
                if(cartin==1){
                    addCarts(selectedItem);
                }
            }
            else if(mainChoice==2){
                Menu selectedMenu=menus.get(mainChoice-1);
                System.out.println("[ " + selectedMenu.getCategory() + " MENU ]");
                List<MenuItem> menuItems = selectedMenu.getMenuItems();
                for (int i = 0; i < menuItems.size(); i++) {
                    System.out.println((i + 1) + ". " + menuItems.get(i));
                }

                System.out.print("원하는 메뉴 번호를 입력하세요: ");
                int itemChoice = scanner.nextInt();
                MenuItem selectedItem = menuItems.get(itemChoice - 1);
                selectedMenu.printMenu();
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인");
                System.out.println("2. 취소");
                cartin=scanner.nextInt();
                if(cartin==1){
                    addCarts(selectedItem);
                }
            }
            else if(mainChoice==3){
                Menu selectedMenu=menus.get(mainChoice-1);
                System.out.println("[ " + selectedMenu.getCategory() + " MENU ]");
                List<MenuItem> menuItems = selectedMenu.getMenuItems();
                for (int i = 0; i < menuItems.size(); i++) {
                    System.out.println((i + 1) + ". " + menuItems.get(i));
                }

                System.out.print("원하는 메뉴 번호를 입력하세요: ");
                int itemChoice = scanner.nextInt();
                MenuItem selectedItem = menuItems.get(itemChoice - 1);
                selectedMenu.printMenu();
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인");
                System.out.println("2. 취소");
                cartin=scanner.nextInt();
                if(cartin==1){
                    addCarts(selectedItem);
                }
            }
            else if(mainChoice==4){
                System.out.println(carts);
                int total = 0;
                for (int i = 0; i < carts.size(); i++) {
                    total += carts.get(i).getPrice();
                }
                System.out.println("[ Total ]");
                System.out.println(total);
                System.out.println("1. 주문");
                System.out.println("2. 장바구니 비우기");
                System.out.println("3. 메뉴로 돌아가기");
                order=scanner.nextInt();
                if(order==1){
                    System.out.println("주문이 완료되었습니다 총 금액은"+total+"입니다");
                } else if(order==2){
                     removeCarts();
                } else if(order==3){
                    continue;
                } else {
                    System.out.println("없는 숫자입니다.");
                }
            }
            }
        }

    public void printMainMenus() {
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("4. 장바구니보기");
        System.out.println("0. 종료      | 종료");
    }

}


