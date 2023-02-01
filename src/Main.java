public class Main {
    public static void main(String[] args) {
        int eaters = 5;

        int water = 3000;
        int potatoes = 5;
        int chicken = 6;
        int spices = 10;

        System.out.println("Сварил суп. На одного вышло:");
        System.out.println((water + eaters) + "Миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин(а)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ка) специй");
    }
}
