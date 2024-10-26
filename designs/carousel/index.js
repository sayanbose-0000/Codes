const imageTrack = document.querySelector(".image-track");
const image = document.querySelector(".image-track > .image");

window.onmousedown = e => {
  imageTrack.dataset.mouseDownAt = e.clientX;
}

window.onmouseup = e => {
  imageTrack.dataset.mouseDownAt = "0";
  imageTrack.dataset.prevPercentage = imageTrack.dataset.percentage;
}

window.onmousemove = e => {
  if (imageTrack.dataset.mouseDownAt == "0") return;

  const currPos = parseFloat(imageTrack.dataset.mouseDownAt) - e.clientX; // finds how much it has moved from clicking to dragging
  const maxMove = window.innerWidth / 2; // since once we move the mouse from center to the end, the track moeves completely

  const percentage = (currPos / maxMove) * -100;
  const nextPercentageCalc = percentage + parseFloat(imageTrack.dataset.prevPercentage);
  const nextPercentage = Math.max(Math.min(nextPercentageCalc, 0), -100)

  imageTrack.dataset.percentage = nextPercentage;

  imageTrack.animate({
    transform: `translate(${nextPercentage}%, -50%)`
  }, { duration: 1200, fill: "forwards" });

  for (const i of imageTrack.querySelectorAll(".image")) {
    i.animate({
      objectPosition: `${nextPercentage + 100}% center`
    }, { duration: 1200, fill: "forwards" });
  }
}