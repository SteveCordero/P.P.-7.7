class Main 
{
  public static void main(String[] args) 
  {
    Cow james = new Cow("james", "Cow", "MOO", "white and black");

    Chick chow = new Chick("Chow", "Chicken", "peep or cheep", 6);

    Pig waddles = new Pig("Waddles", "Pig", "Oink");


    System.out.println(james.getSound());
    System.out.println(james.response());
    System.out.println(chow.getSound());
    System.out.println(waddles.getSound());
  }
}