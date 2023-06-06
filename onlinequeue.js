class queue{
    constructor(){
        this.A={};
        this.rear=-1;
        this.front=-1;
        this.size=5;

    }
    insert(x){
        if(this.rear==thiis.size-1){
            console.log("queue is full");
            return;
        }
        if(this.rear==-1){
            console.log("this is the first element")
          this.rear=this.front=0;
        }
        else{
            this.rear+=1;
        }
    }
    Delete(){
        if (this.front==-1){
            console.log("queue underflow");
            return -1;
        }
        const y=this.A[this.front]
        if(this.rear==this.front){
            
        }
    }
}