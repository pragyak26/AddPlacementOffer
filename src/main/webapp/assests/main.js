function submitFunction() {
    // Getting values
    location.href = 'next.html';
    let offer_id = document.getElementById("offer_id").value;
    let organization = document.getElementById("organization").value;
    //let domain = document.getElementById("domain").value;
    let val1=document.getElementById("domain1");
    let val2=document.getElementById("domain2");
    let specialization = document.getElementById("specialization").value;
    let minimum_grade = document.getElementById("minimum_grade").value;
    let maximum_intake = document.getElementById("maximum_intake").value;
    //let domain1,domain2;
    let domain;
    if(val1.checked && val2.checked )
    {
        domain="MTech CSE, MTech ECE";
       // domain2='mtech ese';
    }
    else if(val1.checked){
        domain="MTech ECE";

    }
    else if(val2.checked){
        domain="MTech ECE";

    }


    let obj = {
        offer_id: offer_id,
        organization: organization,
        domain: domain,
        //domain2: domain2,
        specialization: specialization,
        minimum_grade: minimum_grade,
        maximum_intake: maximum_intake
    };



    // Send to Backend
    fetch("http://localhost:8080/PlacementAddOffer_war/api/offer/addOffer", {
        // Adding method type
        method: "POST",
        // Adding body or contents to send
        body: JSON.stringify(obj),
        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    })
        // Converting to JSON
        .then((response) => response.json())

        // Displaying results to console
        .then((json) => {
            console.log(json)

            // Popup
            Swal.fire({
                title: 'Submitted!',
                text: 'Details has been submitted',
                icon: 'success',
                confirmButtonText: 'Okay'
            })
        });


}