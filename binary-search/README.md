<h2>  Binary Search</h2><hr><div><p><font papago-translate="splitted">Given an array of integers </font><code>nums</code><font papago-translate="splitted"> which is sorted in ascending order, and an integer </font><code>target</code><font papago-translate="splitted">, write a function to search </font><code>target</code><font papago-translate="splitted"> in </font><code>nums</code><font papago-translate="splitted">. If </font><code>target</code><font papago-translate="splitted"> exists, then return its index. Otherwise, return </font><code>-1</code><font papago-translate="splitted">.</font></p>

<p><font papago-translate="splitted">You must write an algorithm with </font><code>O(log n)</code><font papago-translate="splitted"> runtime complexity.</font></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 9
<strong>Output:</strong> 4
<strong>Explanation:</strong> 9 exists in nums and its index is 4
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong> 2 does not exist in nums so return -1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt; nums[i], target &lt; 10<sup>4</sup></code></li>
	<li><font papago-translate="splitted">All the integers in </font><code>nums</code></li>
	<li><code>nums</code><font papago-translate="splitted"> is sorted in ascending order.</font></li>
</ul>
</div>