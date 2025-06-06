# 1561. 你可以获得的最大硬币数目 [难度分: 1405.58]

<p>有 3n 堆数目不一的硬币，你和你的朋友们打算按以下方式分硬币：</p>

<ul>
	<li>每一轮中，你将会选出 <strong>任意</strong> 3 堆硬币（不一定连续）。</li>
	<li>Alice 将会取走硬币数量最多的那一堆。</li>
	<li>你将会取走硬币数量第二多的那一堆。</li>
	<li>Bob 将会取走最后一堆。</li>
	<li>重复这个过程，直到没有更多硬币。</li>
</ul>

<p>给你一个整数数组 <code>piles</code> ，其中 <code>piles[i]</code> 是第 <code>i</code> 堆中硬币的数目。</p>

<p>返回你可以获得的最大硬币数目。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>piles = [2,4,1,2,7,8]
<strong>输出：</strong>9
<strong>解释：</strong>选出 (2, 7, 8) ，Alice 取走 8 枚硬币的那堆，你取走 <strong>7</strong> 枚硬币的那堆，Bob 取走最后一堆。
选出 (1, 2, 4) , Alice 取走 4 枚硬币的那堆，你取走 <strong>2</strong> 枚硬币的那堆，Bob 取走最后一堆。
你可以获得的最大硬币数目：7 + 2 = 9.
考虑另外一种情况，如果选出的是 (1, <strong>2</strong>, 8) 和 (2, <strong>4</strong>, 7) ，你就只能得到 2 + 4 = 6 枚硬币，这不是最优解。
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入：</strong>piles = [2,4,5]
<strong>输出：</strong>4
</pre>

<p><strong>示例 3：</strong></p>

<pre><strong>输入：</strong>piles = [9,8,7,6,5,1,2,3,4]
<strong>输出：</strong>18
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>3 &lt;= piles.length &lt;= 10^5</code></li>
	<li><code>piles.length % 3 == 0</code></li>
	<li><code>1 &lt;= piles[i] &lt;= 10^4</code></li>
</ul>
