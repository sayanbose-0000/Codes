import React from "react";

const Header = () => {
    const [items, setItems] = React.useState([
        {
            id: 1,
            checked: false,
            item: "Potato",
        },
        {
            id: 2,
            checked: false,
            item: "Tomato",
        },
        {
            id: 3,
            checked: false,
            item: "Cauliflower",
        },
    ])

    const handleChecked = (id) => {
        const listItems = items.map(item => item.id === id ? { ...item, checked: !item.checked } : item);
        setItems(listItems);
    };

    const handleDelete = (id) => {
        const listItems = items.filter(item => item.id !== id);
        setItems(listItems);
    };

    return (
        <header>
            <h1 className="heading">Groceries List</h1>
            <ul>
                {items.map((item) => (
                    <li className="item" key={item.id}>
                        <input type="checkbox" checked={item.checked} onChange={() => { handleChecked(item.id) }} />
                        <label htmlFor="" style={item.checked ? { textDecoration: 'line-through' } : null}>{item.item}</label>
                        <button onClick={() => { handleDelete(item.id) }}>Del</button>
                    </li>
                ))}
            </ul>
        </header>
    );
};

export default Header;


