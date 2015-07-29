
public class Helloworld {

	public static void main(String[] args) {

		System.out.println("------------PERSON--------------------");

		Person p = new Person("Peter Petrovaj", 24);
		System.out.println(p.toString());

		System.out.println("------------TRIANGLE--------------------");

		Triangle t1 = new Triangle(5, 5, 't', 8, false);
		System.out.println(t1.toString());

		System.out.println("------------FILLED TRIANGLE--------------------");

		Triangle t2 = new Triangle(5, 5, 't', 8, true);
		System.out.println(t2.toString());

		System.out.println("------------LINE--------------------");

		Line l = new Line(5, 5, 'l', 5, true);
		System.out.print(l.toString());

		System.out.println("------------SQUARE--------------------");

		Square s1 = new Square(5, 5, 's', 5, false);
		System.out.println(s1.toString());

		System.out.println("------------FILLED SQUARE--------------------");

		Square s2 = new Square(5, 5, 's', 5, true);
		System.out.println(s2.toString());

		System.out.println("------------RECTANGLE--------------------");

		Rectangle r1 = new Rectangle(5, 5, 'r', 10, 5, false);
		System.out.println(r1.toString());

		System.out.println("------------FILLED RECTANGLE--------------------");

		Rectangle r2 = new Rectangle(5, 5, 'r', 10, 5, true);
		System.out.println(r2.toString());

		System.out.println("------------HelloWorld o jedno pismeno menej vzdy (v cykle)------");

		int i = 0;
		String hello = "hello world";
		while (i < hello.length()) {
			String hell1;
			hell1 = hello.substring(0, hello.length() - i);
			i++;
			System.out.println(hell1);
		}

		System.out.println("\n------------to iste len opacne----------------");

		i = 0;
		while (i <= hello.length()) {
			String hell1;
			hell1 = hello.substring(0, i);
			i++;
			System.out.println(hell1);
		}

		System.out.println(
				"\n-------uberat aj zo zaciatku aj z konca; upravit aby fungovalo pre akykolvek retazec----------------");

		i = 0;
		while (i < hello.length() / 2) {
			String hell = hello.substring(i, hello.length() - i);
			System.out.println(hell);
			i++;
		}

		System.out.println("\n-------pridat medzery aby z toho bol rovnoramenny trojuholnik----------------");
		i = 0;

		while (i < hello.length() / 2) {
			String hell = hello.substring(i, hello.length() - i);
			for (int a = 0; a < i; a++) {
				hell = " " + hell;
			}
			System.out.println(hell);
			i++;
		}

	}

}