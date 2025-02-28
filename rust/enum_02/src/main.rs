#[derive(Debug)] // used to show unprintable data in a more presentable form
enum Direction {
    North,
    South,
    East,
    West
}

fn main() {
    let new_east = Direction::East;
    let new_west = Direction::West;
    let new_north = Direction::North;
    let new_south = Direction::South;

    direction_func(new_east, new_west, new_north, new_south);
}

fn direction_func(new_east: Direction, new_west: Direction, new_north: Direction, new_south: Direction) {
    println!("{:?} {:?} {:?} {:?}", new_east, new_west, new_north, new_south)
}