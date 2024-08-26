document.addEventListener("DOMContentLoaded",function(){
    const employeeform = document.getElementById("employeeform");
    const employeeName = document.getElementById("empnma")
    const employeetitle = document.getElementById("emptitle")
    const employeelidt = document.getElementById("emplist")


    function loademp(){
        employeelidt.innerHTML = "";
        const employees = JSON.parse(localStorage.getItem("employees"))||[];
        employees.forEach((employee,index) => {
            const row = document.createElement("tr");
            row.innerHTML = `
            <td>${employee.name}</td>
            <td>${employee.title}</td>
            <td>
            <button onclick="editEmployee(${index})">Edit</button>
             <button onclick="deleteEmployee(${index})">Delete</button>
            </td>`
            employeelidt.appendChild(row)
        });
    }
    //add new emp
    employeeform.addEventListener("submit",function(e){
        e.preventDefault();
        const newEmpName = employeeName.value.trim();
        const newemptitle = employeetitle.value.trim();
        if(newEmpName !=="" && newemptitle !==""){
            const employees = JSON.parse(localStorage.getItem("employees")) || [];
            const newemployee = {name:newEmpName,title:newemptitle};
            employees.push(newemployee);

            localStorage.setItem("employees",JSON.stringify(employees));
            employeeName.value = "";
            employeetitle.value = "";
            loademp();
        }
    });

    
window.editEmployee = function(index){
    const employees = JSON.parse(localStorage.getItem('employees')) || [];
    const employee = employees[index];
    const updatename = prompt("edit emp name",employee.name);
    const updatetitle = prompt("edit emp title",employee.title);

    if(updatename !== null & updatetitle !== null){
        employee.name = updatename;
        employee.title = updatetitle;

        localStorage.setItem("employees",JSON.stringify(employees));
        loademp();
    } 
}


window.deleteEmployee = function(index){
    const employees = JSON.parse(localStorage.getItem('employees')) || [];
    employees.splice(index,1);
    localStorage.setItem("employees",JSON.stringify(employees));
    loademp();
}
loademp()

})