package com.varun.exceptions.trywithresources;

public class AutoCloseabeResource {
	public static void main(String[] args) {
		try(MyResource myResource = new MyResource()){
			myResource.doSomething();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closed my resource");
	}
	
	public void doSomething() {
		System.out.println("Doing something");
	}
	
}
