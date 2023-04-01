public class FacultyHufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public FacultyHufflepuff(String fullName, int thePowerOfSorcery, int transgressAtADistance, int hardworking, int loyal, int honest) {
        super(fullName, thePowerOfSorcery, transgressAtADistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return fullName +
                ": трудолюбие = " + hardworking +
                ", верность = " + loyal +
                ", честность = " + honest + '\'' +
                ", мощьность колдовства = " + thePowerOfSorcery +
                ", перемещение = " + transgressAtADistance +
                '}';
    }

    private int getAbilitiesSum() {
        return hardworking + loyal + honest;
    }

    public static void compare(FacultyHufflepuff student1, FacultyHufflepuff student2) {
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();

        if (student1Sum > student2Sum) {
            System.out.println("Студент " + student1.getFullName() + " лучше, чем студент " + student2.getFullName());
        } else if (student2Sum > student1Sum) {
            System.out.println("Студент " + student2.getFullName() + " лучше, чем студент " + student1.getFullName());
        } else {
            System.out.println("Студент " + student1.getFullName() + " и студент " + student2.getFullName() + " одинаково хороши");
        }
    }
}
