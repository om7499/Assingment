

//create function
function displayTime(){
    var datetime = new Date();
    var hrs = datetime.getHours();//define hours
    var min = datetime.getMinutes();// define minute
    var sec = datetime.getSeconds();// seconds
    var session = document.getElementById("session")
     
    //insert condition for display PM
    if(hrs >= 12){
        session.innerHTML = "PM"
    }
    else{
        session.innerHTML = "AM"
    }
    //insert condition for display correct time
    if(hrs > 12){
        hrs= hrs - 12 ;
    }
    document.getElementById("hour").innerHTML = hrs
    document.getElementById("minute").innerHTML = min ;
    document.getElementById("second").innerHTML = sec
}
//we can use setInterval for continuusly update value
setInterval(displayTime,10)