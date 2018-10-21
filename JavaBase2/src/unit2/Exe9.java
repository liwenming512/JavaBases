package unit2;

public class Exe9 {

	public static void main(String[] args) {
		Boolean b = new Boolean(false);
		boolean b2 = b;
		System.out.println(b2);
		
		Character ch = new Character('C');
		char ch2 = ch;
		System.out.println(ch2);
		
		Integer i = new Integer(0);
		int i2 = i;
		System.out.print(i2);
		
		Byte bt = new Byte("0");
		byte bt2 = bt;
		System.out.println(bt2);
		
		Short st = new Short("0");
		short st2 = st;
		System.out.println(st2);
		
		Long l = new Long(123456);
		long l2 = l;
		System.out.println(l2);
		
		Float f = new Float(123.456);
		float f2 = f;
		System.out.println(f2);
		
		Double d = new Double(123.456);
		double d2 = d;
		System.out.println(d2);
	}

}
