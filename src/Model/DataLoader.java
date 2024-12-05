package Model;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<Employee> loadData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Andy", 50, Position.DEVELOPER, "Andy@gmail.com", 50000, "1234 555 22"));
        employees.add(new Employee("Sarah", 30, Position.MANAGER, "Sarah@gmail.com", 70000, "9876 555 88"));
        employees.add(new Employee("John", 45, Position.PRODUCT_OWNER, "John@gmail.com", 65000, "2468 555 11"));
        employees.add(new Employee("Emily", 38, Position.HR, "Emily@gmail.com", 55000, "3579 555 33"));
        employees.add(new Employee("David", 28, Position.DEVELOPER, "David@gmail.com", 60000, "1357 555 44"));
        employees.add(new Employee("Sophia", 32, Position.MANAGER, "Sophia@gmail.com", 75000, "6789 555 55"));
        employees.add(new Employee("Michael", 40, Position.PRODUCT_OWNER, "Michael@gmail.com", 70000, "2345 555 66"));
        employees.add(new Employee("Laura", 29, Position.HR, "Laura@gmail.com", 52000, "8765 555 77"));
        employees.add(new Employee("James", 37, Position.DEVELOPER, "James@gmail.com", 62000, "1122 555 88"));
        employees.add(new Employee("Isabella", 26, Position.MANAGER, "Isabella@gmail.com", 77000, "2233 555 99"));
        employees.add(new Employee("Lucas", 35, Position.PRODUCT_OWNER, "Lucas@gmail.com", 68000, "3344 555 00"));
        employees.add(new Employee("Charlotte", 42, Position.HR, "Charlotte@gmail.com", 54000, "4455 555 11"));
        employees.add(new Employee("Ethan", 33, Position.DEVELOPER, "Ethan@gmail.com", 59000, "5566 555 22"));
        employees.add(new Employee("Amelia", 31, Position.MANAGER, "Amelia@gmail.com", 71000, "6677 555 33"));
        employees.add(new Employee("Benjamin", 49, Position.PRODUCT_OWNER, "Benjamin@gmail.com", 73000, "7788 555 44"));
        employees.add(new Employee("Ava", 27, Position.HR, "Ava@gmail.com", 51000, "8899 555 55"));
        employees.add(new Employee("Henry", 48, Position.DEVELOPER, "Henry@gmail.com", 65000, "9900 555 66"));
        employees.add(new Employee("Lily", 39, Position.MANAGER, "Lily@gmail.com", 76000, "1011 555 77"));
        employees.add(new Employee("Jack", 34, Position.PRODUCT_OWNER, "Jack@gmail.com", 69000, "2022 555 88"));
        employees.add(new Employee("Mia", 41, Position.HR, "Mia@gmail.com", 54000, "3033 555 99"));
        employees.add(new Employee("Oliver", 33, Position.DEVELOPER, "Oliver@gmail.com", 58000, "4044 555 00"));
        employees.add(new Employee("Ella", 29, Position.MANAGER, "Ella@gmail.com", 70000, "5055 555 11"));
        employees.add(new Employee("William", 43, Position.PRODUCT_OWNER, "William@gmail.com", 74000, "6066 555 22"));
        employees.add(new Employee("Harper", 25, Position.HR, "Harper@gmail.com", 50000, "7077 555 33"));
        employees.add(new Employee("Jack", 36, Position.DEVELOPER, "JackJ@gmail.com", 62000, "8188 555 44"));
        employees.add(new Employee("Grace", 30, Position.MANAGER, "Grace@gmail.com", 69000, "9299 555 55"));
        employees.add(new Employee("Samuel", 41, Position.PRODUCT_OWNER, "Samuel@gmail.com", 72000, "1033 555 66"));
        employees.add(new Employee("Zoe", 32, Position.HR, "Zoe@gmail.com", 53000, "2144 555 77"));
        employees.add(new Employee("Elijah", 44, Position.DEVELOPER, "Elijah@gmail.com", 67000, "3255 555 88"));
        employees.add(new Employee("Chloe", 28, Position.MANAGER, "Chloe@gmail.com", 71000, "4366 555 99"));
        employees.add(new Employee("Daniel", 39, Position.PRODUCT_OWNER, "Daniel@gmail.com", 74000, "5477 555 00"));
        employees.add(new Employee("Sophie", 27, Position.HR, "Sophie@gmail.com", 52000, "6588 555 11"));
        employees.add(new Employee("Michael", 50, Position.DEVELOPER, "Mike@gmail.com", 63000, "7699 555 22"));
        employees.add(new Employee("Emma", 34, Position.MANAGER, "Emma@gmail.com", 75000, "8800 555 33"));
        employees.add(new Employee("Sophia", 38, Position.PRODUCT_OWNER, "SophiaE@gmail.com", 71000, "9911 555 44"));
        employees.add(new Employee("Mason", 26, Position.HR, "Mason@gmail.com", 55000, "1022 555 55"));
        employees.add(new Employee("Natalie", 33, Position.DEVELOPER, "Natalie@gmail.com", 59000, "2133 555 66"));
        employees.add(new Employee("Isaac", 45, Position.MANAGER, "Isaac@gmail.com", 72000, "3244 555 77"));
        employees.add(new Employee("Clara", 32, Position.PRODUCT_OWNER, "Clara@gmail.com", 68000, "4355 555 88"));
        employees.add(new Employee("Leo", 40, Position.HR, "Leo@gmail.com", 54000, "5466 555 99"));
        employees.add(new Employee("Ruby", 35, Position.DEVELOPER, "Ruby@gmail.com", 62000, "6577 555 00"));
        employees.add(new Employee("Maya", 30, Position.MANAGER, "Maya@gmail.com", 71000, "7688 555 11"));
        employees.add(new Employee("Liam", 41, Position.PRODUCT_OWNER, "Liam@gmail.com", 69000, "8799 555 22"));
        employees.add(new Employee("Ella", 29, Position.HR, "EllaH@gmail.com", 55000, "9900 555 33"));
        employees.add(new Employee("Max", 37, Position.DEVELOPER, "Max@gmail.com", 58000, "1111 555 44"));
        employees.add(new Employee("Nina", 33, Position.MANAGER, "Nina@gmail.com", 72000, "2222 555 55"));
        employees.add(new Employee("Chris", 29, Position.PRODUCT_OWNER, "Chris@gmail.com", 70000, "3333 555 66"));
        employees.add(new Employee("Jasmine", 45, Position.HR, "Jasmine@gmail.com", 65000, "4444 555 77"));
        employees.add(new Employee("Sophia", 26, Position.DEVELOPER, "SophiaS@gmail.com", 58000, "5555 555 88"));
        employees.add(new Employee("Nash", 34, Position.MANAGER, "Nash@gmail.com", 71000, "6666 555 99"));
        employees.add(new Employee("Lucas", 41, Position.PRODUCT_OWNER, "LucasP@gmail.com", 74000, "7777 555 00"));
        employees.add(new Employee("Hannah", 36, Position.HR, "Hannah@gmail.com", 57000, "8888 555 11"));
        employees.add(new Employee("Oliver", 30, Position.DEVELOPER, "OliverX@gmail.com", 60000, "9999 555 22"));
        employees.add(new Employee("Sophia", 39, Position.MANAGER, "SophiaR@gmail.com", 74000, "1010 555 33"));
        employees.add(new Employee("John", 32, Position.PRODUCT_OWNER, "JohnB@gmail.com", 71000, "1111 555 44"));
        employees.add(new Employee("Zara", 33, Position.HR, "Zara@gmail.com", 63000, "2222 555 55"));
        employees.add(new Employee("Parker", 37, Position.DEVELOPER, "Parker@gmail.com", 62000, "3333 555 66"));
        employees.add(new Employee("Luna", 28, Position.MANAGER, "Luna@gmail.com", 68000, "4444 555 77"));
        employees.add(new Employee("Ryan", 41, Position.PRODUCT_OWNER, "Ryan@gmail.com", 75000, "5555 555 88"));
        employees.add(new Employee("Isla", 27, Position.HR, "Isla@gmail.com", 52000, "6666 555 99"));
        employees.add(new Employee("Ethan", 42, Position.DEVELOPER, "EthanX@gmail.com", 59000, "7777 555 00"));

        return employees;
    }
}
