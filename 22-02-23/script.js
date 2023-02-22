var username='vanipriya';
var mark=77;
var  x=document.getElementById("username");
var  y=document.getElementById("score");
var  z=document.getElementById("status");

function showresults(){
    x.innerHTML=username;
    y.innerHTML=mark;   

    if(mark>=0 && mark<=100 && mark!=null){
     if(mark>=0 && mark<50){
          z.innerHTML="Fail";
          z.style.color="red";
              }
       else if(mark>=50 && mark<60){
        z.innerHTML="E-grade";
        z.style.color="green";
       }       
     else if(mark>=60 && mark<70){
        z.innerHTML="D-grade";
        z.style.color="green";
       }
       else if(mark>=70 && mark<80){
        z.innerHTML="C-grade";
        z.style.color="green";
       }
       else if(mark>=80 && mark<90){
        z.innerHTML="B-grade";
        z.style.color="green";
       }
       else if(mark>=90 && mark<=100){
        z.innerHTML="A-grade";
        z.style.color="green";
       }
    }
    else if(mark<0 || mark==null){
      z.innerHTML="Invalid marks";
    }
    else {
   z.innerHTML="Invalid format";
    }
}