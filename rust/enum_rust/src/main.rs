// Represents type that takes one of several possible values

#[derive(Debug)]
enum IPAddrKind {
    IpV4,
    IpV6,
}

#[derive(Debug)]
struct IpAddr {
    kind: IPAddrKind,
    address: String,
}

fn main() {
    let ip_version_four: IPAddrKind = IPAddrKind::IpV4;
    let ip_version_six: IPAddrKind = IPAddrKind::IpV6;

    route(ip_version_four);
    route(ip_version_six);

    let home = IpAddr {
        kind: IPAddrKind::IpV4,
        address: String::from("127.0.0.1"),
    };

    println!("{:?}", home.kind);
    println!("{:?}", home.address);
    
    println!("{:?}", home);


    let garage = IpAddr {
        kind: IPAddrKind::IpV4,
        address: String::from("127.0.0.1"),
    };

    println!("{:?}", garage.kind);
    println!("{:?}", garage.address);

    println!("{:?}", garage);
}

fn route(ip_kind: IPAddrKind) {
    println!("{:?}", ip_kind);
}
