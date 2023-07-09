class Main{
	
	public static void main(String args[]){
		
	Company cmp = new Company();
	Producer p=new Producer(cmp);
	Consumer c=new Consumer(cmp);
	p.start();
	c.start();

	}
}