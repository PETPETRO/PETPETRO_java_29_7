package streda;

public class Main {

	public static void main(String[] args) {

		Days d = new Days(args[0]);

		for (int i = 0; i < args.length; i++) {
			try {
				int n = Integer.parseInt(args[i]);
				System.out.println(d.printDay(n));
			} catch (NumberFormatException ex) {
				System.out.println(d.printDay(args[i]));
			}
		}

	}

}
