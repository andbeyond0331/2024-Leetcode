<h2><a href="https://leetcode.com/problems/running-sum-of-1d-array/">1480. Running Sum of 1d Array</a></h2><h3>Easy</h3><hr><div><p><font papago-translate="cached" papago-id="14">Given an array </font><code>nums</code><font papago-translate="cached" papago-id="15">. We define a running sum of an array as&nbsp;</font><code>runningSum[i] = sum(nums[0]…nums[i])</code><font papago-translate="cached" papago-id="16">.</font></p>

<p><font papago-translate="cached" papago-id="17">Return the running sum of </font><code>nums</code><font papago-translate="cached" papago-id="18">.</font></p>

<p>&nbsp;</p>
<p><strong class="example" papago-id="19" papago-translate="translated">Example 1:</strong></p>

<pre papago-id="20" papago-translate="cached"><strong papago-id="20-0">Input:</strong> nums = [1,2,3,4]
<strong papago-id="20-2">Output:</strong> [1,3,6,10]
<strong papago-id="20-4">Explanation:</strong> Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].</pre>

<p><strong class="example" papago-id="21" papago-translate="translated">Example 2:</strong></p>

<pre papago-id="22" papago-translate="cached"><strong papago-id="22-0">Input:</strong> nums = [1,1,1,1,1]
<strong papago-id="22-2">Output:</strong> [1,2,3,4,5]
<strong papago-id="22-4">Explanation:</strong> Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].</pre>

<p><strong class="example" papago-id="23" papago-translate="translated">Example 3:</strong></p>

<pre papago-id="24" papago-translate="cached"><strong papago-id="24-0">Input:</strong> nums = [3,1,2,10,1]
<strong papago-id="24-2">Output:</strong> [3,4,6,16,17]
</pre>

<p>&nbsp;</p>
<p><strong papago-id="25" papago-translate="translated">Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>-10^6&nbsp;&lt;= nums[i] &lt;=&nbsp;10^6</code></li>
</ul>
</div>