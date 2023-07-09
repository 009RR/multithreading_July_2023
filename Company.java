//producer and consumer
class Company{
	
	int n;
	boolean f=false;
	// f=false chance:producer
	// f=true chance:consumer
	synchronized public void produce_item(int n){
				this.n=n;
				if(f){
					
					try{

							wait();
					}
					catch(Exception e)
					{


					}

				}
				System.out.println("produce item"+this.n);
				f=true;
				notify();
			
	}
	synchronized public int consume_item(){
		if(!f){
			try{

				wait();
			}
			catch(Exception e){

				
			}
		}
	System.out.println("consume item"+this.n);
	f=false;
	notify();
	return n;
	}
}