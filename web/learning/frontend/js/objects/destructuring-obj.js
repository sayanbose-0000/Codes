const band = {
    vocals: "Robert Plant",
    guitar: "Jimmy Page",
    bass: "John Paul Jones",
    drums: "Johnn Bonham",
};

const { guitar: myVariable, bass: myBass } = band; //copies the guitar and bass values to myVariable and myBass variables
console.log(myVariable);
console.log(myBass,"\n");


const { vocals, guitar, bass, drums } = band; //destructuring with the variable name as same as object key name
console.log(vocals);
console.log(guitar);
console.log(bass);
console.log(drums);