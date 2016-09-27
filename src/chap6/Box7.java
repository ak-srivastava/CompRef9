package chap6;

//listing 8
/* Here, Box uses a parameterized constructor to
   initialize the dimensions of a box.
*/
class Box7 {
  double width;
  double height;
  double depth;

  // This is the constructor for Box.
  Box7(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}