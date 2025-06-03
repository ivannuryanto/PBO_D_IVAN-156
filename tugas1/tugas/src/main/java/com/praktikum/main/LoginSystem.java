package main.java.com.praktikum.main;

import main.java.com.praktikum.users.*;
import main.java.com.praktikum.data.*;

public class LoginSystem {
    public LoginSystem() {
        initializeData();
    }

    private void initializeData() {
        DataStore.userList.add(new Admin("Ivan Nuryanto", "202410370110156", "admin156", "admin156"));
        DataStore.userList.add(new Admin("Brillian Daniar Kautama", "202410370110166", "admin166", "admin166"));
       
        DataStore.userList.add(new Mahasiswa("Ivan Nuryanto", "202410370110156"));
        DataStore.userList.add(new Mahasiswa("Brillian Daniar Kautama", "202410370110166"));
        DataStore.userList.add(new Mahasiswa("Asep Kurniawan", "202410370110122"));

        DataStore.reportedItems.add(new Item("Laptop", "Laptop hilang di kampus", "Kampus", "Reported"));
        DataStore.reportedItems.add(new Item("Buku", "Buku hilang di perpustakaan", "Perpustakaan", "Reported"));
        DataStore.reportedItems.add(new Item("Kunci", "Kunci hilang di parkiran", "Parkiran", "Claimed"));

    }

    public static User cariUser(String input1, String input2, boolean isAdmin) {
        for (User usr : DataStore.userList) {
            if (isAdmin && usr instanceof Admin) {
                if (((Admin) usr).login(input1, input2))
                    return usr;
            } else if (!isAdmin && usr instanceof Mahasiswa) {
                if (((Mahasiswa) usr).login(input1, input2))
                    return usr;
            }
        }
        return null;
    }
}