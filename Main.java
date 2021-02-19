class Main 
{
  public static void main(String[] args) 
  {
    Animal gorge = new Animal("Gorge", "rolly tooth", " roggle");

    Cow James = new Cow("james", "Cow", "MOO", "white and black");

    System.out.println(James.getSound());
    System.out.println(James.response());

    System.out.println(gorge.toString());
  }
}