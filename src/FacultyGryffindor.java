public class FacultyGryffindor extends Hogwarts{

    private int nobility;
    private int  honor ;
    private int  bravery;

    public FacultyGryffindor(String fullName, int thePowerOfSorcery, int transgressAtADistance, int nobility, int honor, int bravery) {
        super(fullName, thePowerOfSorcery, transgressAtADistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return fullName +
                ": благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery + '\'' +
                ", мощьность колдовства = " + thePowerOfSorcery +
                ", перемещение = " + transgressAtADistance +
                '}';
    }

    private int getAbilitiesSum() {
        return nobility + honor + bravery;
    }

    public static void compare(FacultyGryffindor student1, FacultyGryffindor student2) {
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();

        if (student1Sum > student2Sum) {
            System.out.println("Студент "+ student1.getFullName() + " лучше, чем студент "+ student2.getFullName());
        } else if (student2Sum>student1Sum) {
            System.out.println("Студент "+ student2.getFullName() + " лучше, чем студент "+ student1.getFullName());
        }else {
            System.out.println("Студент "+ student1.getFullName() + " и студент "+ student2.getFullName()+ " одинаково хороши");
        }
    }
}
