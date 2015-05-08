package fizzbuzz;

public class FizzBuzzOneLiner {

    public static void main (final String[] args){
        System.out.println((new FizzBuzzOneLiner()).execute(1,100));
    }
    
    private final static Integer FIZZ_NUM = 3;
    private final static Integer BUZZ_NUM = 5;
      
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";
    private final static String EMPTY_STRING = "";
       
    public String execute(final Integer min, final Integer max){
        return (min > max ? EMPTY_STRING: consumeNumber(min) + execute(min + 1, max));
    }
    
    public String consumeNumber(final Integer number){
        return applyFizzBuzz(number) + System.lineSeparator();
    }
    
    public String applyFizzBuzz(final Integer number){
        return (isFizz(number) ? (isBuzz(number) ? FIZZ+BUZZ : FIZZ) : (isBuzz(number)? BUZZ : number.toString()));
    }
        
    public boolean isFizz(final Integer number){
        return number % FIZZ_NUM == 0;
    }

    public boolean isBuzz(final Integer number){
        return number % BUZZ_NUM == 0;
    }
}