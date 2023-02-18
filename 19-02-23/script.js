// function getvalue(){
// var x=document.getElementById('xdata').value;
// var y=document.getElementById('ydata').value;
// console.log(x,y);
// }

var x=10;
var y=5;
var z=document.getElementById("output");

document.getElementById('xdata').innerHTML=x;
document.getElementById('ydata').innerHTML=y;

function add(){

  
    z.innerHTML=(x+y);
}
function sub(){
    z.innerHTML=(x-y);
}
function mul(){
    z.innerHTML=(x*y);
}
function div(){
  z.innerHTML=(x/y);
}