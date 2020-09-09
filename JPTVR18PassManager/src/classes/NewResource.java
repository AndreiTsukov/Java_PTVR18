/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Resource;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NewResource {
    public Resource createResource(){
        System.out.println("--- Создание нового ресурса ---");
        Resource resourse = new Resource();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя ресурса: ");
        resourse.setName(scanner.nextLine());
        System.out.print("URL ресурса: ");
        resourse.setUrl(scanner.nextLine());
        System.out.print("Логин: ");
        resourse.setLogin(scanner.nextLine());
        System.out.print("Пароль: ");
        resourse.setPassword(scanner.nextLine());
        return resourse;
    }
}
