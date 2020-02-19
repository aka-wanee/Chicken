package com.hayden;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        boolean condition = true;

        String brands[] = {"BHC","DDORAE ORAE","GOOBNE","YES YES","KFC","HOSICK'S 2 CHICKENS"};
        String menus[] = {"양념","후라이드","반반무마니","갈릭","파닭","뿌링클", "핫크리스피"};

        String selectedBrand = "";
        int selectedMenu = -1;
        //String menuOfBrand;
        //String menuList[][];

        Scanner scanner = new Scanner(System.in);

        while (condition) {
            System.out.println(
                    "오늘은 치킨이닭!" +
                            "\n어디에 전화를 걸까?" +
                            "\n1. B H C" +
                            "\n2. 또래오래" +
                            "\n3. 굽  네" +
                            "\n4. 네  네" +
                            "\n5. K F C" +
                            "\n6. 호식이 2마리 치킨" +
                            "\n\n원하는 번호를 입력하고 엔터를 눌러주세요."
            );

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectedBrand=brands[0];
                    System.out.println("네 고객님~"+selectedBrand+" 어떤 메뉴 주문하시겠어요??"+
                            "\n1)"+menus[0]+
                            "\n2)"+menus[3]+
                            "\n3)"+menus[5]);
                    choice=scanner.nextInt();
                    if(choice==1||choice==2||choice==3) {
                        selectedMenu=choice;
                    } else {
                        System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                    }
                    break;
                case 2:
                    selectedBrand=brands[1];
                    System.out.println("네 고객님~"+selectedBrand+" 어떤 메뉴 주문하시겠어요??"+
                            "\n1)"+menus[1]+
                            "\n2)"+menus[2]+
                            "\n3)"+menus[3]);
                    choice=scanner.nextInt();
                    if(choice==1||choice==2||choice==3) {
                        selectedMenu=choice;
                    } else {
                        System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                    }

                    break;
                case 3:
                    selectedBrand=brands[2];
                    System.out.println("네 고객님~"+selectedBrand+" 어떤 메뉴 주문하시겠어요??"+
                            "\n1)"+menus[2]+
                            "\n2)"+menus[4]+
                            "\n3)"+menus[6]);
                    choice=scanner.nextInt();
                    if(choice==1||choice==2||choice==3) {
                        selectedMenu=choice;
                    } else {
                        System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                    }
                    break;
                case 4:
                    selectedBrand=brands[3];
                    System.out.println("네 고객님~"+selectedBrand+" 어떤 메뉴 주문하시겠어요??"+
                            "\n1)"+menus[3]+
                            "\n2)"+menus[4]+
                            "\n3)"+menus[6]);
                    choice=scanner.nextInt();
                    if(choice==1||choice==2||choice==3) {
                        selectedMenu=choice;
                    } else {
                        System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                    }
                    break;
                case 5:
                    selectedBrand=brands[4];
                    System.out.println("네 고객님~"+selectedBrand+" 어떤 메뉴 주문하시겠어요??"+
                            "\n1)"+menus[1]+
                            "\n2)"+menus[2]+
                            "\n3)"+menus[5]);
                    choice=scanner.nextInt();
                    if(choice==1||choice==2||choice==3) {
                        selectedMenu=choice;
                    } else {
                        System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                    }
                    break;
                case 6:
                    selectedBrand=brands[5];
                    System.out.println("네 고객님~"+selectedBrand+" 어떤 메뉴 주문하시겠어요??"+
                            "\n1)"+menus[1]+
                            "\n2)"+menus[2]+
                            "\n3)"+menus[3]);
                    choice=scanner.nextInt();
                    if(choice==1||choice==2||choice==3) {
                        selectedMenu=choice;
                    } else {
                        System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                    }
                    break;

                default:
                    System.out.println("메뉴에 있는 브랜드만 선택 가능합니다.");
                    break;
            }
            System.out.println("띵동~♬ 주문하신"+selectedBrand+" "+menus[choice]+" 배달왔습니다~");
            delicious();
            System.out.println("고객님~ 맛있게 드셨나요? 다시 주문하시겠어요? 1)한다 2)안 한다");
            if (scanner.nextInt() == 2) {
                condition = false;
            }

        }
        scanner.close();
    }

    public static void delicious() {
                    System.out.println(
                            "   .-----.\n" +
                            " .~~--~-----.\n" +
                            " -~~~~~~~~----.\n" +
                            ".~~~~~~~~-------.\n" +
                            "-~~~---~~~~~----~~,.\n" +
                            ",~~~~~~~~--~~~---,.\n" +
                            ",~~~~~~----~~~---~~\n" +
                            "   -~~-~~~~----~~,,,\n" +
                            "    ..,,,,----~~~~~~::\n" +
                            "              -~~--~~~.\n" +
                            "               ,----~~~\n" +
                            "                 ~~~~--,"
                    );
    }

}
