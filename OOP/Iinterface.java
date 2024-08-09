public class Iinterface
{
   public static void main(String args[])
   {
      // Queen q1 = new Queen();
      // q1.moves();

      Bear b1 = new Bear();
      b1.eatanimal();
   }
}
// interface Chessplayer
// {
//    void moves();
// }
// class Queen implements Chessplayer 
// {
//    public void moves()
//    {
//       System.out.println("Queen can move in : up , left, right , diagonal (in all four directions)");
//    }
// }

// class Rook implements Chessplayer
// {
//    public void moves()
//    {
//       System.out.println("Rook can move in : up, down , left , right");
//    }
// }

// class King implements Chessplayer
// {
//    public void moves()
//    {
//       System.out.println("King can move in : up , down , left, right");
//    }
// }

interface Herbivore
{
   void eatGrass();
}
interface Carnivore
{
   void eatanimal();
}
class Bear implements Herbivore,Carnivore
{
   public void eatGrass()
   {
      System.out.println("Beer can eat the grass ...");
   }
   public void eatanimal()
   {
      System.out.println("Beer can eat also the Animal...");
   }
}