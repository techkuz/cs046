//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe


//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.
//

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas
//

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 4 - Question 2" for some tips on 
// how to begin.

public class CountryNames
{
    /**
     * Gets the name with the proper article
     * @param name the country name
     * @return the name prepended with the proper article
     */
    private String input = "";
    private String sex = ""; 
    
    public String getCompleteName(String name)
    {
        input = name;
        
        if(input.equals("Etats-Unis") ||  //checks for plurals
        input.equals("Pays-Bas")) {
            return "les " + input;
        }
        
        
        if(startsWithVowel(input)) //checks for starting with e
        {
            return "l'" + input;
        }
        
        
        
        
        
        if(input.charAt(input.length() - 1) == 'e' && //checks for sex
        !input.equals("Belize") && 
        !input.equals("Cambodge") &&         
        !input.equals("Mexique") &&         
        !input.equals("Mozambique") &&         
        !input.equals("Zaire") && 
        !input.equals("Zimbabwe")) 
        {
            sex = "female";
        }
        else
        {
            sex = "male";
        }
        
        if(isFemale(sex))
        {
            return "la " + input;
        }
        else 
        {
            return "le " + input;    
        }
        
        
        
        
         //your code goes here
    }
    
    public boolean startsWithVowel(String country) 
    {
        if("aeuioAEUOI".contains(country.substring(0, 1)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFemale(String sex)
    {
        if(sex == "female")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}