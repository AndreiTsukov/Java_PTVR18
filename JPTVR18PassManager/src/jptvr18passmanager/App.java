/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18passmanager;

import classes.NewResource;
import classes.NewUser;
import classes.SaveToFile;
import entity.Resource;
import entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private List<Resource> listResource = new ArrayList<>();
    private List<User> listUser = new ArrayList<>();
    private SaveToFile saveToFile = new SaveToFile();
    
    public App() {
        listResource.addAll(saveToFile.loadListResource());
        listUser.addAll(saveToFile.loadListUser());
    }
    
    public void run(){
            System.out.println("--- Менеджер паролей ---");
            String repeat = "r";
            do{
            System.out.println("Выберите задачу");
            System.out.println("0 - выйти из программы");
            System.out.println("1 - добавть ресурс");
            System.out.println("2 - список ресурсов");
            System.out.println("3 - удаление ресурса");
            System.out.println("4 - добавить пользователя");
            System.out.println("5 - список пользователей");
            System.out.println("6 - удаление пользователя");
            Scanner scanner = new Scanner(System.in);
             int Task = scanner.nextInt();
            scanner.nextLine();
                switch (Task) {
                case 0:
                    repeat = "q";
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                    System.out.println("Добавить ресурса:");
                    NewResource newResource = new NewResource();                  
                    listResource.add(newResource.createResource());
                    saveToFile.saveResource(listResource);
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    System.out.println("Список ресурсов:");
                    for(Resource r : listResource){
                        System.out.println(r.toString());
                    }
                    break;
                case 3:
                    System.out.println("Выбрана задача 3");
                    System.out.println("Удаление ресурса:");
                    int i =1;
                    for(Resource r : listResource) {
                        System.out.printf("%d. %s %n",i,r.getName());
                        i++;
                    }
                    System.out.println("Выберите номер ресурса для удаления");
                    int numDeleteResource = scanner.nextInt();
                    scanner.nextLine();
                    listResource.remove(numDeleteResource - 1);
                    this.saveToFile.saveResource(listResource);
                    break;
                case 4:
                    System.out.println("Выбрана задача 4");
                    System.out.println("Добавить пользователя:");
                    NewUser newUser = new NewUser();                  
                    listUser.add(newUser.createUser());
                    saveToFile.saveUser(listUser);
                    break;
                case 5:
                    System.out.println("Выбрана задача 5");
                    System.out.println("Список пользователей:");
                    for(User r : listUser){
                        System.out.println(r.toString());
                    }
                    break;
                case 6:
                    System.out.println("Выбрана задача 6");
                    System.out.println("Удаление пользователя:");
                    int u =1;
                    for(User r : listUser) {
                        System.out.printf("%d. %s %n",u,r.getFname());
                        u++;
                    }
                    System.out.println("Выберите номер ресурса для удаления");
                    int numDeleteUser = scanner.nextInt();
                    scanner.nextLine();
                    listUser.remove(numDeleteUser - 1);
                    saveToFile.saveUser(listUser);
                    break;
                default:
                    System.out.println("Выберите задачу");
                    break;
            }       
        }while(!"q".equals(repeat));
    }
}

