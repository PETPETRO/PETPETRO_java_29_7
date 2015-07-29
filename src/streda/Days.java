package streda;

public class Days {

	private String day;

	public Days(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String printDay(String day) {
		String week = "";

		switch (day) {
		case "pondelok":
			week = "pondelocek";
			break;
		case "utorok":
			week = "utorocek";
			break;
		case "streda":
			week = "stredocka";
			break;
		case "stvrtok":
			week = "stvrtocek";
			break;
		case "piatok":
			week = "piatocek";
			break;
		case "sobota":
			week = "soboticka";
			break;
		case "nedela":
			week = "nedelocka";
			break;
		default:
			week = "somainaaaa";
			break;
		}

		return week;
	}

	public String printDay(int day) {
		String week = "";

		switch (day) {
		case 1:
			week = "pondelocek";
			break;
		case 2:
			week = "utorocek";
			break;
		case 3:
			week = "stredocka";
			break;
		case 4:
			week = "stvrtocek";
			break;
		case 5:
			week = "piatocek";
			break;
		case 6:
			week = "soboticka";
			break;
		case 7:
			week = "nedelocka";
			break;
		default:
			week = "somarinaaaa";
			break;
		}

		return week;
	}

}
