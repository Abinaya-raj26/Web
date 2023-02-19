var namex = "vp";
var mark = 80;
var x = document.getElementById("user");
var y = document.getElementById("mark");
var z = document.getElementById("status");
function checkresult() {
    x.innerHTML = namex;
    y.innerHTML = mark;

    if (mark != 0) {

        if (mark <= 100) {

            if (mark >= 50) {
                z.innerHTML = "Pass";
                z.style.color = "green";
                // y.innerHTML = mark;

            }
            else if (mark < 50) {
                z.innerHTML = "fail";
                z.style.color = "red";


            }
            // else if (mark > 50) {
            //     z.innerHTML = "Pass";
            //     z.style.color = "green";


            // }
        }

    }
}




// 0 less N/A
// 100 more N/A

// 50  less = fail
// 50 -> 60 = E grade
// 60 -> 70 = D grade
// 70 -> 80 = C grade
// 80 -> 90 = B grade
// 90 -> 100 = A grade
