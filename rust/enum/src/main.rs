enum Shape {
    Rectangle(f64, f64), // rectangle with 2 float 64's as an associated valie
    Circle(f64),
}

fn main() {
    let rect = Shape::Rectangle(5.96, 8.89);
    let circ = Shape::Circle(5.67);

    println!("{}", calc_area(rect));
    println!("{}", calc_area(circ));
}

fn calc_area(shape: Shape) -> f64 {
    // pattern matching
    let area = match shape {
        Shape::Rectangle(a, b) => {
            println!("Hi");
            a * b
        }
        Shape::Circle(r) => 3.15 * r * r,
    };

    return area;
}
