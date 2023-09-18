// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Visitor visitor1 = new Visitor(1);
        Visitor visitor2 = new Visitor(2);
        Visitor visitor3 = new Visitor(3);


        Surgeon surgeon  = new Surgeon();
        Dantist dantist = new Dantist();
        Therapist therapist = new Therapist();

        therapist.doctorChoice(visitor1, dantist, surgeon);
        therapist.doctorChoice(visitor2, dantist, surgeon);
        therapist.doctorChoice(visitor3, dantist, surgeon);
    }
}