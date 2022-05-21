



package com.di.ex04;

import java.util.Calendar;

public abstract class AbstractDay {

	abstract public String dayInfo();
	
	public static AbstractDay getInstance() {
			Calendar cal = Calendar.getInstance();
			
			int day = cal.get(Calendar.DAY_OF_WEEK);
			switch(day) {
			case 1: return new Sunday(); //각 요일 각각은 AbstractDay를 상속받는다
			case 2: return new Monday();
			case 3: return new Tuesday();
			case 4: return new Wednesday();
			case 5: return new Thursday();
			case 6: return new Friday();
			case 7: return new Saturday();
			}
			return null;
	}
	
}
