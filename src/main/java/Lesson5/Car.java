package Lesson5;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private static boolean isWin = false;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public void isSbdWin(Car car) {
        if (isWin == false) {
            isWin = true;
            System.out.println(car.name + " WIN");
        }
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));

            MainClass.start.countDown();
            MainClass.start.await();

            System.out.println(this.name + " готов");

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            isSbdWin(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}