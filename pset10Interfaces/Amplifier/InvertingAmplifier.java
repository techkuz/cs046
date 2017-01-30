
public class InvertingAmplifier extends Amplifier
{   
    public InvertingAmplifier (int resistance1, int resistance2)
    {
        super(resistance1, resistance2);
    }
    
    public double getGain()
    {
        return this.getR2() / this.getR1();
    }
    // TODO: supply the implementation of InvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // InvertingAmplifier:         g = R2 / R1
    // TODO: the getGain method needs to return the correct gain (g)
}
