# Depth First Search (DFS)

```
DFS(graph, start, goal)
    stack = empty stack
    visited = empty set

    stack.push(start)

    while stack is not empty do
        node = stack.pop()
        
        if node == goal then
            return "Goal Found"
        
        if node not in visited then
            visited.add(node)
            
            for all neighbours of node do
                if neighbor not in visited then
                    stack.push(neighbor)
    
    return "Goal Not Found"

```


# Breadth First Search (BFS)

```
BFS(graph, start, goal)
    queue = empty queue
    visited = empty set

    queue.enqueue(start)

    while queue is not empty do
        node = queue.dequeue()
        
        if node = goal then
            return "Goal Found"
        
        if node not in visited then
            visited.add(node)
            
            for all neighbours of node do
                if neighbor not in visited then
                    queue.enqueue(neighbor)
    
    return "Goal Not Found"
```


# Depth Limited Search (DLS)

```
DLS(graph, start, goal, limit)
    stack = empty stack
    visited = empty set

    stack.push((start, 0))  # (node, curr_depth)

    while stack is not empty do
        node, curr_depth = stack.pop()

        if node == goal then
            return "Goal Found"

        if depth > limit
            continue
        
        if node not in visited then
            visited.add(node)

            for all neighbours of node do
                if neighbor not in visited then
                    stack.push((neighbor, curr_depth + 1))

    return "Goal Not Found or Depth Limit Reached"


```


# Iterative Deepening Search (IDS)

```
IDS(graph, start, limit):
    for l in range(0, limit + 1): # with every iteration increase the limit
        dls(graph, start, l) # l is current depth
```


# Uniform Cost Search (UCS)

```
UCS(graph, start, goal)
    priority_queue = empty priority queue
    visited = empty set

    priority_queue.enqueue((start, 0))  # (node, cost)

    while priority_queue is not empty do
        node, cost = priority_queue.dequeue()

        if node == goal then
            return "Goal Found with cost" + cost

        if node not in visited then
            visited.add(node)

            for all neighbours of node do
                if neighbor not in visited then
                    total_cost = cost + step_cost(neighbor)  
                    priority_queue.enqueue((neighbor, total_cost))

    return "Goal Not Found"
```


# Best First Search (BFS)

```
BestFirstSearch(graph, start, goal)
    priority_queue = empty priority queue
    visited = empty set

    priority_queue.enqueue((start, h(start)))  # (node, h(node))

    while priority_queue is not empty do
        node, heuristic_value = priority_queue.dequeue()

        if node == goal then
            return "Goal Found"

        if node not in visited then
            visited.add(node)

            for all neighbors of node do
                if neighbor not in visited then
                    priority_queue.enqueue((neighbor, h(neighbor)))

    return "Goal Not Found"
```

# A* Algorithm

```
1. Create two lists: open_set (to be evaluated nodes) and closed_set (already evaluated nodes).

2. Add the starting node to open_set with an initial cost of 0.

3. While open_set is not empty:

    4. Remove the node current from open_set with the lowest f value (where f = g + h).

    5. If current is the goal node, the path has been found.

    6. Move current to closed_set.

    7. For each neighbor of current:

    8. If the neighbor is in closed_set, skip it.

    9. Calculate g, h, and f values for the neighbor.

    10. If the neighbor is not in open_set or has a lower g value, update its values and set its parent to current.

    11. Add the neighbor to open_set if not already present.
```


# AO Algorithm (And-Or Algorithm)

```
1. Initialization:
    - Create an empty set OPEN and add the start node S to it.
    - Create an empty set CLOSED.
    - Initialize the heuristic value of the start node h(S).
    - Initialize the cost to reach the start node g(S) = 0.
    - Initialize the evaluation function f(S) = g(S) + h(S).

2. Main Loop:
    While OPEN is not empty, do:
        i. Node Selection: Select a node n from OPEN with the minimum f(n) value. Remove n from OPEN and add it to CLOSED.
        ii. Goal Test: If n is a goal node, return the solution graph containing the optimal solution tree rooted at n.
        iii. Expansion: If n is an And node, expand all its successors. If n is an Or node, expand the best successor (with the minimum f value). 
        iv. For each successor n':
            - Calculate g(n') = g(n) + c(n, n').
            - Calculate f(n') = g(n') + h(n').
            - If n' is not in OPEN and not in CLOSED, add n' to OPEN.
            - If n' is in OPEN or CLOSED, update its g and f values if the new path is better.
        iv. Update Parent: Update the parent of n' to n. If n' was already in OPEN or CLOSED, redirect its parent pointers to n.

3. Termination: If OPEN is empty and no solution has been found, return failure.
```

# Simple Hill Climbing ALgorithm
```
1. Evaluate the initial state
2. Loop until a solution is found or there are no operations left:
    - Select and apply a new operator
    - Evaluate the new state:
        - If goal then quit
        - If better then current state, it is the new current state
```

# Beam Search Algorithm
```
1. PQ <- Priority Queue
2. PQ.enqueue(start)
3. while (PQ is not empty)
    - I <- PQ.dequeue()
    - if (I == goal) return "Goal Reached"
    - explore all neighbours of I
    - PQ.enqueue(neighbours based on heuristics)
    - if (PQ.size > B) // B <- beam width
        - keep B no of lowest heuristic nodes in open_set and remove the others completely
    - go to step 3
```

# Minimax Algorithm

```
Function Minimax(node, depth, maximizingPlayer):
    If depth == 0 or node is a terminal node:
        Return the heuristic value of node

    If maximizing_player:
        Initialize bestValue to -∞
        For each child node of node:
            value = Minimax(child, depth-1, False)
            bestValue = max(bestValue, value)
        Return bestValue

    Else: // minimizing_player
        Initialize bestValue to ∞
        For each child node of node:
            value = Minimax(child, depth-1, True)
            bestValue = min(bestValue, value)
        Return bestValue

```