public class Chick extends Animal
{
  private int age;
  
  public Chick(String name, String type, String sound, int age)
  {
    super(name,type,sound);
    this.age = age;
  }//end constructor

  //brain method
  public String getSound()
  {
    if(age > 5)
    {
      return "peep-cheep";
    }
    else
    {
      return "peep-peep";
    }
  }//end getSound method

}//end Chick class 