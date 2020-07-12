
// current=1;
// sliderNext=2;
// $(document).ready(function(){
//     $("#slider>img#1").fadeIn(300);
//     $(".next").click(function(){
//         startSlider();
//     })
//     $(".previous").click(function(){
//         previousSlide();
//     })
    
// });
// function startSlider(){   
//     count = $("#slider>img").length;
//     loop = setInterval(function(){        
//         $("#slider>img").fadeOut(300);
//         $("#slider>img#"+sliderNext).fadeIn(300);    
//         current=sliderNext;
//         sliderNext += 1;
//     },1000)
// }
// function previousSlide(){

// }

$(document).ready(()=>{
    var current = 1;
    var next = 2;
    $("#slider>img#1").fadeIn(200);
    $('.next').click(()=>{   
        count = $("#slider>img").length;  
        console.log(count);
        console.log(next);      
        if (next>=count){
            current=1;
            next=2;
            console.log("hello");
        };                 
        $("#slider>img#"+current).fadeOut(100);
        $("#slider>img#"+next).fadeIn(200);        
        current = next;
        next +=1;
        console.log(next);
        
    })
})
