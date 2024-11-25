import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus=new ArrayList<>();;
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }


    public void start(){
        Scanner scanner=new Scanner(System.in);


        while(true){
            printMainMenus();
            int mainChoice=scanner.nextInt();
            if(mainChoice==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (mainChoice==1&& mainChoice<=menus.size()){
                Menu selectedMenu=menus.get(mainChoice-1);
                selectedMenu.printMenu();

                int itemChoice=scanner.nextInt();
                if(itemChoice==0){
                    continue;
                }
                if(itemChoice>=1&&itemChoice<=selectedMenu.getMenuItems().size()) {
                    MenuItem selectedItem = selectedMenu.getMenuItems().get(itemChoice - 1);
                    System.out.println("선택한 메뉴: " + selectedItem);
                } else{
                    System.out.println("잘못된 선택입니다.");
                }
                } else{
                System.out.println("잘못된 선택입니다.");
            }
            }
        }

    public void printMainMenus() {
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료      | 종료");
    }

}


