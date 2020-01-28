
public class Cat {

    //Создать у кошки константы “количество глаз”, “минимальный вес” и “максимальный вес”.
    public static final int CAT_EYES = 2;
    public static final int MIN_WEIGHT = 300; //gr
    public static final int MAX_WEIGHT = 10000; //gr

    private static int count = 0;

    private double originWeight;
    private double weight;
    private CatColor catColor = CatColor.BLACK; // по-умолчанию кошка будет черной
    //завести переменную в классе, куда прибавлять вес еды, при каждой кормежке
    private double eatenFood;
    private boolean wasAlive = true;
    private int countGoToToilet = 1;

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
        if (weight > MAX_WEIGHT || weight < MIN_WEIGHT) {
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

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }


    public void meow() {
        if (wasAlive) {
            weight--;
            System.out.println("Meow");
            if (weight < MIN_WEIGHT) {
                wasAlive = false;
                count--;
            }
        }
        if (!wasAlive && getStatus().equals("Dead") ||
                getStatus().equals("Exploded")) {
            System.out.println("Your cat is dead, sorry it can't do meow again" + "\n");
        }
    }

    public void feed(Double amount) {
        if (wasAlive) {
            weight = weight + amount;
            eatenFood += amount;
            if (weight > MAX_WEIGHT) {
                wasAlive = false;
                count--;
            }
        }
        if (!wasAlive && getStatus().equals("Dead") ||
                getStatus().equals("Exploded")) {
            System.out.println("Your cat is dead, sorry but you can't feed it" + "\n");
        }
    }

    public void drink(Double amount) {
        if (wasAlive) {
            weight = weight + amount;
            if (weight > MAX_WEIGHT) {
                wasAlive = false;
                count--;
            }
        }
        if (!wasAlive && getStatus().equals("Dead") ||
                getStatus().equals("Exploded")) {
            System.out.println("Your cat is dead, sorry but you can't give water to it" + "\n");
        }
    }


    //Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
    public void goToToilet() {
        if (wasAlive) {
            weight--;
            System.out.println("The cat went to the toilet " + countGoToToilet + " times");
            countGoToToilet += 1;
            if (weight < MIN_WEIGHT) {
                wasAlive = false;
                count--;
            }
        }
        if (!wasAlive && getStatus().equals("Dead") ||
                getStatus().equals("Exploded")) {
            System.out.println("Your cat is dead, sorry but it can't go to toilet" + "\n");
        }
    }
}