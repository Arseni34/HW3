public class WrongLoginException extends Exception{


    public WrongLoginException(){

        if(SignIn.getLogin().length()>19) {
            System.out.println("Слишком длинный логин");
        }
        if(SignIn.getLogin().contains(" ")){
            System.out.println("В логине присутствует пробел");
        }
    }
    public WrongLoginException(String message){
        super(message);
    }

}
