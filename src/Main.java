public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4.5;
        System.out.println("frog = " + frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer1 + boxer2;
        var difference = boxer2 - boxer1;
        var result = boxer2 % boxer1;
        System.out.println("Общая масса двух бойцов = " + sum + " кг");
        System.out.println("Разница масс между бойцами = " + difference + " кг");
        System.out.println("Остаток от деления = " + result);

        var hours = 640;
        var hoursforone = 8;
        var employee = hours / hoursforone;
        System.out.println("Всего работников в компании - " + employee + " человек");
        employee = employee + 94;
        System.out.println("Количество сотрудников после увеличение штата сотрудников = " + employee + " человек");
        var hoursformore = employee * hoursforone;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + hoursformore + " часов работы может быть поделено между сотрудниками");
    }
}