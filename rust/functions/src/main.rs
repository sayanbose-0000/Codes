fn main() {
    println!("Hello, world!");
    hello();
    height(12);
    name("John Doe", 15, 150.25);

    let area: f32 = {
        let length: f32 = 1.56;
        let breadth: f32 = 5.99;

        length * breadth
    };

    println!("{}", area);

    let sum = add(1, 2);
    println!("{}", sum);
}

fn hello() {
    println!("Hello Rust 🦀🦀");
}

fn height(ht: i32) {
    println!("Height is: {}", ht);
}

fn name(name: &str, age: i32, ht: f32) {
    println!(
        "Hey I am {}, my age is {} and I am {} cm tall",
        name, age, ht
    );
}

fn add(a: i32, b: i32) -> i32 {
    a + b
}
