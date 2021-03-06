package Model;
import java.util.Random;

public class RandArrayValue extends ArrayValue{
    private Value<?> size;
    
    public RandArrayValue(Value<?> size, int line) {
        super(line);
        this.size = size;
    }

    @Override
    public Array value() {
        Value<?> size = (this.size instanceof Variable) ? ((Variable) this.size).value() : this.size;
        Array a = null;
        Random gerador = new Random();
        if(size instanceof IntValue){
            IntValue v = (IntValue)size;
            a = new Array(v.value());
            for(int i=0; i < v.value(); i++){
                int aux = gerador.nextInt(15000);
                a.set(i, aux);
            }
        }
        else{
           System.err.println("[UNKNOWN SIZE FOR ARRAY] LINE - " + super.getLine());
           System.exit(0);
        }
        
        return a;
    }
    
}
