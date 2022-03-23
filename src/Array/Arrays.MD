<h1>Array Data Structure</h1>
<ul>
    <li>One of the most fundamental data structures.</li>
    <li>Aim is to make operations as fast as possible.</li>
    <li>All items in an array are identified by an index. And index is an integer value starting with 0.</li>
    <li>Items are located next to each other in the main memory.</li>
    <li>Biggest advantage is that we can access <strong>items randomly</strong> and retrieve them in O(1) running time.</li>
</ul>
<br>
<h3>Array Advantages</h3>
<ol>
    <li>Random access</li>
    <li>Easy data structure to understand and implement</li>
    <li>Fast</li>
</ol>
<br>
<h3>Array Disadvantages</h3>
<ol>
    <li>Not dynamic</li>
    <li>When data structure is full, we have to resize it and it takes O(n) running time</li>
    <li>Cannot store items of different data types</li>
</ol>
<br>
<h3>Array Operations</h3>
<ol>
    <li>Adding items - O(1) running time</li>
    <li>Adding items to arbitrary positions : O(n) - Because items have to be shifted</li>
    <li>Deleting items - O(1) running time</li>
    <li>Deleting items from arbitrary positions : O(n) for searching the item + O(1) for deleting the item + O(n) for shifting the items</li>
    <li>Updating items at index n</li>
</ol>
