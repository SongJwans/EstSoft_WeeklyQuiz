package structureQuiz;

import java.util.Scanner;

public class Main {
    static void printMenu() {
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean running = true;

        while (running) {
            printMenu();

            int menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리

            switch (menu) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String businessName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String businessPhoneNumber = scanner.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    String company = scanner.nextLine();
                    addressBook.addContact(new BusinessContact(businessName, businessPhoneNumber, company));
                    break;
                case 2:
                    System.out.print("이름을 입력하세요: ");
                    String personalName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String personalPhoneNumber = scanner.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String relationship = scanner.nextLine();
                    addressBook.addContact(new PersonalContact(personalName, personalPhoneNumber, relationship));
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
            }
        }
        scanner.close();
    }
}
