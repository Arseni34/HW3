public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

        if(SignIn.getPassword().length()>19) {
            System.out.println("Слишком длинный пароль");
        }
        if(SignIn.getPassword().contains(" ")){
            System.out.println("В пароле присутствует пробел");
        }
      char[] letters = SignIn.getPassword().toCharArray();
        int fl = 0;
        for( char letter: letters){
            if ((letter >= '1' && letter <= '9') ) {
                fl+=1;
            }
        }
        if(fl==0) {
            System.out.println("В пароле нет цифр");

        }
    }
    public WrongPasswordException(String message){
        super(message);
        System.out.println("Пароли не совпадают");
    }

}
