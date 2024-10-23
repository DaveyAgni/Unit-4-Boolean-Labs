//(c) A+ Computer Science
// www.apluscompsci.com

public class AngryBear 
{
    private int awakeDays;
    private int numTeeth;
    
    public AngryBear( int one, int two )
    {
    	awakeDays = one;
        numTeeth = two;
    }
    
    public boolean isAngry()
    {
    	if(one > 3 && two =< 10 )
        {
            return true;
        }
        else if(two =< 0)
        {
            return true;
        }
        else if(one > 5)
        {
            return true;
        }
    return false;
        
    }
}
