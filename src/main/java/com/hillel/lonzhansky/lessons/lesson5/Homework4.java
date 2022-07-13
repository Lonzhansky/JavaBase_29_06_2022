package com.hillel.lonzhansky.lessons.lesson5;

public class Homework4 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task2() {
        String str1 = personInfo("Will", "Smith", "New York", "+380" + 934035220);
        String str2 = personInfo("Jackie", "Chan", "Shanghai", "+3423423423");
        String str3 = personInfo("Sherlock", "Holmes", "London", "523532523");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {
//        String result = "Позвонить гражданину + " + name + " " + surname + "  из города  " + city + " можно по номеру " + phoneNumber;
        return "Позвонить гражданину + " + name + " " + surname + "  из города  " + city + " можно по номеру " + phoneNumber;
    }

    static void task1() {
        String type = "Jet";
        String type2 = "Boeing";
        String name = "F52";
        String name2 = "747";
        int firstClassPassengers = 25;
        int secondClassPassengers = 300;

        String str1 = buildAirplane(type, name);
        System.out.println(str1);
        buildAirplane(type2, name2, secondClassPassengers);
        buildAirplane(type2, name2, secondClassPassengers, firstClassPassengers);
    }

    static String buildAirplane(String type, String name) {
//        System.out.println("истребители: " + type + " " + name);
//        String result = "истребители: " + type + " " + name;
//        return result;

        return "истребители: " + type + " " + name;
    }

    static void buildAirplane(String type, String name, int yyy) {
        System.out.println("пассажирские без бизнес класса: " + type + " " + name + " кол. пассажиров 2-го класса: " + yyy);
    }

    static void buildAirplane(String type, String name, int secondClassPassengers, int firstClassPassengers) {
        System.out.println("пассажирские с бизнес классом: " + type + " " + name + " кол. пассажиров 1 класса: " + firstClassPassengers
                + " кол. пассажиров 2-го класса: " + secondClassPassengers);
    }





}
