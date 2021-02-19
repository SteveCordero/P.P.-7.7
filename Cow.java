public class Cow extends Animal
{
  private String color;
  
  //constructors
  public Cow(String name, String type, String sound, String color)
  {
    super(name,type,sound);
    this.color = color;
  }

  //brain method
  public String response()
  {
    return "Cow: MOOOOOOOOOOO!!!";
  }//
}//end cow class