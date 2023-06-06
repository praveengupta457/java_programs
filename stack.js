
class Node{
    constructor(element){
        this.element=element;
        this.next=null;
    }
}
class stacklist{
    constructor(){
        this.top=null;
    }
    push(element){
        var node =new Node(element);
        node.next=this.top;
        this.top=node;
    }
    pop(){
        if(this.top==null){
            console.log("list is empty");
        }
        else{
            console.log("the deleted value is " +this.top.element);
            this.top=this.top.next;
        }
    }
    display()
    {
       // var node = new Node(element);
        if(this.top==null){
            console.log("stack under flow");
        }
        else{
            var ptr=this.top;
            while(ptr.next!=null){
                console.log(ptr.element);
                ptr=ptr.next;
            }
        }
    }
}
var s=new stacklist();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
console.log("element in the list is");
s.display();
s.pop();
s.display();
s.pop();
s.display();
