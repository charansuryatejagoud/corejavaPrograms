package Practice2;

public class bank {
	int getRateofinterest() {
		return 0;
	}

	public static void main(String[] args) {
		sbi s = new sbi();
		andhra a = new andhra();
		kotak k = new kotak();
		axis a1 = new axis();

		System.out.println("sbi Rate of interest:" + s.getrateofinterest());
		System.out.println("andhra Rate of interest:" + a.getrateofinterest());
		System.out.println("kotak Rate of interest:" + k.getrateofinterest());
		System.out.println("axis Rate of interest:" + a1.getrateofinterest());

	}
}

class sbi extends bank {
	int getrateofinterest() {
		return 3;
	}
}

class andhra extends bank {
	int getrateofinterest() {
		return 5;
	}
}

class kotak extends bank {
	int getrateofinterest() {
		return 7;
	}
}

class axis extends bank {
	int getrateofinterest() {
		return 9;
	}
}
