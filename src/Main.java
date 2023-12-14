public class Main {
    public static void main(String[] args) {
        //1
        byte age = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        //2
        int temperature = 4;
        if (temperature == 5){
            System.out.println("Нау улице " + temperature + "°, шапка по желанию");
        } else {
            if (temperature <= 5){
                System.out.println("На улице " + temperature + "°, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temperature + "°, можно идти без шапки");
            }
        }
        //3
        int carSpeed = 70;
        if (carSpeed == 60){
            System.out.println("Если скорость " + carSpeed + "км/ч, то лучше сбавить скорость");
        } else {
            if (carSpeed > 60){
                System.out.println("Если скорость " + carSpeed + "км/ч, то придется заплатить штраф");
            }else {
                System.out.println("Если скорость " + carSpeed + "км/ч, то можно ездить спокойно");
            }
        }
        //4
        byte ageMan = 67;
        if (ageMan <= 6 && ageMan >= 2){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        }else {
            if (ageMan <= 17 && ageMan >= 7) {
                System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
            } else {
                if (ageMan <= 24 && ageMan >= 18) {
                    System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет");
                } else {
                    if (ageMan > 25) {
                        System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить на работу");
                    } else {
                        System.out.println("Пока отдыхай");
                    }
                }
            }
        }
        //5
        byte babyAge = 5;
        if (babyAge <= 5){
            System.out.println("Если возраст ребенка равен " + babyAge + ", то ему нельзя кататься на аттракционе");
        }else {
            if (babyAge <= 14 && babyAge > 5) {
                System.out.println("Если возраст ребенка равен " + babyAge + ", то ему можно кататься на аттракционе в сопровождении");
            } else {
                System.out.println("Если возраст ребенка равен " + babyAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
        //6
        int carriageCapacity = 102;
        int seatingCapacityOfTheCarriage = 60;
        int peopleInTheCarriage = 150;
        if (peopleInTheCarriage >= carriageCapacity){
            System.out.println("В вагоне нет мест");
        }else{
            if (peopleInTheCarriage < carriageCapacity && peopleInTheCarriage > seatingCapacityOfTheCarriage){
                System.out.println("В вагоне только стоячие места");
            }else{
                System.out.println("В вагоне есть стоячие и сидячие места");

            }
        }
        //7
        int one = 12;
        int two = 21;
        int three = 22;
        if (one > two && one > three){
            System.out.println("one больше всех");
        }else {
            if (two > one && two > three){
                System.out.println("two больше всех");
            }else {
                if (three > two && three > one) {
                    System.out.println("three больше всех");
                } else {
                    if (one == two && one > three) {
                        System.out.println("one и two больше всех");
                    } else {
                        if (two > one && two == three) {
                            System.out.println("two и three больше всех");
                        } else {
                            if (three > two && three == one) {
                                System.out.println("three и one больше всех");
                            } else {
                                System.out.println("Все значения равны");

                            }
                        }
                    }
                }
            }
        }

    }
}