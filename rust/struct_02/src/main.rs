struct User {
    email: String,
    username: String,
    no_of_times_signed_in: u32,
    is_active: bool,
}

fn main() {
    let user1 = User {
        email: String::from("abc@gmail.com"),
        username: String::from("abc zed"),
        no_of_times_signed_in: 0,
        is_active: true,
    };

    println!(
        "{}'s email is {} and he has signed in {} no of times and he is curerntly {}",
        user1.username,
        user1.email,
        user1.no_of_times_signed_in,
        if user1.is_active {String::from("Active")} else {String::from("Inactive")}
    );
}
