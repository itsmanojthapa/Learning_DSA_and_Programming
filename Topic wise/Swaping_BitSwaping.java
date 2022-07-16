import java.io.*;
import java.util.*;

public class Swaping_BitSwaping {
	public static void main(String[] args) {
		int a = 9;
		int b = 15;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a + " "+  b);
	}
}