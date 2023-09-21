public class Dog extends Animal{
    @Override
    public void eat(String food){
        if (food.equals("Meat")|| food.equals("Bone")){
            System.out.println("Cобака любит это есть ");
        }
        else{
            System.out.println("Cобака не будет это есть");
        }
        voice();
    }
    @Override
    public void voice(){
        System.out.println("Гавкает");
    }
}
