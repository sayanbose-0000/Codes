use std::io;

fn main() {
    println!("Enter number ->");

    let mut str = String::new();

    io::stdin()
        .read_line(&mut str)
        .expect("Error in reading text");

    str = str.trim().to_string();

    println!("The number {str} was entered!");
}
