var username="harish kalyan";
var mark=-1;
var x=document.getElementById("username")
var y=document.getElementById("score")
var z=document.getElementById("status")
function showresult(){
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
    else if(mark>=70 && mark<80 ){
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

    // z.innerHTML="valid Marks"

}
else if (mark<0 || mark==null){
    z.innerHTML="invalid Marks";
}
else{

    z.innerHTML="invalid format";
}

}


// && - AND-> both condition 1 and  condition 2 -> true ->true

// || - OR -> any condition  ->true  ->true 




// 0 less N/A
// 100 more N/A

// 50  less = fail
// 50 -> 60 = E grade
// 60 -> 70 = D grade
// 70 -> 80 = C grade
// 80 -> 90 = B grade
// 90 -> 100 = A grade
