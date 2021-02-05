//برنامه اعتبارسنجی کد ملی به زبان کاتلین
//سازنده: بهروز غلامی اشرف
//Gmail: garpozir@gmail.com
//github: garpozir
fun main() {
	System.out.print("Code Melli ra Vared Konid:\t");
	var Meli: String = readLine()!!;
	if (Meli.length != 10) System.out.println("Code Melli Hast 10 Ragham!!!");
	else {
		var Con: Int = 0;
		var ter: Int = 10;
		for (i in Meli) {
			if (ter != 1) {
				var b: String = i.toString();
				var bb: Int = b.toInt();
				Con += bb * ter; ter--;
			}
		}
		Con = Con - (Con / 11) * 11;
		var Con1: Int = 11 - Con;
		if (Meli == "0000000000" || Meli == "1111111111" || Meli == "2222222222" ||
			Meli == "3333333333" || Meli == "4444444444" || Meli == "5555555555" || Meli == "0123456789" ||
			Meli == "6666666666" || Meli == "7777777777" || Meli == "8888888888" || Meli == "9999999999")
			System.out.println("Code Melli Eshtebah!!!");
		else {
			if (Con == 0) {
				if (Meli.substring(9, 10) == "0") System.out.println("Code Melli Sahieh!!!");
				else System.out.println("Code Melli Eshtebah!!!");
			}
			if (Con == 1) {
				if (Meli.substring(9, 10) == "1") System.out.println("Code Melli Sahieh!!!");
				else System.out.println("Code Melli Eshtebah!!!");
			}
			if (Con > 1) {
				if (Meli.substring(9, 10) == Con1.toString()) System.out.println("Code Melli Sahieh!!!");
				else System.out.println("Code Melli Eshtebah!!!");
			}
			if (Con < 0) System.out.println("Code Melli Eshtebah!!!");
		}
	}
}