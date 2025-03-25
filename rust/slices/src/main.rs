fn main() {
    // contiguous memory allocated instead of non-contigous 

    let num: &[i32; 5] = &[1,2,3,4,5];
    println!("{:?}", num);

    // &str -> is different than normal slice (even tho it is also called string slice)
    // &str -> references a view of a string (it is not related to contiguous memory)
    let animals: &[&str; 5] = &["Cow", "Goat", "Sheep", "Dog", "Cat"];
    println!("{:?}", animals);


    let books: &[String; 5] = &[String::from("Of Mice and Men"), String::from("A Tale of Two Cities"), String::from("East Of Eden"), String::from("Grapes Of Wrath"), String::from("A Man Called Ove")];
    println!("{:?}", books);

    let books:[String; 5] = [String::from("Of Mice and Men"), String::from("A Tale of Two Cities"), String::from("East Of Eden"), String::from("Grapes Of Wrath"), String::from("A Man Called Ove")];
    println!("{:?}", books);
}
