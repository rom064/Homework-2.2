public class FacultyRavenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public FacultyRavenclaw(String fullName, int thePowerOfSorcery, int transgressAtADistance, int smart, int wise, int witty, int creativity) {
        super(fullName, thePowerOfSorcery, transgressAtADistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return fullName +
                ": ум = " + smart +
                ", мудрость = " + wise +
                ", остроумие = " + witty +
                ",  творчество = " + creativity + '\'' +
                ", мощьность колдовства = " + thePowerOfSorcery +
                ", перемещение = " + transgressAtADistance +
                '}';
    }

    private int getAbilitiesSum() {
        return smart + wise + witty + creativity;
    }

    public static void compare(FacultyRavenclaw student1, FacultyRavenclaw student2) {
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
