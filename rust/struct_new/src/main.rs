fn main() {
    // tuple
    let rect: (i32, i32) = (200, 500);
    println!("{:?}", rect);

    // struct
    #[derive(Clone, Debug)]
    struct Book {
        title: String,
        author: String,
        pages: u32,
        available: bool,
    }

    let book1 = Book {
        title: String::from("Harry Potter And The Philosopher's Stone"),
        author: String::from("JK Rowling"),
        pages: 500,
        available: true,
    };

    println!("{}", book1.title);
    println!("{}", book1.author);
    println!("{}", book1.pages);
    println!("{}", book1.available);

    let book2: Book = Book {
        title: String::from("Harry Potter and the Chamber Of Secrets"),
        ..book1.clone()
    };

    println!("{:?}", book2);




    // Tuple structs
    #[derive(Debug)]
    struct RGBColor(i32, i32, i32);
    let black: RGBColor = RGBColor(0, 0, 0);
    println!("{} {} {}", black.0, black.1, black.2);
    print!("{:?}", black);


}
