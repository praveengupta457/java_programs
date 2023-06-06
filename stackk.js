// class StackNode{
//     constructor(element){
// this.element=element;
// this.next=null;
//     }
// }
// class stk{
//     constructor(){
//         this.top=null;
//     }
//     push(element){
//         const node = new StackNode(element);
//         node.next=this.top;
//         this.top=node;
//     }
//     pop(){
//         if(this.top==null){
//             console.log("stack is empty")
//         }
//         else{
//             console.log("the popped element is "+this.top.element);
//              this.top=this.top.next;
//         }
//     }
//     display(){
//         if (this.top==null){
//             console.log("stack underflow ");
//         }
//         else{
//             var ptr=this.top;
//             while(ptr!=null){
//                 console.log(+ptr.element);
//                 ptr=ptr.next
//             }
//         }
//     }
// }
// const s=new stk()
// s.push(10);
// s.push(20);
// s.push(30);
// s.push(40);
// s.push(50);
// console.log("elements are");
// s.display()
// s.pop();
// s.display();

class queues{
    constructor(element){
        this.element=element
        this.next=null
    }
}
class qqq{
   constructor(){
    this.front=null;
    this.rear=null;
   }
   insert(element){
   var node=new queues(element);
   if(this.front==null){
    this.front=this.rear=node;
   }
   else{
    this.rear.next=node;
    this.rear=node;
   }
}
   delete()
   {
    if(this.front==null){
        console.log("queue is empty")
    }
    else{
         var ptr=this.front;
         this.front=this.front.next;
         console.log("deleted element is "+ptr.element);
    }
   }
   display(){
    if(this.front==null){
        console.log("queue underflow")
    }
    else{
        var ptr=this.front;
        while(ptr!=null){
            console.log(ptr.element)
            ptr=ptr.next
        }
    }
   }
}
var q=new qqq();

q.insert(10);
q.insert(20);
q.display();

q.delete()
q.display();