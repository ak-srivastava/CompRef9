package chap6;

//listing 6
//This program uses a parameterized method.

class Box5 {
double width;
double height;
double depth;

// compute and return volume
double volume() {
 return width * height * depth;
}

// sets dimensions of box
void setDim(double w, double h, double d) {
 width = w;
 height = h;
 depth = d;
}
}
