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
    }
}
