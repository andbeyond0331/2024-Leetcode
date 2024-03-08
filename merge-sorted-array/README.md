<h2>  Merge Sorted Array</h2><hr><div><p><font papago-translate="cached" papago-id="31">You are given two integer arrays </font><code>nums1</code><font papago-translate="cached" papago-id="32"> and </font><code>nums2</code><code>m</code><font papago-translate="cached" papago-id="34"> and </font><code>n</code><font papago-translate="cached" papago-id="35">, representing the number of elements in </font><code>nums1</code><font papago-translate="cached" papago-id="36"> and </font><code>nums2</code><font papago-translate="cached" papago-id="37"> respectively.</font></p>

<p><font papago-translate="splited"><strong papago-id="8" papago-translate="translated">Merge</strong></font> <code>nums1</code><font papago-translate="cached" papago-id="38"> and </font><code>nums2</code></p>

<p><code>nums1</code><font papago-translate="cached" papago-id="41">. To accommodate this, </font><code>nums1</code><font papago-translate="cached" papago-id="42"> has a length of </font><code>m + n</code><font papago-translate="cached" papago-id="43">, where the first </font><code>m</code><font papago-translate="cached" papago-id="44"> elements denote the elements that should be merged, and the last </font><code>n</code><font papago-translate="cached" papago-id="45"> elements are set to </font><code>0</code><font papago-translate="cached" papago-id="46"> and should be ignored. </font><code>nums2</code><font papago-translate="cached" papago-id="47"> has a length of </font><code>n</code><font papago-translate="cached" papago-id="48">.</font></p>

<p>&nbsp;</p>
<p><strong class="example" papago-id="49" papago-translate="translated">Example 1:</strong></p>

<pre papago-id="50" papago-translate="cached"><strong papago-id="50-0">Input:</strong> nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
<strong papago-id="50-2">Output:</strong> [1,2,2,3,5,6]
<strong papago-id="50-4">Explanation:</strong> The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [<u papago-id="50-6">1</u>,<u papago-id="50-8">2</u>,2,<u papago-id="50-10">3</u>,5,6] with the underlined elements coming from nums1.
</pre>

<p><strong class="example" papago-id="51" papago-translate="translated">Example 2:</strong></p>

<pre papago-id="52" papago-translate="cached"><strong papago-id="52-0">Input:</strong> nums1 = [1], m = 1, nums2 = [], n = 0
<strong papago-id="52-2">Output:</strong> [1]
<strong papago-id="52-4">Explanation:</strong> The arrays we are merging are [1] and [].
The result of the merge is [1].
</pre>

<p><strong class="example" papago-id="53" papago-translate="translated">Example 3:</strong></p>

<pre papago-id="54" papago-translate="cached"><strong papago-id="54-0">Input:</strong> nums1 = [0], m = 0, nums2 = [1], n = 1
<strong papago-id="54-2">Output:</strong> [1]
<strong papago-id="54-4">Explanation:</strong> The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>nums1.length == m + n</code></li>
	<li><code>nums2.length == n</code></li>
	<li><code>0 &lt;= m, n &lt;= 200</code></li>
	<li><code>1 &lt;= m + n &lt;= 200</code></li>
	<li><code>-10<sup>9</sup> &lt;= nums1[i], nums2[j] &lt;= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><font papago-translate="cached" papago-id="20"><strong papago-id="20-0">Follow up: </strong>Can you come up with an algorithm that runs in </font><code>O(m + n)</code><font papago-translate="translated" papago-id="21"> time?</font></p>
</div>