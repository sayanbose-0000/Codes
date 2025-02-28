use chrono::Local;

fn main() {
    let now = Local::now();
    println!("{}", now);

    let formatted_now = now.format("%l:%M:%S %p, %d-%m-%Y (%A)");
    println!("{}", formatted_now);
}
