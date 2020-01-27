
public class Loader extends Cat {
    public static void main(String[] args) {
        //Создать 5-7 кошек
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        //посмотреть, какой у них вес
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
        System.out.println();

        //попробовать их покормить и посмотреть, что будет с весом
        cat1.feed(100.0);
        System.out.println(cat1.getWeight());
        cat2.feed(200.0);
        System.out.println(cat2.getWeight());
        cat3.feed(300.0);
        System.out.println(cat3.getWeight());
        cat4.feed(400.0);
        System.out.println(cat4.getWeight());
        cat5.feed(500.0);
        System.out.println(cat5.getWeight());
        System.out.println();

        //попробовать перекормить кошку, чтобы она взорвалась
        cat1.feed(9000.0);
        System.out.println("Cat1 has status: " + cat1.getStatus());
        System.out.println();

        //"замяукать" кошку до смерти
        for (double i = cat2.getWeight(); i > 100; i--) {
            cat2.meow();
        }
        System.out.println();
        System.out.println("Cat2 has status: " + cat2.getStatus());
    }

    //создать в главном классе метод генерации кошки, как описано в видеоуроке.
    public static void createCat(Double weight) {
        Cat cat = new Cat(weight);
    }

    //Создать у кошки метод создания её “глубокой” копии.
    public void copyCat() {
        new Cat().cloneCat(this);
    }
}