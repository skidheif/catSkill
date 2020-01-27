
public class Cat {

    //Создать у кошки константы “количество глаз”, “минимальный вес” и “максимальный вес”.
    private static final int CAT_EYES = 2;
    private static final int MIN_WEIGHT = 300; //gr
    private static final int MAX_WEIGHT = 10000; //gr

    private static int count = 0;

    private double originWeight;
    private double weight;
    private CatColor catColor = CatColor.BLACK; // по-умолчанию кошка будет черной
    //завести переменную в классе, куда прибавлять вес еды, при каждой кормежке
    private double eatenFood;
    private boolean wasAlive = true;

    public static int getMinWeight() {
        return MIN_WEIGHT;
    }

    public static int getMaxWeight() {
        return MAX_WEIGHT;
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

    //Создать у кошки геттер и сеттер для окраса
    public CatColor getCatColor() {
        return catColor;
    }

    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    //Создать в классе Cat метод, который будет возвращать массу съеденной еды
    public double getEatenFood() {
        return eatenFood;
    }

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(Double weight) {
        this.weight = weight;
        this.originWeight = weight;
        if (weight > getMaxWeight() || weight < getMinWeight()) {
            wasAlive = false;
        } else {
            if (count < 0) {
                count = 0;
            }
            count++;
        }
    }

    //статический метод getCount(), который будет возвращать количество кошек
    public static int getCount() {
        return count;
    }

    //Создать у кошки метод создания её “глубокой” копии.
    public Cat cloneCat(Cat oldCat) {
        Cat newCat = new Cat(oldCat.getWeight());
        newCat.setWeight(oldCat.getWeight());
        newCat.setOriginWeight(oldCat.getOriginWeight());
        return newCat;
    }


    public void meow() {
        if (wasAlive) {
            weight = weight - 1;
            System.out.println("Meow");
        }
        if (weight < getMinWeight()) {
            wasAlive = false;
        }
        if (count <= 0) {
            count++;
        }
        if (getStatus().equalsIgnoreCase("Exploded") ||
                getStatus().equalsIgnoreCase("Dead")) {
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
        }
        if (count <= 0) {
            count++;
        }
        if (getStatus().equalsIgnoreCase("Exploded") ||
                getStatus().equalsIgnoreCase("Dead")) {
            count--;
        }
    }

    public void drink(Double amount) {
        if (wasAlive) {
            weight = weight + amount;
        }
        if (weight > getMaxWeight()) {
            wasAlive = false;
        }
        if (count <= 0) {
            count++;
        }
        if (getStatus().equalsIgnoreCase("Exploded") ||
                getStatus().equalsIgnoreCase("Dead")) {
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
        if (getWeight() > getMinWeight() && getWeight() < getMaxWeight()) {
            weight--;
            System.out.println("The cat went to the toilet " + countGoToToilet + " times");
            countGoToToilet += 1;
        } else System.out.println("Sorry, your cat is dead!");
    }
}