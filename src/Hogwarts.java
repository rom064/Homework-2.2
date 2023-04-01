abstract public class Hogwarts {
    protected String fullName;
    protected int thePowerOfSorcery;
    protected int transgressAtADistance;

    public Hogwarts(String fullName, int thePowerOfSorcery, int transgressAtADistance) {
        this.fullName = fullName;
        this.thePowerOfSorcery = thePowerOfSorcery;
        this.transgressAtADistance = transgressAtADistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getThePowerOfSorcery() {
        return thePowerOfSorcery;
    }

    public int getTransgressAtADistance() {
        return transgressAtADistance;
    }

    private int getAbilitiesSum() {
        return thePowerOfSorcery + transgressAtADistance;
    }

    public static void compare(Hogwarts student1, Hogwarts student2) {
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
