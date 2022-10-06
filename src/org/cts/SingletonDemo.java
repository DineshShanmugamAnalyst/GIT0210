package org.cts;

public class SingletonDemo {

	private SingletonDemo() {
		
	}
		
	public static SingletonDemo Object;	
		
		public  static SingletonDemo getObject() {  // we can create static variable for class;
			
			if (Object==null){
			Object = new SingletonDemo();
				
			}
			return Object;
		}
		
	public static void main(String[] args) {
		
		SingletonDemo s1 =getObject(); 
//<<<<<<< HEAD
		System.out.println("DineshShanmugam");
//=======
	System.out.println("DineshS");	
//>>>>>>> 958c861d6d12c2af287cf91b8143279c71a286fb
		System.out.println(System.identityHashCode(s1));
		
	SingletonDemo s2 =getObject(); 
		
		System.out.println(System.identityHashCode(s2));
		
	SingletonDemo s3 = getObject ();
		
		System.out.println(System.identityHashCode(s3));
	}	
	}	

