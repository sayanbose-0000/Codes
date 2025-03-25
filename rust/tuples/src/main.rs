fn main() {
    // Heterogenous data (ie, different data type variables)

    let human: (i32, String, bool) = (
        122,
        String::from("John"),
        true
    );

    println!("{:?}", human);




    let bird: (String, [i32; 5]) = (
        String::from("Sparrow"),
        [1, 2, 3, 4, 5]
    );

    println!("{}",bird.0);
    println!("{}",bird.1[3]);
    println!("{:?}", bird);
    
}
