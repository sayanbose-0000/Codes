//ensures DOM is fully loaded before js is used
document.addEventListener("DOMContentLoaded", function () {
    function liveTime() {
        let now = new Date();

        let day_in_words_latest = day(now);
        let hours_latest = hoursnow(now);
        let second_latest = seconds(now);
        let minute_latest = minutes(now);
        let month_latest = months(now);

        document.querySelector(".hours").innerHTML = hours_latest[0];
        document.querySelector(".min").innerHTML = minute_latest;
        document.querySelector(".sec").innerHTML = second_latest + " " + hours_latest[1];
        document.querySelector(".dayspan").innerHTML = day_in_words_latest;
        document.querySelector(".date").innerHTML = now.getDate();
        document.querySelector(".month").innerHTML = month_latest;
        document.querySelector(".year").innerHTML = now.getFullYear();
    }

    liveTime(); // Prevents the initial delay
    setInterval(liveTime, 1000);
});

function day(now) {
    let = day_in_words = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

    return day_in_words[now.getDay()];
}

function hoursnow(now) {
    let am_pm;
    let hours = now.getHours();

    if (hours >= 12) {
        hours = hours % 12;
        am_pm = "pm";
    } else {
        am_pm = "am";
    }

    if (hours < 10) {
        hours = "0" + hours;
    }

    return [hours, am_pm];
}

function seconds(now) {
    let second = now.getSeconds();

    if (second < 10) {
        second = "0" + second;
    }

    return second;
}

function minutes(now) {
    let min = now.getMinutes();
    if (min < 10) {
        min = "0" + min;
    }
    return min;
}

function months(now) {
    let mnth = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]

    return mnth[now.getMonth()]; //get month returns with 0 as January. So, we need to add 1 to get desired result
}
