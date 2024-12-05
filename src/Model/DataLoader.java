package Model;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<Employee> loadData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Andy Tran", 50, Position.DEVELOPER, "Andy@companymail.com", 50000, "1234 555 22"));
        employees.add(new Employee("Andy Basin", 50, Position.MANAGER, "Andy2@companymail.com", 3500, "444 111 22"));
        employees.add(new Employee("Sarah", 30, Position.MANAGER, "Sarah@companymail.com", 70000, "9876 555 88"));
        employees.add(new Employee("John", 45, Position.PRODUCT_OWNER, "John@companymail.com", 65000, "2468 555 11"));
        employees.add(new Employee("Emily", 38, Position.HR, "Emily@companymail.com", 55000, "3579 555 33"));
        employees.add(new Employee("David", 28, Position.DEVELOPER, "David@companymail.com", 60000, "1357 555 44"));
        employees.add(new Employee("Sophia", 32, Position.MANAGER, "Sophia@companymail.com", 75000, "6789 555 55"));
        employees.add(new Employee("Michael", 40, Position.PRODUCT_OWNER, "Michael@companymail.com", 70000, "2345 555 66"));
        employees.add(new Employee("Laura", 29, Position.HR, "Laura@companymail.com", 52000, "8765 555 77"));
        employees.add(new Employee("James", 37, Position.DEVELOPER, "James@companymail.com", 62000, "1122 555 88"));
        employees.add(new Employee("Isabella", 26, Position.MANAGER, "Isabella@companymail.com", 77000, "2233 555 99"));
        employees.add(new Employee("Lucas", 35, Position.PRODUCT_OWNER, "Lucas@companymail.com", 68000, "3344 555 00"));
        employees.add(new Employee("Charlotte", 42, Position.HR, "Charlotte@companymail.com", 54000, "4455 555 11"));
        employees.add(new Employee("Ethan", 33, Position.DEVELOPER, "Ethan@companymail.com", 59000, "5566 555 22"));
        employees.add(new Employee("Amelia", 31, Position.MANAGER, "Amelia@companymail.com", 71000, "6677 555 33"));
        employees.add(new Employee("Benjamin", 49, Position.PRODUCT_OWNER, "Benjamin@companymail.com", 73000, "7788 555 44"));
        employees.add(new Employee("Ava", 27, Position.HR, "Ava@companymail.com", 51000, "8899 555 55"));
        employees.add(new Employee("Henry", 48, Position.DEVELOPER, "Henry@companymail.com", 65000, "9900 555 66"));
        employees.add(new Employee("Lily", 39, Position.MANAGER, "Lily@companymail.com", 76000, "1011 555 77"));
        employees.add(new Employee("Jack", 34, Position.PRODUCT_OWNER, "Jack@companymail.com", 69000, "2022 555 88"));
        employees.add(new Employee("Mia", 41, Position.HR, "Mia@companymail.com", 54000, "3033 555 99"));
        employees.add(new Employee("Oliver", 33, Position.DEVELOPER, "Oliver@companymail.com", 58000, "4044 555 00"));
        employees.add(new Employee("Ella", 29, Position.MANAGER, "Ella@companymail.com", 70000, "5055 555 11"));
        employees.add(new Employee("William", 43, Position.PRODUCT_OWNER, "William@companymail.com", 74000, "6066 555 22"));
        employees.add(new Employee("Harper", 25, Position.HR, "Harper@companymail.com", 50000, "7077 555 33"));
        employees.add(new Employee("Jack", 36, Position.DEVELOPER, "JackJ@companymail.com", 62000, "8188 555 44"));
        employees.add(new Employee("Grace", 30, Position.MANAGER, "Grace@companymail.com", 69000, "9299 555 55"));
        employees.add(new Employee("Samuel", 41, Position.PRODUCT_OWNER, "Samuel@companymail.com", 72000, "1033 555 66"));
        employees.add(new Employee("Zoe", 32, Position.HR, "Zoe@companymail.com", 53000, "2144 555 77"));
        employees.add(new Employee("Elijah", 44, Position.DEVELOPER, "Elijah@companymail.com", 67000, "3255 555 88"));
        employees.add(new Employee("Chloe", 28, Position.MANAGER, "Chloe@companymail.com", 71000, "4366 555 99"));
        employees.add(new Employee("Daniel", 39, Position.PRODUCT_OWNER, "Daniel@companymail.com", 74000, "5477 555 00"));
        employees.add(new Employee("Sophie", 27, Position.HR, "Sophie@companymail.com", 52000, "6588 555 11"));
        employees.add(new Employee("Michael", 50, Position.DEVELOPER, "Mike@companymail.com", 63000, "7699 555 22"));
        employees.add(new Employee("Emma", 34, Position.MANAGER, "Emma@companymail.com", 75000, "8800 555 33"));
        employees.add(new Employee("Sophia", 38, Position.PRODUCT_OWNER, "SophiaE@companymail.com", 71000, "9911 555 44"));
        employees.add(new Employee("Mason", 26, Position.HR, "Mason@companymail.com", 55000, "1022 555 55"));
        employees.add(new Employee("Natalie", 33, Position.DEVELOPER, "Natalie@companymail.com", 59000, "2133 555 66"));
        employees.add(new Employee("Isaac", 45, Position.MANAGER, "Isaac@companymail.com", 72000, "3244 555 77"));
        employees.add(new Employee("Clara", 32, Position.PRODUCT_OWNER, "Clara@companymail.com", 68000, "4355 555 88"));
        employees.add(new Employee("Leo", 40, Position.HR, "Leo@companymail.com", 54000, "5466 555 99"));
        employees.add(new Employee("Ruby", 35, Position.DEVELOPER, "Ruby@companymail.com", 62000, "6577 555 00"));
        employees.add(new Employee("Maya", 30, Position.MANAGER, "Maya@companymail.com", 71000, "7688 555 11"));
        employees.add(new Employee("Liam", 41, Position.PRODUCT_OWNER, "Liam@companymail.com", 69000, "8799 555 22"));
        employees.add(new Employee("Ella", 29, Position.HR, "EllaH@companymail.com", 55000, "9900 555 33"));
        employees.add(new Employee("Max", 37, Position.DEVELOPER, "Max@companymail.com", 58000, "1111 555 44"));
        employees.add(new Employee("Nina", 33, Position.MANAGER, "Nina@companymail.com", 72000, "2222 555 55"));
        employees.add(new Employee("Chris", 29, Position.PRODUCT_OWNER, "Chris@companymail.com", 70000, "3333 555 66"));
        employees.add(new Employee("Jasmine", 45, Position.HR, "Jasmine@companymail.com", 65000, "4444 555 77"));
        employees.add(new Employee("Sophia", 26, Position.DEVELOPER, "SophiaS@companymail.com", 58000, "5555 555 88"));
        employees.add(new Employee("Nash", 34, Position.MANAGER, "Nash@companymail.com", 71000, "6666 555 99"));
        employees.add(new Employee("Lucas", 41, Position.PRODUCT_OWNER, "LucasP@companymail.com", 74000, "7777 555 00"));
        employees.add(new Employee("Hannah", 36, Position.HR, "Hannah@companymail.com", 57000, "8888 555 11"));
        employees.add(new Employee("Oliver", 30, Position.DEVELOPER, "Oliver2@companymail.com", 60000, "9999 555 22"));
        employees.add(new Employee("Sophia", 39, Position.MANAGER, "SophiaR@companymail.com", 74000, "1010 555 33"));
        employees.add(new Employee("John", 32, Position.PRODUCT_OWNER, "JohnB@companymail.com", 71000, "1111 555 44"));
        employees.add(new Employee("Zara", 33, Position.HR, "Zara@companymail.com", 63000, "2222 555 55"));
        employees.add(new Employee("Parker", 37, Position.DEVELOPER, "Parker@companymail.com", 62000, "3333 555 66"));
        employees.add(new Employee("Luna", 28, Position.MANAGER, "Luna@companymail.com", 68000, "4444 555 77"));
        employees.add(new Employee("Ryan", 41, Position.PRODUCT_OWNER, "Ryan@companymail.com", 75000, "5555 555 88"));
        employees.add(new Employee("Isla", 27, Position.HR, "Isla@companymail.com", 52000, "6666 555 99"));
        employees.add(new Employee("Ethan", 42, Position.DEVELOPER, "EthanX@companymail.com", 59000, "7777 555 00"));

        return employees;
    }
}
