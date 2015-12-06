package demo.construction.reflection;

import java.lang.reflect.Field;
import java.util.List;

public class ObtainingFieldTypesSamples<T> {
	public boolean[][] b = { { false, false }, { true, true } };
	public String name = "Alice";
	public List<Integer> list;
	public T val;

	public static void main(String... args) {
		try {
			Class<?> c = Class
					.forName("demo.construction.reflection.ObtainingFieldTypesSamples");
			//Field f = c.getField("b");
			//Field f = c.getField("name");
			Field f = c.getField("list");
			System.out.format("Type: %s%n", f.getType());
			System.out.format("GenericType: %s%n", f.getGenericType());

		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
		}
	}
}