<h1>Linked Lists</h1>
<ul>
    <li>Every node stores data and a reference to the next node</li>
    <li>Linked lists need more memory than arrays</li>
    <li>No holes in the data structure as there is no need for shifting items</li>
    <li>Has O(N) linear running time for arbitrary searches</li>
</ul>
<h3>Advantages</h3>
<ul>
    <li>Easy to implement</li>
    <li>We can implement complex data structures with LLs</li>
    <li>We can insert/delete items at the beginning of the list in O(1) running time</li>
    <li>Linked lists are dynamic. They can acquire memory at run-time</li>
    <li>No need to resize</li>
    <li>Can store different sized items</li>
</ul>
<h3>Disadvantages</h3>
<ul>
    <li>No random indexing as data is not stored next to each other in memory</li>
    <li>Inserting an item at the end is slow. It is O(N) running time</li>
    <li>Needs more memory to store references</li>
    <li>Cannot go backwards</li>
</ul>

<h4>Note</h4>
In Java, Linked Lists have a reference to the last node.
Which means, inserting and deleting items at the end of the list
is also O(1) as we do not have to linearly search for the last element.


    
