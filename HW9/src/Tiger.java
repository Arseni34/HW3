public class Tiger extends Animal{
    @Override
    public void eat(String food){
        if (food.equals("Meat")|| food.equals("Human")){
            System.out.println("Тигр любит это есть ");
        }
        else{
            System.out.println("Тигр не будет это есть");
        }
    }
    @Override
    public void voice(){
        System.out.println("Рычит");
    }
}
