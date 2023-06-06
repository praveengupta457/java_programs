class Node{
    constructor(element){
 this.element=element;
 this.next=null;
    }
}
class queue{
    constructor(){
        this.front=null;
        this.rear=null;
    }
    push(element){
      var node=new Node(element);
        if(this.front==null){
        this.front=this.rear=node
        }
      else {
           this.rear.next=node;
           this.rear=node;
           }
           console.log("insertion done");
    }
    pop(){
        if(this.front==null){
            console.log("undderflow");
        }
        else{
            var ptr=this.front;
            this.front=this.front.next;
            console.log("popped element is "+ ptr.element)
        }
    }

display()
{
  if(this.front==null){
    console.log ("empty list ");
  }
  else{
    console.log("element in the queue are");
    var ptr=this.front;
    while(ptr!=null){
      console.log(ptr.element);
      ptr=ptr.next;
    }
  }
}
}
var q=new queue();
q.push(10);
q.push(20);
q.display();
q.pop();
q.display();

