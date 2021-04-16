//Magpie2 (Activity2)
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 *       Uses indexOf to find strings
 *       Handles responding to simple words and phrases 
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting = "";
    
    public String getGreeting()
    {
        getGreeting = "Hello, let's talk.";
        return getGreeting;
    }

    /**
     * Gives a response to a user statement
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response= "";
        
        if (statement.trim().length() == 0) {
        	response = "Please say something";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "Maybe we can change your point of view on that.";
        }
        else if (statement.indexOf("brother") >= 0)
        {
            response = "I have an older brother.";
        }
        else if (statement.indexOf("mother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("name") >= 0)
        {
            response = "My name is Magpie";
        }
        else if (statement.indexOf("knock knock") >= 0)
        {
            response = "Whose there?";
        }
        else if (statement.indexOf("who") >= 0)
        {
            response = "Who is what an owl says";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 3;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        if (whichResponse == 1)
        	response = "Cannot understand what you are typing.  Try again.";
        else if (whichResponse == 2)
        	response = "I'm not sure";
        else
        	response = "I dont know what to say";
        
        return response;
    }

}
