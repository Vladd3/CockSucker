//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args ){
        //Создаем объект класса Greeting
        Greeting greeting = new Greeting();

        //Вызываем метод getGreeting и выводим результат на экран
        System.out.println(greeting.getGreeting());

        DrystalCacals drystalCacals = new DrystalCacals();
        System.out.println(drystalCacals.getDrystalCacals());

        //Boobs boobs = new Boobs();
        //System.out.println(boobs.getBoobs());

        Alive alive = new Alive();
                System.out.println(alive.getAlive());

                Multi multi = new Multi();
                System.out.println(multi.getMultiNumber());

        }
    }
