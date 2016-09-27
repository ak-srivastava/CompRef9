package chap6;

//listing 7
/* Here, Box uses a constructor to initialize the 
   dimensions of a box.
*/
class Box6 {
  double width;
  double height;
  double depth;

  // This is the constructor for Box.
  Box6() {
    System.out.println("Constructing Box");
    width = 10;
    height = 10;
    depth = 10;
  }

  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}
