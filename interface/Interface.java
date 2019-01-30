interface Interface{
	public void foo();
	default public int add(int a,int b){
		return a+b;
	}
}