import static java.lang.Math.pow;

/**
 * Created by vlad on 21.06.2016.
 */
public class Calculator {
    /**
     *
     */
    private double result;
    /**
     *
     */
    public void add(double ... params){
        for (Double param:params){
            this.result +=param;
        }
    }

    public void subtraction (double ... params){
        this.result = 2*params[0];
        for (Double param:params){
            this.result-=param;
        }
    }

    public void multiplication (double ... params){
        this.result = 1;
        for (Double param:params){
            this.result *= param;
        }
    }

    public void division(double ... params){
        this.result = params[0]*params[0];
        for (Double param:params){
            this.result /= param;
        }
    }

    public void involution (double ... params) {
        this.result = pow( params[0], params[1]);
    }

    /*

     */
    public double getResult(){
        return this.result;
    }
    /*

     */
    public void cleanResult(){
        this.result = 0;
    }
}
