package com.nabenik.heaven.fblocks;

public class FunctionalController {
	
	/**
	 * Old implementation (return annon class)
	 */
	public MyFunctionalInterface createOldBehaviour(){
		return new MyFunctionalInterface() {
			@Override
			public void doFunctional(String x) {
				String result = x.concat("Old way");
				System.out.println(result);
			}
		};
	}
	
	/**
	 * New lambda implementation (returns function)
	 */
	public MyFunctionalInterface createLambdaBehavior(){
		return (x) -> {
			String result = x.concat("Lambda way");
			System.out.println(result);
		};
		
	}
	
	public void doDemo(){
		MyFunctionalInterface behavior1 = createOldBehaviour();
		MyFunctionalInterface behavior2 = createLambdaBehavior();
		MyFunctionalInterface behavior3 = System.out::println;
		
		doHighOrderfunction(behavior1);
		doHighOrderfunction(behavior2);
		doHighOrderfunction(behavior3);
	}
	
	/**
	 * Dummy high order function
	 * @param param
	 */
	public void doHighOrderfunction(MyFunctionalInterface param){
		//Execution
		param.doFunctional("Marco in ");
		
	}

}
