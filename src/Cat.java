
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private CatColor catColor = CatColor.BLACK; // по-умолчанию кошка будет черной

    //getters and setters
    public double getOriginWeight() {
        return originWeight;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    //Создать у кошки константы “количество глаз”, “минимальный вес” и “максимальный вес”.
    private static final int CAT_EYES = 2;
    private static final int MIN_WEIGHT = 300; //gr
    private static final int MAX_WEIGHT = 10000; //gr

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

    //Создать у кошки геттер и сеттер для окраса
    public CatColor getCatColor() {
        return catColor;
    }

    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    private boolean wasAlive;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    //Создать у кошки метод создания её “глубокой” копии.
    public static Cat cloneCat(Cat oldCat) {
        Cat newCat = new Cat();
        newCat.setWeight(oldCat.getWeight());
        newCat.setOriginWeight(oldCat.getOriginWeight());
        newCat.setMinWeight(oldCat.getMinWeight());
        newCat.setMaxWeight(oldCat.getMaxWeight());
        count++;
        return newCat;
    }

    public Cat(Double weight) {
        this.weight = weight;
        count++; //просто добавил чтобы возвращать потом верное кол-во кошек
    }

    public void meow()
    {
        wasAlive = true;
        weight = weight - 1;
        System.out.println("Meow");
        if (weight < minWeight) {
            wasAlive = false;
            count--;
        }
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        eatenFood += amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
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