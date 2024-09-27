package structureQuiz;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        // 초기화
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }


    // 3번 누를 때 출력하는 메소든
    void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                // toString() 을 Override 를 통해
                System.out.println(contact);
            }
        }
    }

    void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
