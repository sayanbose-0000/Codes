const List = (props) => {
    return (
        (props.bought) ? <li> {props.title} ✔ </li> : <li> {props.title} </li> 
    );
};

export default List;