package cl.generation.f20221024;

public class ejercicio1java {

	public static void main(String[] args) {
		//de Integer a String
		Integer a = 12345;
		String b = a.toString();
		System.out.println(b);
		
		
		Integer c = 54321;
		String d = String.valueOf(c);
		System.out.println(d);
		
		
		//de Integer a Float
		Integer e = 67890;
		Float f = Float.valueOf(e);
		System.out.println(f);
		
		//de Integer a Double
		Integer g = 34567;
		Double h = Double.valueOf(g);
		System.out.println(h);
		
		
		//de Integer a Long
		Integer i= 567809;
		Long j= Long.valueOf(i);
		System.out.println(j);
		
		
		// de String a Long
		String k= "23456";
		Long l= Long.valueOf(k);
		System.out.println(l);
		
		
		//de String a Float
		String m= "78965";
		Float n = Float.valueOf(m);
		System.out.println(n);
		
		//de String a Double
		String o = "5367";
		Double p = Double.valueOf(o);
		System.out.println(p);
		
		//De Long a Float
		Long q = 46789L;
		Float r = Float.valueOf(q);
		System.out.println(r);
		
		//de Long a Double
		
		Long s = 1234L;
		Double t = Double.valueOf(s);
		System.out.println(t);
		
		//value.of retorna un número numérico; parseint entrega un primitivo
		
		
	}

}
