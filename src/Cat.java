
public class Cat {
    private double originWeight;
    private double weight;

    private CatColor catColor = CatColor.BLACK; // по-умолчанию кошка будет черной

    //Создать у кошки геттер и сеттер для окраса
    public CatColor getCatColor() {
        return catColor;
    }

    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Создать у кошки константы “количество глаз”, “минимальный вес” и “максимальный вес”.
    private static final int CAT_EYES = 2;

    private static final int MIN_WEIGHT = 300; //gr
    private static final int MAX_WEIGHT = 10000; //gr

    public static int getMinWeight() {
        return MIN_WEIGHT;
    }

    public static int getMaxWeight() {
        return MAX_WEIGHT;
    }

    //завести переменную в классе, куда прибавлять вес еды, при каждой кормежке
    private double eatenFood;


    //Создать в классе Cat метод, который будет возвращать массу съеденной еды
    public double getEatenFood() {
        return eatenFood;
    }

    private static int count = 0;

    //статический метод getCount(), который будет возвращать количество кошек
    public static int getCount() {
        return count;
    }

    private boolean wasAlive = true;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    //Создать у кошки метод создания её “глубокой” копии.
    public static Cat cloneCat(Cat oldCat) {
        Cat newCat = new Cat();
        newCat.setWeight(oldCat.getWeight());
        newCat.setOriginWeight(oldCat.getOriginWeight());
        count++;
        return newCat;
    }

    public Cat(Double weight) {
        this.weight = weight;
        this.originWeight = weight;
        if (weight > getMaxWeight()) {
            wasAlive = false;
        } else {
            count++;
        }
    }

    public void meow() {
        if (wasAlive) {
            weight = weight - 1;
            System.out.println("Meow");
        }
        if (weight < getMinWeight()) {
            wasAlive = false;
            count--;
        }
    }

    public void feed(Double amount) {
        if (wasAlive) {
            weight = weight + amount;
            eatenFood += amount;
        }
        if (weight > getMaxWeight()) {
            wasAlive = false;
            count--;
        }
    }

    public void drink(Double amount) {
        if (wasAlive) {
            weight = weight + amount;
            eatenFood += amount;
        }
        if (weight > getMaxWeight()) {
            wasAlive = false;
            count--;
        }
    }

    public String getStatus() {
        if (weight < getMinWeight()) {
            return "Dead";
        } else if (weight > getMaxWeight()) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    int countGoToToilet = 1;

    //Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
    public void goToToilet() {
        weight--;
        System.out.println("The cat went to the toilet " + countGoToToilet + " times");
        countGoToToilet += 1;
    }
}