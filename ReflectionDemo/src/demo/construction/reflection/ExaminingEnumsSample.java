package demo.construction.reflection;

import java.util.Arrays;

import static java.lang.System.out;

public class ExaminingEnumsSample {
	enum Day {
		SATARDAY, SUNDAY, MONDAY, TUESDAY, THURSDAY, FIRDAY
	}

	public static void main(String[] args) {
		Class<?> daysClass = Day.class;
		out.format("Enum name:  %s%nEnum constants:  %s%n",
				daysClass.getName(),
				Arrays.asList(daysClass.getEnumConstants()));
	}
}