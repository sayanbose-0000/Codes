struct Rectangle {
    length: u32,
    breadth: u32,
}

impl Rectangle {
    fn calc_area(&self) -> u32 {
        self.length * self.breadth // implicit return
    }

    fn calc_perimeter(&self) -> u32 {
        2 * (self.length + self.breadth)
    }

    fn increased_size_area(&self, l: u32, b: u32) -> u32 {
        (self.length * l) * (self.breadth * b)
    }

    // similar to static function -> can be accessed through struct name 'Rectangle::disp()'✔️ but not through obj 'rect1.debug()' ❌
    fn disp() {
        // methods declared WITHOUT '&self' are static methods
        println!("This is a static method!");
    }
}

fn main() {
    let rect1 = Rectangle {
        length: 10,
        breadth: 15,
    };

    println!(
        "The reactange with length {} and breadth {} has an area of {} and perimeter {} and increased size is {}",
        rect1.length,
        rect1.breadth,
        rect1.calc_area(),
        rect1.calc_perimeter(),
        rect1.increased_size_area(2, 4)
    );

    // print!("{}", rect1.debug()) // not accessible as debug is a static method❌

    Rectangle::disp(); // accessible like this ✔️
}
