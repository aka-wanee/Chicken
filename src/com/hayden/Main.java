package com.hayden;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        boolean condition = true;

        String[] brands = {"BHC", "DDORAE ORAE", "GOOBNE", "YES YES", "KFC", "HOSICK'S 2 CHICKENS"};
        String[] menus = {"양념", "후라이드", "반반무마니", "갈릭", "파닭", "뿌링클", "핫크리스피"};
        String selectedBrand = "";

        int choice = -1;
        int selectedMenu = -1;
        int[][] menuList = {{0, 3, 5}, {1, 2, 3}, {2, 4, 6}, {1, 2, 5}, {0, 1, 3}};

        //첫 화면
        while (condition) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(
                    "오늘은 치킨이닭!" +
                            "\n어디에 전화를 걸까?" +
                            "\n1. B H C" +
                            "\n2. 또래오래" +
                            "\n3. 네네치킨" +
                            "\n4. K F C" +
                            "\n5. 호식이 2마리 치킨" +
                            "\n\n원하는 번호를 입력하고 엔터를 눌러주세요."
            );

            //선택한 메뉴 번호 입력받기
            choice = scanner.nextInt();

            if (choice < 6) {
                //선택된 브랜드 이름 받아오기
                selectedBrand = brands[choice - 1];

                //해당 브랜드의 메뉴 출력하기
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ") " + menus[menuList[choice - 1][i]]);
                }

                //선택한 메뉴 받아오기
                choice = scanner.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    selectedMenu = choice;
                    System.out.println("띵동~♬ 주문하신 " + selectedBrand + " " + menus[choice] + " 배달왔습니다~");
                    delicious();
                    System.out.println("고객님~ 맛있게 드셨나요?");
                } else {
                    System.out.println("고객님, 그 메뉴는 저희 가게에 없는데요..");
                }
            } else {
                System.out.println("1~5번까지만 선택 가능합니다");
            }

            //처음으로 되돌아갈지 물어보는 질문
            System.out.println("다시 주문하시겠어요? 1)한다 2)안 한다");

            if (scanner.nextInt() == 2) {
                condition = false;
            }

            scanner.close();
        }
    }


    //주문 시 치킨 이미지 출력
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
