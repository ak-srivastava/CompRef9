package chap7;

//listing 20
//Demonstrate an inner class.
class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// this is an innner class
	class Inner {
		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}

/*//listing 21
//This program will not compile.
class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// this is an innner class
	class Inner {
		int y = 10; // y is local to Inner

		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}

	void showy() {
		System.out.println(y); // error, y not known here!
	}
}*/