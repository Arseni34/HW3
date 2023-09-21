public class Rabbit extends Animal{
    @Override
    public void eat(String food){
        if (food.equals("Grass")|| food.equals("Lettuce")){
            System.out.println("Кролик любит это есть");
        }
        else{
            System.out.println("Кролик не будет это есть");
        }
    }
    @Override
    public void voice(){
        System.out.println("Пищит");
    }

}
