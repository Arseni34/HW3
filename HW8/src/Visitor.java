public class Visitor {
    private int healingPlan;
    private String doctor;
    Visitor(int healingPlan){
        this.healingPlan= healingPlan;
    }

    public int getHealingPlan() {
        return healingPlan;
    }

    public void setHealingPlan(int healingPlan) {
        this.healingPlan = healingPlan;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
