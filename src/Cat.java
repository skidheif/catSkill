
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private static int count = 0;

    //Создать у кошки константы “количество глаз”, “минимальный вес” и “максимальный вес”.
    private static final int CAT_EYES = 2;
    private static final int MIN_WEIGHT = 300; //gr
    private static final int MAX_WEIGHT = 10000; //gr

    //статический метод getCount(), который будет возвращать количество кошек
    public static int getCount() {
        return count;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
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
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    //Создать в классе Cat метод, который будет возвращать массу съеденной еды
    public Double returnFeedCount(Double amount) {
        double weightBefore = weight;
        feed(amount);
        double weightAfter = getWeight();
        return weightAfter - weightBefore;
    }

    //Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
    public void goToToilet() {
        int count = 1;
        weight--;
        System.out.println("The cat went to the toilet " + count + " times");
        count++;
    }
}