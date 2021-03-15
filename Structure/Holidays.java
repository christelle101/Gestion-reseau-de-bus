package Structure;

import java.util.*;
public class Holidays {
	private String datetype;
	//datetype prend la valeur "semaine" ou "férié", sachant que "férié" inclut les dimanches, les jours fériés et les vacances scolaires
	
	public Holidays(String datetype) {
		this.datetype = datetype;
		
	}
	
	public String getdatetype() {
		return datetype;
	}
	//On se place en 2021
	public static String findDateType(int month, int day) {
		//le 1er janvier 2021 est un vendredi
		int numWeek = 5;
		numWeek += day - 1;
		numWeek = booleanToInt(month>1)*31 + booleanToInt(month>2)*28 + booleanToInt(month>3)*31+ booleanToInt(month>4)*30 + booleanToInt(month>5)*31 + booleanToInt(month>6)*30 + booleanToInt(month>7)*31 + booleanToInt(month>8)*31 + booleanToInt(month>9)*30+ booleanToInt(month>10)*31 + booleanToInt(month>11)*30;
		numWeek = numWeek%7;
		if (numWeek == 0) {
			return "ferie";
		}
		if ((month==1 && day==1)||(month == 4 && day == 5)||(month == 5 && day == 1)||(month == 5 && day == 8)||(month == 5 && day == 13)||(month == 5 && day == 24)||(month == 7 && day == 14)||(month == 8 && day == 15)||(month == 11 && day == 1)||(month == 11 && day == 11)||(month == 12 && day == 25)) {
			return "ferie";
		}
		return "semaine";
	}
	public static int booleanToInt(boolean b){
		if (b == true) {
			return 1;
		}
		return 0;
	}

}
