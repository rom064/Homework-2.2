public class Main {
    public static void main(String[] args) {
        FacultyGryffindor harryPotter = new FacultyGryffindor("Гари Потер", 90, 70, 60, 80, 90);
        FacultyGryffindor hermioneGranger = new FacultyGryffindor("Гермиона Грейнджер", 100, 80, 70, 80, 60);
        FacultyGryffindor ronWeasley = new FacultyGryffindor("Рон Уизли", 60, 50, 70, 80, 70);
        FacultySlytherin dracoMalfoy = new FacultySlytherin("Драко Малфой", 70, 80, 60, 70, 90, 60, 80);
        FacultySlytherin grahamMontague = new FacultySlytherin("Грэхэм Монтегю", 50, 60, 40, 80, 70, 60, 90);
        FacultySlytherin gregoryGoyle = new FacultySlytherin("Грегори Гойл", 60, 50, 70, 80, 50, 80, 60);
        FacultyHufflepuff zachariahSmith = new FacultyHufflepuff("Захария Смит", 70, 60, 50, 80, 90);
        FacultyHufflepuff cedricDiggory = new FacultyHufflepuff(" Седрик Диггори", 80, 70, 50, 90, 70);
        FacultyHufflepuff justinFinchFletchley = new FacultyHufflepuff("Джастин Финч-Флетчли", 60, 50, 80, 90, 70);
        FacultyRavenclaw zhouChang = new FacultyRavenclaw("Чжоу Чанг", 50, 80, 70, 60, 50, 40);
        FacultyRavenclaw padmaPatil = new FacultyRavenclaw("Падма Патил", 70, 80, 50, 60, 80, 90);
        FacultyRavenclaw marcusBelby = new FacultyRavenclaw("Маркус Белби", 70, 80, 90, 40, 60, 90);

        System.out.println(harryPotter);
        FacultyGryffindor.compare(ronWeasley, harryPotter);
        FacultyHufflepuff.compare(zachariahSmith, justinFinchFletchley);
        FacultyRavenclaw.compare(padmaPatil, marcusBelby);
        FacultySlytherin.compare(dracoMalfoy, gregoryGoyle);
        Hogwarts.compare(cedricDiggory, hermioneGranger);
    }
}