use std::fs::read_to_string;

fn main() {
    let file = read_to_string("../hello.txt");

    match file {
        Ok(val) => println!("{}", val),
        Err(err) => println!("{}", err),
    }
}