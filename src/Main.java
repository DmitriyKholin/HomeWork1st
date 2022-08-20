public class Main {
    public static void main(String[] args){
        // Задача 1
        int rabbit = 6;
        byte mouse = 1;
        short cat = 3;
        long elefant = 100L;
        double waterWeight = 4.5;
        float sugarWeight = 1.5f;
        boolean dogIsAdult = rabbit > 10;
        char bar = 35;
        System.out.println(dogIsAdult);


        // Задача 2
        double firstBoxer = 78.2;
        double secondBoxer =  82.7;
        double weightBoxers = firstBoxer + secondBoxer;
        double differWeight = secondBoxer - firstBoxer;
        System.out.println("Вес боксёров =  " + weightBoxers + " Разница в весе = " + differWeight);


        // Задача 3
        int banan = 5 * 80;
        int milk = 100 * 2 - 10;
        int plombir = 2 * 100;
        int eggs = 4 * 70;
        int weight = (banan + milk + plombir + eggs) / 1000;
        System.out.println("Общий вес завтрака = " + weight);

        // Задача 4
        var allWeight = 7;
        var weigtFirst = 250;
        var weightSecond = 500;
        var daysFirst = allWeight * 1000 / 250;
        var daysSecond = allWeight * 1000 / 500;
        System.out.println("Дней для похудения по 250гр = " + daysFirst + " Дней для похудения по 500гр = " + daysSecond);


        // Задача 5
        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;
        var mashaZp = masha + (masha * 10 / 100);
        var mashaZpUp = mashaZp * 12;
        var raznica = mashaZpUp - (masha * 12);
        System.out.println("Маша теперь зарабатывает  " + mashaZp + " Годовой доход вырос на  " + raznica);

    }

}