//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
    var dog = 8.0;
    System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);
        //Задача 2
        var result1 = dog + 4;
        System.out.println(result1);
        var result2 = cat + 4;
        System.out.println(result2);
        var result3 = paper + 4;
        System.out.println(result3);
        //Задача 3
            var result4 = dog - 3.5;
            System.out.println(result4);
            var result5 = cat - 1.6;
            System.out.println(result5);
            var result6 = paper - 7639;
            System.out.println(result6);
        //Задача 4
    var friend = 19;
    System.out.println("friend = "+friend);
    var newFriend = friend + 2;
    System.out.println("newFriend = "+newFriend);
    var oldFriend = newFriend/7;
    System.out.println("oldFriend = "+oldFriend);
        //Задача 5
        var frog = 3.5;
        var frog1 = frog * 10;
        var frog2 = frog1 / 3.5;
        var frog3 = frog2 + 4;
        System.out.println(frog);
        System.out.println(frog1);
        System.out.println(frog2);
        System.out.println(frog3);
        //Задача 6
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var netFightersWight = fighterWeight2+fighterWeight1;
        var diffFightersNet = fighterWeight2-fighterWeight1;
        System.out.println("Общая масса двух бойцов = "+ netFightersWight);
        System.out.println("Разница между массами бойцов = "+diffFightersNet);
        //Задача 7
        var fightersRemains = fighterWeight2 % fighterWeight1;
        System.out.println("Остаток от деления между двумя весами = " + fightersRemains);
        //Задача 8
        var workHours = 640;
        var workers = workHours/8;
        System.out.println("Всего работников в копмании - " + workers + " человек");
        var workers2 = 94;
        var workHours2 = workHours / workers2;
        System.out.println("Если в компании работает "+ workers2 + " человек, то всего " + workHours2 + " часов работы может быть поделено между сотрудниками.");

    }
}