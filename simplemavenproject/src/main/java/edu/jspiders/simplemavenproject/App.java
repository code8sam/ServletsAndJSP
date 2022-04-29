package edu.jspiders.simplemavenproject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.test(1,5,8,15l,78,78.56,56,23,new Object());
        
        Object[] arr1 = {10,25,60};
        app.m1(arr1);
    }
    
    public void m1(Object[] arr)
    {
    	for (Object object : arr) {
			System.out.println(object);
		}
    }
    public void test(Object ...a) 
    {
    	for (Object i : a) {
			System.out.println(i);
		}
    }
}
