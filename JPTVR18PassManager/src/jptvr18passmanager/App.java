/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18passmanager;

import entity.Resourse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private List<Resourse> listResourse = new ArrayList<>();
    public void run(){
            System.out.println("--- Менеджер паролей ---");
            String repeat = "r";
            do{
            System.out.println("Выберите задачу");
            System.out.println("0 - выйти из программы");
            System.out.println("1 - добавть ресурс");
            System.out.println("2 - список ресурсов");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = "q";

                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                    Resourse resource = new Resourse();
                    resource.setName("ivkhk");
                    resource.setUrl("http://kutsehariduskeskus.ee");
                    resource.setLogin("admin");
                    resource.setPassword("12345");
                    listResourse.add(resource);
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    System.out.println("Список ресурсов:");
                    for(Resourse r : listResourse){
                        System.out.println(r.toString());
                    }
                    break;
            }       
        }while(!"q".equals(repeat));
    }
}

