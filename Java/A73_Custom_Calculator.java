class InvalidException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";  
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";  
    }
}

class MaxException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater than 100K";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";  
    }
}

class CustomCalulator{
    double add(double a, double b) throws InvalidException, MaxException{
        if(a>100000 || b>100000){
            throw new MaxException();
        }
        if(a==8 || b==9 ){
            throw new InvalidException();
        }
        return a+b;
    }

    double subtract(double a, double b) throws MaxException{
        if(a>100000 || b>100000){
            throw new MaxException();
        }
        return a-b;
    }

    double multiply(double a, double b) throws MaxException{
        if(a>100000 || b>100000){
            throw new MaxException();
        }
        return a*b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException,MaxException{
        if(a>100000 || b>100000){
            throw new MaxException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class A73_Custom_Calculator {
    public static void main(String[] args) throws InvalidException, CannotDivideByZeroException, MaxException{
        CustomCalulator c = new CustomCalulator();
        // c.add(8, 9);
        c.divide(9, 0);
    }
}