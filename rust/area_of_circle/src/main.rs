const PI: f32 = 3.14;

fn main() {
    let rad: f32 = 33.23;
    println!("{}", area(rad));
    println!("{:.2}", area(rad)); // shows only two decimal places
}

fn area(rad: f32) -> f32 {
    PI * rad * rad
}
