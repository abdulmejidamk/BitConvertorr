public class BitCalculator {

    private int quotient;
    private int remainder;
    private int [] bits = new int [8];

    public void calculateBit(int number) {
        for (int i = 0; i < bits.length; i++) {
            remainder = number%2;
            quotient = number/2;
            bits[i] = remainder;            
            number = quotient;            
        } 
        
    for (int i = bits.length-1; i >= 0; i--) {
        System.out.print(bits[i]);
    }
}

   
        
    


    
}