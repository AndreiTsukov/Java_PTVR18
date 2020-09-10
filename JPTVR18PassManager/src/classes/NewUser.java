/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.User;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NewUser {
    public User createUser(){
        System.out.println("--- Создание нового пользователя ---");
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя: ");
        user.setFname(scanner.nextLine());
        System.out.print("Фамилия: ");
        user.setLname(scanner.nextLine());
        System.out.print("Email: ");
        user.setEmail(scanner.nextLine());
        System.out.print("Логин: ");
        user.setLogin(scanner.nextLine());
        System.out.print("Пароль: ");
        user.setPassword(scanner.nextLine());
        return user;
    }
}
