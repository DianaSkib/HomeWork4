//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// #1
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно подождать.");
        }
        /// #2
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов.");
        } else {
            System.out.println("На улице " + temperature + " градусов, сегодня тепло, можно идти без шапки.");
        }
        /// №3
        int speed = 45;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " , то то придется заплатить штраф.");
        }
        /// #4
        int years = 22;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
        }
        /// #5
        int childsAge = 15;
        boolean adult = true;

        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему нельзя кататься на аттракционе.");
        }  else if (childsAge > 5 && childsAge < 14 && adult) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему нельзя кататься без сопровождения взрослого.");
        } else if (childsAge > 14){
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься без сопровождения взрослого.");
        }

        /// #6
        int peopleInVan = 103;
        int carriageCapacity = 102;
        int seatingPositions = 60;
        int standingPositions = carriageCapacity - seatingPositions;

        if (peopleInVan < seatingPositions) {
            System.out.println("Есть сидячие места.");
        } else if (peopleInVan >= seatingPositions && peopleInVan <= carriageCapacity) {
            System.out.println("Сидячих мест нет. Остались только стоячие места.");
        } else if (peopleInVan > seatingPositions && peopleInVan > standingPositions) {
            System.out.println("Вагон полностью занят.");
        }

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one < three) {
            System.out.println("one наибольшее число.");
        } else if (two > three) {
            System.out.println("two наибольшее число.");
        } else {
            System.out.println("three наибольшее число.");
        }
    }
}
