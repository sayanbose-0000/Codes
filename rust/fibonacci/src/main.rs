use std::io;

fn fibonacci(num: u32) {
    let mut first: u32 = 0;
    let mut second: u32 = 1;

    print!("{first} ");
    print!("{second} ");

    let mut temp: u32;
    for _ in 1..(num - 1) {
        temp = second;
        second = second + first;
        first = temp;

        print!("{second} ");
    }

    println!()
}

fn main() {
    println!("Enter number:");
    let mut str = String::new();

    io::stdin()
        .read_line(&mut str)
        .expect("Could not take inputs");

    let number: u32 = str
        .trim()
        .parse()
        .expect("Couldn't convert to input to number");

    println!("The sequence has {number} of iterations");

    fibonacci(number);
}
