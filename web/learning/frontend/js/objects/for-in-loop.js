const band = {
    vocals: "Robert Plant",
    guitar: "Jimmy Page",
    bass: "John Paul Jones",
    drums: "Johnn Bonham",
};


band.keyboardPlayer = "Kate Wilson"; //new key-value pair
delete (band.drums); //deleting drums

for (let i in band) {
    console.log(`Your key is ${i} and value is ${band[i]}`);
}