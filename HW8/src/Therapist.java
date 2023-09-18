public class Therapist extends Doctor{
    void doctorChoice(Visitor visitor, Dantist dantist, Surgeon surgeon){
        if (visitor.getHealingPlan()==1){
            visitor.setDoctor("Хирург ");
            surgeon.Heal();
        }
        else if (visitor.getHealingPlan()==2){
            visitor.setDoctor("Дантист ");
            dantist.Heal();
        }
        else {
            visitor.setDoctor("Терапевт ");
            Heal();
        }
    }
    void Heal(){
        System.out.println("Лечит терапевт");

        super.Heal();
    }
}
