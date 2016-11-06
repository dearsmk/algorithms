//bubblesort
class BubbleSort {
	constructor(numElements){
		this.numElements = numElements;
		this.dataStore = [];
		
	}
	
	setData(){
		for(var i=0; i < this.numElements ; i++){
			this.dataStore[i] = Math.floor( ( Math.random() * 3 ) * i + 1	);
		}
		return this.dataStore;
	}
	
	swap(i){
		var temp;
		if(this.dataStore[i] > this.dataStore[i+1]){
			temp = this.dataStore[i];
			this.dataStore[i] = this.dataStore[i +1 ];
			this.dataStore[i + 1] = temp;
		}
	}
	
	bubblesort(){
		for(var outer=this.numElements; outer > 2; --outer ){
			for(var inner=0; inner <= outer; inner++){
				if (this.dataStore[inner] > this.dataStore[inner+1]) {
					this.swap(inner);  
				}
			}
		}
	}
	
	print(){
		console.log(this.dataStore);
	}
}


var dataset = new BubbleSort(10);
dataset.setData();
dataset.print();
dataset.bubblesort();
dataset.print();

