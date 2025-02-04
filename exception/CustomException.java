package exception;

class MyCustomException extends Exception {
    
    public MyCustomException(String  message){
        super(message);
    }


    

}


public class CustomException{
    public static void validateAge(int age)  throws MyCustomException{
        if(age < 18){
            throw new MyCustomException("age must be at least 18");

        }else {
            System.out.println("age is valid");
        }

    }

}
