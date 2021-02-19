public class Animal
{
  private String name;
  private String type;//type of Animal
  private String sound;//sound of the animal

  //constructor
  public Animal(String name, String type, String sound)
  {
    this.name = name;
    this.type = type;
    this.sound = sound;
  }//end constructor

  public String getType()
  {
    return type;
  }//end getter for type 
  public String getSound()
  {
    return sound;
  }//end sound getter

  public String toString()
  {
    return "name = " + name +
            "\ntype = " + type +
            "\nsound = " + sound;
  }
}//end animal class