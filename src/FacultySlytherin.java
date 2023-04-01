public class FacultySlytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int domineering;

    public FacultySlytherin(String fullName, int thePowerOfSorcery, int transgressAtADistance, int cunning, int determination, int ambition, int resourcefulness, int domineering) {
        super(fullName, thePowerOfSorcery, transgressAtADistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.domineering = domineering;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDomineering() {
        return domineering;
    }

    @Override
    public String toString() {
        return fullName +
                ": хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", властность = " + domineering + '\'' +
                ", мощьность колдовства = " + thePowerOfSorcery +
                ", перемещение = " + transgressAtADistance +
                '}';
    }

    private int getAbilitiesSum() {
        return cunning + determination + ambition + resourcefulness + domineering;
    }

    public static void compare(FacultySlytherin student1, FacultySlytherin student2) {
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
