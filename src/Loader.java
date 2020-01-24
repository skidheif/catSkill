
public class Loader {
    public static void main(String[] args) {

        //Урок 2. Метод, параметры, return - Готово
        Cat cat = new Cat();
        System.out.println(Cat.getCount());
        System.out.println(cat.getWeight());
        cat.feed(100.0);
        cat.feed(10.0);
        cat.drink(50.0);
        System.out.println("Кот сьел еды: " + cat.getEatenFood()); // Кот сьел еды: 110

        System.out.println(cat.getWeight());
        //"замяукать" кошку до смерти
        for (double i = cat.getWeight(); i > 1000; i--) {
            cat.meow();
        }
        System.out.println();
        System.out.println("Cat has status: " + cat.getStatus());
        System.out.println(Cat.getCount());
        System.out.println(cat.getWeight());
        cat.feed(700.0);
        System.out.println(cat.getWeight());
        System.out.println("Cat has status: " + cat.getStatus());
        System.out.println(Cat.getCount());
        System.out.println();
        System.out.println();
        Cat cat2 = new Cat();
        System.out.println(Cat.getCount());
        System.out.println(cat2.getWeight());
        cat2.feed(9000.0);
        System.out.println("Кот2 сьел еды: " + cat2.getEatenFood());
        System.out.println(cat2.getWeight());
        cat2.goToToilet();
        cat2.goToToilet();
        cat2.goToToilet();
        System.out.println(cat2.getWeight());


//        //Создать 5-7 кошек
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();
//        Cat cat4 = new Cat();
//        Cat cat5 = new Cat();
//
//        //посмотреть, какой у них вес
//        System.out.println(cat1.getWeight());
//        System.out.println(cat2.getWeight());
//        System.out.println(cat3.getWeight());
//        System.out.println(cat4.getWeight());
//        System.out.println(cat5.getWeight());
//        System.out.println();
//
//        //попробовать их покормить и посмотреть, что будет с весом
//        cat1.feed(100.0);
//        System.out.println(cat1.getWeight());
//        cat2.feed(200.0);
//        System.out.println(cat2.getWeight());
//        cat3.feed(300.0);
//        System.out.println(cat3.getWeight());
//        cat4.feed(400.0);
//        System.out.println(cat4.getWeight());
//        cat5.feed(500.0);
//        System.out.println(cat5.getWeight());
//        System.out.println();
//
//        //попробовать перекормить кошку, чтобы она взорвалась
//        cat1.feed(9000.0);
//        System.out.println("Cat1 has status: " + cat1.getStatus());
//        System.out.println();
//
//        //"замяукать" кошку до смерти
//        for (double i = cat2.getWeight(); i > 1000; i--) {
//            cat2.meow();
//        }
//        System.out.println();
//        System.out.println("Cat2 has status: " + cat2.getStatus());
//    }
//
//    //создать в главном классе метод генерации кошки, как описано в видеоуроке.
//    public static void createCat(Double weight) {
//        Cat cat = new Cat(weight);
//    }
//
//    //Создать у кошки метод создания её “глубокой” копии.
//    public static void cloneCat(double weight, double originWeight, double minWeight, double maxWeight) {
//        Cat cat = new Cat(weight, originWeight, minWeight, maxWeight);
//    }
    }
}