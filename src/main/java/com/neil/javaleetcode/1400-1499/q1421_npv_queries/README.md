# [1421. 净现值查询](https://leetcode-cn.com/problems/npv-queries)

[English Version](/solution/1400-1499/1421.NPV%20Queries/README_EN.md)

## 题目描述

<!-- 这里写题目描述 -->

<p>表: <code>NPV</code></p>

<pre>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| year          | int     |
| npv           | int     |
+---------------+---------+
(id, year) 是该表主键.
该表有每一笔存货的年份, id 和对应净现值的信息.
</pre>

<p>&nbsp;</p>

<p>表: <code>Queries</code></p>

<pre>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| year          | int     |
+---------------+---------+
(id, year) 是该表主键.
该表有每一次查询所对应存货的 id 和年份的信息.
</pre>

<p>&nbsp;</p>

<p>写一个 SQL,&nbsp;找到 Queries&nbsp;表中每一次查询的净现值.</p>

<p>结果表没有顺序要求.</p>

<p>查询结果的格式如下所示:</p>

<pre>NPV 表:
+------+--------+--------+
| id   | year   | npv    |
+------+--------+--------+
| 1    | 2018   | 100    |
| 7    | 2020   | 30     |
| 13   | 2019   | 40     |
| 1    | 2019   | 113    |
| 2    | 2008   | 121    |
| 3    | 2009   | 12     |
| 11   | 2020   | 99     |
| 7    | 2019   | 0      |
+------+--------+--------+

Queries 表:
+------+--------+
| id   | year   |
+------+--------+
| 1    | 2019   |
| 2    | 2008   |
| 3    | 2009   |
| 7    | 2018   |
| 7    | 2019   |
| 7    | 2020   |
| 13   | 2019   |
+------+--------+

结果表:
+------+--------+--------+
| id   | year   | npv    |
+------+--------+--------+
| 1    | 2019   | 113    |
| 2    | 2008   | 121    |
| 3    | 2009   | 12     |
| 7    | 2018   | 0      |
| 7    | 2019   | 0      |
| 7    | 2020   | 30     |
| 13   | 2019   | 40     |
+------+--------+--------+

(7, 2018)的净现值不在 NPV 表中, 我们把它看作是 0.
所有其它查询的净现值都能在 NPV 表中找到.
</pre>

## 解法

<!-- 这里可写通用的实现逻辑 -->

<!-- tabs:start -->

### **SQL**

```sql

```

<!-- tabs:end -->