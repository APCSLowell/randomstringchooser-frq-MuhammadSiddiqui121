import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> words;
public RandomStringChooser(String[] wordArray){
    words = new ArrayList<String>();
  for( String i : wordArray){
        words.add(i);
  }
}
  //Heads up! 
  public String getNext(){
      if( words.size() == 0){
            return "NONE";
      }
    int j = (int)(Math.random() * words.size());
    return words.remove(j);
  }
  //You will get a very confusing error message until you have working code in part b as well
}
