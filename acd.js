// function student (name)
// {
//  console.log("name of student is %s",name)   
// }
// function studentrollno(roll){
//     console.log("roll no of student is %d",roll)
// }
// for(let i=1;i<=2;i++){
//  student("ram");
//  studentrollno(15);
// console.log(i)
// }

class student{
    constructor(){
        this.name=" ";
        this.roll=0;
    }
     info(n,r){
        this.name=n;
        this.roll=r;
    }
     display(){
      console.log("name of student is %s",this.name);
      console.log("roll no. of student is %d",this.roll)
    }
}
let s = new info ("ram", 110);
s.display();
